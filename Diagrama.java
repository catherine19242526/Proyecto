import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class Diagrama extends JFrame{

	/*declaracion de objetos*/
	JPanel panel;
	String ab;
 	FondoPanel fondo;
 
	public Diagrama(String ab)
	{
		//creacion del panel

		fondo = new FondoPanel(ab);
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		/* agregar panel a la ventana y valores iniciales de la ventana */
		this.add(panel);
		this.setTitle("DIAGRAMA");
		this.setSize(700, 600);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setVisible(false);
		this.setContentPane(fondo);
		this.setLocationRelativeTo(null);				
	}

}

class FondoPanel extends JPanel
{
	//declaracion de objeto
	private Image imagen;
	String a;

	public FondoPanel(String a)
	{
		this.a=a;
	}

	@Override
	public void paint (Graphics g)
	{
		//se declara la ruta de donde se obtendra la imagen de fondo
		imagen = new ImageIcon(getClass().getResource("imagenes1/"+a+".jpg")).getImage();

		//Se declaran los valores que tendra la imagen (posicion y tamaño)
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

		setOpaque(false);//metodo para que se vea la imagen
		super.paint(g);
	}
}

