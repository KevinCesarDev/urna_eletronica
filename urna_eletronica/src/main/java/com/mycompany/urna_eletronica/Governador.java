/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.urna_eletronica;

import javax.swing.JLabel;

/**
 *
 * @author IcaroEstrela
 */
public class Governador {

    String nome;
    String partido;

    public void jeronimo(JLabel labNome, JLabel labPartido,JLabel fotoCand) {
        labNome.setText("Jerônimo");
        labPartido.setText("PT");
        fotoCand.setVisible(true);
    }

    public void netinho(JLabel labNome, JLabel labPartido,JLabel fotoCand) {
        labNome.setText("ACM Neto");
        labPartido.setText("UNIÃO");
        fotoCand.setVisible(true);
    }
}
