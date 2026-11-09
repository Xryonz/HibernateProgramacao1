/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testedehibernate;

/**
 *
 * @author aluno
 */
public class AutoTanque extends Viatura {
    @PrimaryKeyJoinColumn(name="id")
    private Integer id;
    @Column(name="aut_litragem", unique = false, nullable = false)
    private Float litragem;

    public AutoTanque() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getLitragem() {
        return litragem;
    }

    public void setLitragem(Float litragem) {
        this.litragem = litragem;
    }
    
    
}
