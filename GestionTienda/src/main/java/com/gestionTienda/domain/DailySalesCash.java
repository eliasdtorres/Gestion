


package com.gestionTienda.domain;

import java.sql.Date;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Table(name="daily_sales_cash")
public class DailySalesCash {
    
    
    private static final Long serialVersionUID=1L;
    
    @Id
    @Getter
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long idSalesCash;
    
    @NotNull
    @Column(name = "date")
    private Date date;
    
    @Column(name="sales_quantity")
    private int salesQuantity;
    
    @Column(name="tot_cash")
    private double totCash;
    
    @Column(name="tot_credit")
    private double totCredit;
    
    @Column(name="tot_debit")
    private double totDebit;
    
    @Column(name="tot_tansf")
    private double totTransf;
    
    @NotEmpty
    @Column(name="tot_sales")
    private String totSales;
    
    @Column(name="liablilities")
    private double liabilities;
    
    @Column(name="daily_box")
    private String dailyBox;
    
    @Column(name="cost_box")
    private String costBox;
    
    

}
