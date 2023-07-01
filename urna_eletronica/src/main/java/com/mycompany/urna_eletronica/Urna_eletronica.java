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
    Senador candidato = new Senador();
    
    
    public void digNum(JTextField num1, JTextField num2, JTextField num3, JButton botao, int contOrdem) {
        if (contOrdem == 1) {
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

    public void exibirCadidato(JTextField num1, JTextField num2, JTextField num3, int contOrdem, JLabel cargo, JLabel labNome, JLabel labPartido) {
        if (contOrdem == 0) {
            numCandidato = (num1.getText()) + (num2.getText()) + (num3.getText());
            cargo.setText("Senador");

            switch (numCandidato) {
                case "111":
                    candidato.otto(labNome, labPartido);
                    break;
            }
        }
    }

    public void quantNum(int contOrdem, JTextField num) {
        if (contOrdem > 1) {
            num.setEnabled(false);
        }
    }
}
