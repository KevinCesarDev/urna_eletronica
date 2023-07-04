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

    public void novoEleitor(JTextField nomeEleitor, int contOrdem) {
        String nome="";
        String votoSen="";
        String votoGov="";
        String votoPres="";
        
        if ((contOrdem == 1) && (!(nomeEleitor.getText().equals("")))) {
            nome = nomeEleitor.getText();
            nomeEleitor.setEnabled(false);
        }else if(contOrdem == 2){
            
        }
        
        this.Eleitores.add(new Eleitor(nome, votoSen, votoGov, votoPres));
    }
}
