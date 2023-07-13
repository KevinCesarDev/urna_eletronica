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

public class Presidente {

    public void lula(JLabel labNome, JLabel labPartido,JLabel fotoCand) {
        labNome.setText("Lula");
        labPartido.setText("PT");
        fotoCand.setVisible(true);
    }

    public void jair(JLabel labNome, JLabel labPartido,JLabel fotoCand) {
        labNome.setText("Jair Bosonaro");
        labPartido.setText("PL");
        fotoCand.setVisible(true);
    }

    public void ciro(JLabel labNome, JLabel labPartido,JLabel fotoCand) {
        labNome.setText("Ciro Gomes");
        labPartido.setText("PDT");
        fotoCand.setVisible(true);
    }

}
