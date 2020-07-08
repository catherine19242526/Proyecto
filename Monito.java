import javax.swing.*;
import java.awt.image.*;
import java.awt.*;
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Monito extends JPanel
{
BufferedImage imagen;

    public Monito(BufferedImage imagen)
    {
        this.imagen = imagen;
    }

    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.fillOval(5,0,90,100);
        g.drawImage(imagen,0,0,100,100,null);


    }
}