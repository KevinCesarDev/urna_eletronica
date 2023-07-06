/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.urna_eletronica;

import java.util.List;

/**
 *
 * @author kevin
 */
public class Eleitor {
    String titulo;
    String nome;
    String votoSen;
    String votoGov;
    String votoPres;

    public Eleitor(String titulo,String nome, String votoSen, String votoGov, String votoPres) {
        this.titulo = titulo;
        this.nome = nome;
        this.votoSen = votoSen;
        this.votoGov = votoGov;
        this.votoPres = votoPres;
    }

}
