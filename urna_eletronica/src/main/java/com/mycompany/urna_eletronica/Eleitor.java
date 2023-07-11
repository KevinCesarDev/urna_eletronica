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
    private String titulo;
    private String nome;
    private String votoSen;
    private String votoGov;
    private String votoPres;

    public Eleitor(String titulo,String nome, String votoSen, String votoGov, String votoPres) {
        this.titulo = titulo;
        this.nome = nome;
        this.votoSen = votoSen;
        this.votoGov = votoGov;
        this.votoPres = votoPres;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the votoSen
     */
    public String getVotoSen() {
        return votoSen;
    }

    /**
     * @param votoSen the votoSen to set
     */
    public void setVotoSen(String votoSen) {
        this.votoSen = votoSen;
    }

    /**
     * @return the votoGov
     */
    public String getVotoGov() {
        return votoGov;
    }

    /**
     * @param votoGov the votoGov to set
     */
    public void setVotoGov(String votoGov) {
        this.votoGov = votoGov;
    }

    /**
     * @return the votoPres
     */
    public String getVotoPres() {
        return votoPres;
    }

    /**
     * @param votoPres the votoPres to set
     */
    public void setVotoPres(String votoPres) {
        this.votoPres = votoPres;
    }

}
