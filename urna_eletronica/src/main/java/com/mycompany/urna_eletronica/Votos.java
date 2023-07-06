/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.urna_eletronica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author kevin
 */
public class Votos {

     private List<Eleitor> eleitor;
    
//    public void GuardarVoto(JTextField nomeEleitor, JLabel labCargo, JLabel labNome, String nome,String votoSen,String votoGov,String votoPres){
//        nome = nomeEleitor.getText();
//        
//        switch (labCargo.getText()) {
//            case "Senador":
//                votoSen = labNome.getText();
//                break;
//            case "Governador":
//                votoGov = labNome.getText();
//                break;
//            case "Presidente":
//                votoPres = labNome.getText();
//                break;
//            default:
//                break;
//        }
//    } 

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
}
