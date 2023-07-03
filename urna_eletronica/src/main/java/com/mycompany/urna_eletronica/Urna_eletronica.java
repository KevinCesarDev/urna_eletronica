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
    Presidente candidatoPres = new Presidente();

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
        } else if (contOrdem == 1) {
            labCargo.setText("Governador");
            if (num1.getText().equals("")) {
                num1.setText(botao.getText());
            } else if (num2.getText().equals("")) {
                num2.setText(botao.getText());
            }
        } else if (contOrdem == 2) {
            labCargo.setText("Presidente");
            if (num1.getText().equals("")) {
                num1.setText(botao.getText());
            } else if (num2.getText().equals("")) {
                num2.setText(botao.getText());
            }
        }
    }

    public void exibirCadidato(JTextField num1, JTextField num2, JTextField num3, int contOrdem, JLabel labNome, JLabel nomeCandidato, JLabel labPartido, JLabel partido) {
        if (contOrdem == 0) {
            numCandidato = (num1.getText()) + (num2.getText()) + (num3.getText());

            switch (numCandidato) {
                case "111":
                    candidatoSen.otto(labNome, labPartido);
                    break;
                default:
                    if (!(num3.getText().equals(""))) {
                        nomeCandidato.setVisible(false);
                        partido.setVisible(false);
                        labNome.setText("");
                        labPartido.setText("VOTO NULO");
                    }
            }
        } else if (contOrdem == 1) {
            numCandidato = (num1.getText()) + (num2.getText());

            switch (numCandidato) {
                case "13":
                    candidatoGov.jeronimo(labNome, labPartido);
                    break;
                default:
                    if (!(num2.getText().equals(""))) {
                        nomeCandidato.setVisible(false);
                        partido.setVisible(false);
                        labNome.setText("");
                        labPartido.setText("VOTO NULO");
                    }
            }
        } else if (contOrdem == 2) {
            numCandidato = (num1.getText()) + (num2.getText());

            switch (numCandidato) {
                case "13":
                    candidatoPres.lula(labNome, labPartido);
                    break;
                case "22":
                    candidatoPres.jair(labNome, labPartido);
                    break;
                default:
                    if (!(num2.getText().equals(""))) {
                        nomeCandidato.setVisible(false);
                        partido.setVisible(false);

                        labNome.setText("");
                        labPartido.setText("VOTO NULO");
                    }
            }

        }
    }

    public void quantNum(int contOrdem, JTextField num) {
        if (contOrdem > 0) {
            num.setEnabled(false);
        }
    }

    public void limpar(JTextField num1, JTextField num2, JTextField num3, JLabel labNome, JLabel nomeCandidato, JLabel labPartido, JLabel partido) {
        num1.setText("");
        num2.setText("");
        num3.setText("");
        labNome.setText("");
        labPartido.setText("");

        nomeCandidato.setVisible(true);
        partido.setVisible(true);
    }

    public void finalizar(JLabel labSeuVoto, JLabel labCargo, JLabel numero, JLabel nomeCanditato, JLabel partido, JTextArea instrucVoto, JTextField num1, JTextField num2, JTextField num3, JLabel labNome, JLabel labPartido) {
        labSeuVoto.setVisible(false);
        labCargo.setVisible(false);
        numero.setVisible(false);
        nomeCanditato.setVisible(false);
        partido.setVisible(false);
        instrucVoto.setVisible(false);
        num1.setVisible(false);
        num2.setVisible(false);
        num3.setVisible(false);

        num1.setText("");
        num2.setText("");
        num3.setText("");
        labNome.setText("");
        labPartido.setText("");
    }
}
