/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.urna_eletronica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author kevin
 */
public class Senador{
    public void caca(JLabel labNome, JLabel labPartido,JLabel fotoCand) {
        labNome.setText("Cacá Leão");  
        labPartido.setText("PP"); 
        fotoCand.setVisible(true);
        ImageIcon foto = new ImageIcon("src/imagens/senador111.jpg");
        //linha abaixo redimenciona a imagem
        //foto.setImage(foto.getImage().getScaledInstance(fotoCand.getWidth(), fotoCand.getHeight(), 1));
        fotoCand.setIcon(foto);
    }
        public void otto(JLabel labNome, JLabel labPartido,JLabel fotoCand) {
        labNome.setText("Otto Alencar");  
        labPartido.setText("PDS"); 
    }
}
