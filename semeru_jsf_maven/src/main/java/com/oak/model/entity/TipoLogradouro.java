
package com.oak.model.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;


@Entity
@Table(name="tipologradouro")
public class TipoLogradouro implements Serializable  {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="IdTipoLogradouro")
    private Integer idTipoLogradouro;
    
    @Column(name="Nome", nullable=false, length=80)
    private String Nome;

    @OneToMany
    @ForeignKey(name="TipoLogradouroEndereco")
    List<Endereco> enderecos;
    public TipoLogradouro() {
    }

    public Integer getIdTipoLogradouro() {
        return idTipoLogradouro;
    }

    public void setIdTipoLogradouro(Integer idTipoLogradouro) {
        this.idTipoLogradouro = idTipoLogradouro;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.idTipoLogradouro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoLogradouro other = (TipoLogradouro) obj;
        if (!Objects.equals(this.idTipoLogradouro, other.idTipoLogradouro)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
