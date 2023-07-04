/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.urna_eletronica;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author kevin
 */
public class Votos {

    ArrayList<Eleitor> Eleitores = new ArrayList();

    public class Eleitor {

        String nome;
        String votoSen;
        String votoGov;
        String votoPres;

        public Eleitor(String nome, String votoSen, String votoGov, String votoPres) {
            this.nome = nome;
            this.votoSen = votoSen;
            this.votoGov = votoGov;
            this.votoPres = votoPres;
        }

    }

    public void NovoEleitor(String nome,String votoSen,String votoGov,String votoPres) {
        
        this.Eleitores.add(new Eleitor(nome, votoSen, votoGov, votoPres));
    }
    
    public void GuardarVoto(JTextField nomeEleitor, JLabel labCargo, JLabel labNome, String nome,String votoSen,String votoGov,String votoPres){
        nome = nomeEleitor.getText();
        
        switch (labCargo.getText()) {
            case "Senador":
                votoSen = labNome.getText();
                break;
            case "Governador":
                votoGov = labNome.getText();
                break;
            case "Presidente":
                votoPres = labNome.getText();
                break;
            default:
                break;
        }
    } 
}
