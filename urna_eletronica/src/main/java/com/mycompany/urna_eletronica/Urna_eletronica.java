/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.urna_eletronica;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    String voto = "";
    boolean validarConfirmar;

    public void digNum(JTextField num1, JTextField num2, JTextField num3, JButton botao, int contOrdem, JLabel labCargo, JTextField nomeEleitor, JLabel labNome) {
        if (contOrdem == 0) {
            if (nomeEleitor.getText().equals("")) {
                nomeEleitor.setText(botao.getText());
            } else {
                nomeEleitor.setText(nomeEleitor.getText() + botao.getText());
            }
        } else if (contOrdem == 1 && (!(labNome.getText().equals("VOTO BRANCO")))) {
            //labCargo.setText("Senador");

            if (num1.getText().equals("")) {
                num1.setText(botao.getText());
            } else if (num2.getText().equals("")) {
                num2.setText(botao.getText());
            } else if (num3.getText().equals("")) {
                num3.setText(botao.getText());
            }
        } else if (contOrdem == 2 && (!(labNome.getText().equals("VOTO BRANCO")))) {
            //labCargo.setText("Governador");
            if (num1.getText().equals("")) {
                num1.setText(botao.getText());
            } else if (num2.getText().equals("")) {
                num2.setText(botao.getText());
            }
        } else if (contOrdem == 3 && (!(labNome.getText().equals("VOTO BRANCO")))) {
            //labCargo.setText("Presidente");
            if (num1.getText().equals("")) {
                num1.setText(botao.getText());
            } else if (num2.getText().equals("")) {
                num2.setText(botao.getText());
            }
        }
    }

    public void TelaCargo(JLabel labCargo, int contOrdem) {
        switch (contOrdem) {
            case 1:
                labCargo.setText("Senador");
                break;
            case 2:
                labCargo.setText("Governador");
                break;
            case 3:
                labCargo.setText("Presidente");
                break;
            default:
                labCargo.setText("");
                break;
        }
    }

    public boolean exibirCadidato(JTextField num1, JTextField num2, JTextField num3, int contOrdem, JLabel labNome, JLabel nomeCandidato, JLabel labPartido, JLabel partido, JLabel fotoCand, JTextArea instrucVoto, JLabel numero) {
        
        numero.setVisible(false);
        nomeCandidato.setVisible(false);
        partido.setVisible(false);
        validarConfirmar = false;
        
        if (contOrdem == 1) {
            instrucVoto.setText("Aperte a Tecla: \n    CONFIRMAR para CONFIRMAR este voto\n    CORRIGE para REINICIAR este voto");
            numCandidato = (num1.getText()) + (num2.getText()) + (num3.getText());

            switch (numCandidato) {
                case "111":
                    candidatoSen.caca(labNome, labPartido, fotoCand);
                    instrucVoto.setVisible(true);
                    numero.setVisible(true);
                    nomeCandidato.setVisible(true);
                    partido.setVisible(true);
                    validarConfirmar = true;
                    break;
                case "333":
                    candidatoSen.otto(labNome, labPartido, fotoCand);
                    instrucVoto.setVisible(true);
                    numero.setVisible(true);
                    nomeCandidato.setVisible(true);
                    partido.setVisible(true);
                    validarConfirmar = true;
                    break;
                default:
                    if (!(num3.getText().equals(""))) {
                        instrucVoto.setVisible(true);
                        nomeCandidato.setVisible(true);
                        nomeCandidato.setText("NÚMERO ERRADO:");
                        partido.setVisible(false);
                        labNome.setText("VOTO NULO");
                        labPartido.setText("");
                        validarConfirmar = true;

                    }
            }
        } else if (contOrdem == 2) {
            numCandidato = (num1.getText()) + (num2.getText());

            switch (numCandidato) {
                case "13":
                    candidatoGov.jeronimo(labNome, labPartido, fotoCand);
                    instrucVoto.setVisible(true);
                    numero.setVisible(true);
                    nomeCandidato.setVisible(true);
                    partido.setVisible(true);
                    validarConfirmar = true;
                    break;
                case "44":
                    candidatoGov.netinho(labNome, labPartido, fotoCand);
                    instrucVoto.setVisible(true);
                    numero.setVisible(true);
                    nomeCandidato.setVisible(true);
                    partido.setVisible(true);
                    validarConfirmar=true;
                    break;
                default:
                    if (!(num2.getText().equals(""))) {
                        instrucVoto.setVisible(true);
                        nomeCandidato.setVisible(true);
                        nomeCandidato.setText("NÚMERO ERRADO:");
                        partido.setVisible(false);
                        labNome.setText("VOTO NULO");
                        labPartido.setText("");
                        validarConfirmar=true;
                    }
            }
        } else if (contOrdem == 3) {
            numCandidato = (num1.getText()) + (num2.getText());

            switch (numCandidato) {
                case "12":
                    candidatoPres.ciro(labNome, labPartido, fotoCand);
                    instrucVoto.setVisible(true);
                    numero.setVisible(true);
                    nomeCandidato.setVisible(true);
                    partido.setVisible(true);
                    validarConfirmar=true;
                    break;
                case "13":
                    candidatoPres.lula(labNome, labPartido, fotoCand);
                    instrucVoto.setVisible(true);
                    numero.setVisible(true);
                    nomeCandidato.setVisible(true);
                    partido.setVisible(true);
                    validarConfirmar=true;
                    break;
                case "22":
                    candidatoPres.jair(labNome, labPartido, fotoCand);
                    instrucVoto.setVisible(true);
                    numero.setVisible(true);
                    nomeCandidato.setVisible(true);
                    partido.setVisible(true);
                    validarConfirmar=true;
                    break;
                default:
                    if (!(num2.getText().equals(""))) {
                        instrucVoto.setVisible(true);
                        nomeCandidato.setVisible(true);
                        nomeCandidato.setText("NÚMERO ERRADO:");
                        partido.setVisible(false);
                        labNome.setText("VOTO NULO");
                        labPartido.setText("");
                        validarConfirmar=true;
                    }
            }

        }
        ImageIcon foto = new ImageIcon(new ImageIcon("C:/Users/Suricato Furtivo/Documents/urna_eletronica/urna_eletronica/src/main/java/imagens/" + labNome.getText() + ".jpg").getImage().getScaledInstance(200, 220, Image.SCALE_DEFAULT));
        fotoCand.setIcon(foto);
        
        if(contOrdem == 0){
            validarConfirmar = true;
        }
        return validarConfirmar;
    }

    public void quantNum(int contOrdem, JTextField num) {
        if (contOrdem > 0) {
            num.setEnabled(false);
        } else {
            num.setEnabled(true);
        }
    }

    public void limpar(JLabel numero, JTextField num1, JTextField num2, JTextField num3, JLabel labNome, JLabel nomeCandidato, JLabel labPartido, JLabel partido, JLabel fotoCand, JTextArea instrucVoto) {
        fotoCand.setVisible(false);
        fotoCand.removeAll();

        num1.setText("");
        num2.setText("");
        num3.setText("");
        labNome.setText("");
        labPartido.setText("");
        nomeCandidato.setText("Nome:");

        numero.setVisible(false);
        nomeCandidato.setVisible(false);
        partido.setVisible(false);
        labPartido.setVisible(true);
        instrucVoto.setVisible(false);

        num1.setVisible(true);
        num2.setVisible(true);
        num3.setVisible(true);

    }

    public int finalizar(JLabel labSeuVoto, JLabel labCargo, JLabel numero, JLabel nomeCandidato, JLabel partido, JTextArea instrucVoto, JTextField num1, JTextField num2, JTextField num3, JLabel labNome, JLabel labPartido, JTextField nomeEleitor, JLabel labEleitor, JLabel fotoCand) {
        labSeuVoto.setVisible(false);
        labCargo.setVisible(false);
        numero.setVisible(false);
        nomeCandidato.setVisible(false);
        partido.setVisible(false);
        instrucVoto.setVisible(false);
        num1.setVisible(false);
        num2.setVisible(false);
        num3.setVisible(false);
        labEleitor.setVisible(false);
        nomeEleitor.setVisible(false);
        fotoCand.setVisible(false);

        num1.setText("");
        num2.setText("");
        num3.setText("");
        labNome.setText("");
        labPartido.setText("");
        nomeEleitor.setText("");
        labCargo.setText("");
        fotoCand.removeAll();

        return 0;
    }

    public void Iniciar(JLabel labSeuVoto, JLabel labCargo, JLabel numero, JLabel nomeCanditato, JLabel partido, JTextArea instrucVoto, JTextField num1, JTextField num2, JTextField num3, JLabel labNome, JLabel labPartido, JTextField nomeEleitor, JLabel labEleitor, JButton confirmar, JLabel fotoCand) {

        labSeuVoto.setVisible(false);
        labCargo.setVisible(false);
        numero.setVisible(false);
        nomeCanditato.setVisible(false);
        partido.setVisible(false);
        instrucVoto.setVisible(true);
        num1.setVisible(false);
        num2.setVisible(false);
        num3.setVisible(false);
        labNome.setVisible(false);
        labPartido.setVisible(false);
        fotoCand.setVisible(false);

        //começar um novo voto 
        nomeEleitor.setVisible(true);
        nomeEleitor.setEnabled(true);
        labEleitor.setVisible(true);

        num1.setText("");
        num2.setText("");
        num3.setText("");
        labNome.setText("");
        labPartido.setText("");
        labCargo.setText("");
        nomeEleitor.setText("");
        fotoCand.removeAll();
        instrucVoto.setText("Aperte a Tecla:\n    CONFIRMAR para VALIDAR o eletor");

    }

    public void IniciarVotacao(JLabel labSeuVoto, JLabel labCargo, JLabel numero, JLabel nomeCanditato, JLabel partido, JTextArea instrucVoto, JTextField num1, JTextField num2, JTextField num3, JLabel labNome, JLabel labPartido, JTextField nomeEleitor, JButton confirmar, int contOrdem) {
        if (contOrdem == 1) {
            labSeuVoto.setVisible(true);
            labCargo.setVisible(true);
            numero.setVisible(false);
            nomeCanditato.setVisible(false);
            partido.setVisible(false);
            instrucVoto.setVisible(false);
            num1.setVisible(true);
            num2.setVisible(true);
            num3.setVisible(true);
            labNome.setVisible(true);
            labPartido.setVisible(true);

            nomeEleitor.setEnabled(false);

        }
    }

    public String GuardarCandidato(int contOrdem, JLabel labNome) {
        voto = labNome.getText();
        return voto;
    }

    public void VotoBranco(JLabel numero, JTextField num1, JTextField num2, JTextField num3, int contOrdem, JLabel labNome, JLabel nomeCandidato, JLabel labPartido, JLabel partido, JLabel fotoCand, JTextArea instrucVoto) {
        if (contOrdem > 0) {
            numero.setVisible(false);
            labPartido.setVisible(false);
            partido.setVisible(false);
            fotoCand.setVisible(false);
            instrucVoto.setVisible(true);
            num1.setVisible(false);
            num2.setVisible(false);
            num3.setVisible(false);

            labNome.setText("VOTO BRANCO");
            instrucVoto.setText("Aperte a Tecla: \n    CONFIRMAR para CONFIRMAR este voto\n    CORRIGE para REINICIAR este voto");

        }
    }

}
