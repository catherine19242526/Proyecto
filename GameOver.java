import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.net.*;

public class GameOver extends JFrame {

	public Image imagenFondo;
	public URL fondo;


	public GameOver()
	{
		this.setBounds(0,0,1200, 700);
		this.setTitle("GAME OVER");
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);

		fondo = this.getClass().getResource("imagenes1/gameOver.jpg");
		imagenFondo = new ImageIcon(fondo).getImage();

		Container contenedor = getContentPane();
		
		contenedor.add(panel);

	}

	public JPanel panel = new JPanel()
	{
	public void paintComponent(Graphics g)
		{
			g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
		}
};

}