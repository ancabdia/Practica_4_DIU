/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ulpgc.dis.practica4;

import java.awt.Graphics;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Andres
 */
public class Lienzo extends JPanel {

    Point[] lista = new Point[5];
    int oval = 0;
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < lista.length; i++) {
            if(lista[i] == null) break;
            if(oval == 0){
                g.fillOval((int) lista[i].getX(), (int) lista[i].getY(), 10, 10);
                try {
                    Thread.sleep(8);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                g.fillRect((int) lista[i].getX(), (int) lista[i].getY(), 10, 10);
                try {
                    Thread.sleep(8);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void addPointList(Point point, int i) {
        lista[i] = point;
    }

    void changeShape(int i) {
        oval = i;
    }

}
