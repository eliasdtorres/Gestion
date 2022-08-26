


package com.gestionTienda.domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Table(name="sales")
public class Sale {
    
    private static final Long serialVersionUID= 1L;
    
    @Id
    @Getter
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long idSold;
    
    @NotEmpty
    @Column(name="art")
    private String art;
             
    @NotEmpty
    @Column(name="payment")
    private Enum payment;
    
    @NotEmpty
    @Column(name="sold_tot")
    private double soldTot;
             
    @NotEmpty
    @Column(name="obs")
    private String obs;
                                    
                                    
}
