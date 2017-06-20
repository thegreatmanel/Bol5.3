/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Boletin53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Positivos positivo=new Positivos();
       int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
       positivo.resultado(n1);
    }
    }
    

