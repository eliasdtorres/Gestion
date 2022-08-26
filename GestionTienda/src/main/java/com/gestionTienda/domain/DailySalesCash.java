


package com.gestionTienda.domain;

@Entity
@Data
@Table(name="daily_sales_cash")
public class DailySalesCash {
    
    
    private static final Long serialVersionUID=1L;
    
    private long idSalesCash;
    
    @NotNull
    private Date date;
    
    private int salesQuantity;
    
    private double totCash;
    
    private double totCred;
    
    private double totDebit;
    
    private double totTransf;
    
    @NotEmpty
    private String totSales;
    
    private double liabilities;
    
    private String dailyBox;
    
    private String costBox;
    
    

}
