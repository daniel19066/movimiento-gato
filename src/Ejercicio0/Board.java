/*
PLANTILLA BASE PARA CREACION DE ESCENARIOS.
 */
package Ejercicio0;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {
    
    int xr;
    int yr;
    private Timer timer;
    
    public Board (){
        this.xr =0;
        this.yr =0;
        this.timer = new Timer (10,this);
        this.timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image fondo=loadImage("fondo.png");
        Image gato=loadImage("cats.gif");
        g.drawImage(fondo, 0,0, this);
        
        g.drawImage(gato, 30+(xr), 350, 162+(xr), 430, 0+yr, 0, 132+yr, 80, this);
//        g.setColor(Color.RED);
//        g.fillRect(5, yr, 40, 40);
//        g.fillOval(90, yr, 40, 40);
//        g.setColor(Color.BLACK);
//        g.drawRect(5, yr, 40, 40);
//        g.drawRect(90, yr, 40, 40);
//        g.setColor(Color.ORANGE);
//        g.fillRect(xr, 80, 50, 10);
//        int x2[] = {(xr + 10),(xr+20),(xr+30), (xr+40)};
//        int y2[] = {(80),(70),(70),(80)};
//        g.fillPolygon(x2, y2, 4);
//        g.setColor(Color.BLACK);
//        g.fillOval((xr + 10), (90), 10, 10);
//        g.fillOval((xr + 30), (90), 10, 10);
//        g.drawRect(xr, 70, 50, 30);
//        Rectangle rec = new Rectangle (5, yr, 40, 40);
//        Rectangle oval = new Rectangle (90, yr, 40, 40);
//        Rectangle carro = new Rectangle (xr, 70, 50, 30);
//        if (rec.intersects(carro)){
//            this.timer.stop();
//        }
    }

    private void dibujarEscenario(Graphics g) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.xr++;
        this.yr= yr+132;
        if(yr==132*6){this.yr=0;}
        if(xr==994){this.xr=0;}
        repaint();
    }
    public Image loadImage(String imageName){
        ImageIcon ii=new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
}