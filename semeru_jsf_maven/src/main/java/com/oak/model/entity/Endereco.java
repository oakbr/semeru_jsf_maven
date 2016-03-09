
package com.oak.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="endereco")
public class Endereco implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="IdEndereco", nullable=false)
    private Integer idEndereco;
    
    @Column(name="Bairro", nullable=false, length=80)
    private String Bairro;
    
    @Column(name="Logradouro", length=80)
    private String Logradouro;
    
    @Column(name="Cep", length=9)
    private String Cep;
    
    @Column(name="Numero", length=9)
    private Integer Numero;

    @Column(name="Complemento", length=80)
    private Integer Compelmento;
    
    
    
    
    
    
    
}
