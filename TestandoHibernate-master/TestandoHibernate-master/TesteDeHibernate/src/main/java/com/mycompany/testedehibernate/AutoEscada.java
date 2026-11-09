/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testedehibernate;

/**
 *
 * @author aluno
 */
public class AutoEscada {
    @PrimaryKeyJoinColumn(name="id")
    private Integer id;
    @Column(name="aut_altura_max", unique = false, nullable = false)
    private Integer alturaMax;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(Integer alturaMax) {
        this.alturaMax = alturaMax;
    }

    public AutoEscada() {
    }
    
    
    
}
