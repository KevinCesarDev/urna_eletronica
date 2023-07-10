/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.urna_eletronica;

import java.awt.ActiveEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author kevin
 */
public class Votos {

    private List<Eleitor> eleitor;
    boolean validado=false;

    public boolean ValidarEleitor(String eleitor, JTextField nomeEleitor) {
        //System.out.println("Dentro - "+validado);
        if ((nomeEleitor.getText()).equals(eleitor)) {
            validado = true;
        }
        return validado;
    }

    /**
     * @return the eleitor
     */
    public List<Eleitor> getEleitor() {
        return eleitor;
    }

    /**
     * @param eleitor the eleitor to set
     */
    public void setEleitor(List<Eleitor> eleitor) {
        this.eleitor = eleitor;
    }
    public void guardarVotos(){
        
    }
}
