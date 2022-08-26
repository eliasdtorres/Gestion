


package com.gestionTienda.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;

@Data
@Entity
@Table(name="product")
public class Product implements Serializable {
    
    private final static long serialVersionUID=1L;
    
    @Id
    @Getter
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_product")
    private Long idProduct;
    
    @NotEmpty
    @Column(name="art")
    private Integer art;
    
    @Column(name="description")
    private String description;
    
    @NotEmpty
    @Column(name="price")
    private double price;
    
    @NotEmpty    
    @Column(name="price_off")
    private double priceOff;
    
    @Column(name="is_off")
    private boolean isOff;
    
    @Column(name="cost")
    private double cost;
    
    @Column(name="stock")
    private int stock;
     
    @Column(name="dif_cost_price")
    private double difCostPrice;
}
