


package com.gestionTienda.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Table(name="change")
public class Change implements Serializable{
    public static final Long serialVersionUID = 1L;
    
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_change")
    private Long idChange;
    
    @NotEmpty
    @Column(name="art_in")
    private String artIn;
    
    @NotEmpty
    @Column(name="art_out")
    private String artOut;
}
