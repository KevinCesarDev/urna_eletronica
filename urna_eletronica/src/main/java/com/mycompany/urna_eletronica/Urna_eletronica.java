/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.urna_eletronica;

import javax.swing.*;

/**
 *
 * @author kevin
 */
public class Urna_eletronica {

    String numCandidato = "";
    Senador candidatoSen = new Senador();
    Governador candidatoGov = new Governador();

    public void digNum(JTextField num1, JTextField num2, JTextField num3, JButton botao, int contOrdem, JLabel labCargo) {
        if (contOrdem == 0) {
            labCargo.setText("Senador");
            
            if (num1.getText().equals("")) {
                num1.setText(botao.getText());
            } else if (num2.getText().equals("")) {
                num2.setText(botao.getText());
            } else if (num3.getText().equals("")) {
                num3.setText(botao.getText());
            }
        } else {
            if (num1.getText().equals("")) {
                num1.setText(botao.getText());
            } else if (num2.getText().equals("")) {
                num2.setText(botao.getText());
            }
        }
    }

    public void exibirCadidato(JTextField num1, JTextField num2, JTextField num3, int contOrdem, JLabel labNome, JLabel labPartido) {
        if (contOrdem == 0) {
            numCandidato = (num1.getText()) + (num2.getText()) + (num3.getText());
            
            switch (numCandidato) {
                case "111":
                    candidatoSen.otto(labNome,labPartido);
                    break;

            }
        }else if(contOrdem == 1){
            numCandidato = (num1.getText()) + (num2.getText());
            
            switch(numCandidato){
                case "13":
                    candidatoGov.jeronimo(labNome, labPartido);
            }
        }
    }

    public void quantNum(int contOrdem, JTextField num) {
        if (contOrdem > 0) {
            num.setEnabled(false);
        }
    }
    
    public void limpar(JTextField num1, JTextField num2, JTextField num3, JLabel labNome, JLabel labPartido){
       num1.setText("");
       num2.setText("");
       num3.setText("");
       labNome.setText("");
       labPartido.setText("");
    }
}
