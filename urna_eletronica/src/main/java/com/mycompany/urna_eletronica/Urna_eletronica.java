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


    public void teste(JButton a,JTextField b,JTextField c){
        if(b.getText().equals("")){
            b.setText(a.getText()); 
        }else if(c.getText().equals("")){
            c.setText(a.getText()); 
        }
    } 
}
