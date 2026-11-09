/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testedehibernate;

/**
 *
 * @author aluno
 */
public class UnidadeResgate {
    @PrimaryKeyJoinColumn(name="id")
    private Integer id;
    @Column(name="unr_capacidade", unique = false, nullable = false)
    private Integer capacidade;

    public UnidadeResgate() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }
    
    
}
