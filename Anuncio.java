import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;

class Anuncio extends JFrame{

	//declaracion de objetos
	JPanel panel;
	JLabel lblTexto1;
	JLabel lblTexto2;
	JLabel lblTexto3;
	JLabel lblTexto4;
	JLabel lblTexto5;
	JLabel lblTexto6;

 	Font fuente1;


	public Anuncio()
	{
		//creacion de objetos iniciales
		
		fuente1 = new Font("Bernard MT Condensed", 15, 40);
		panel = new JPanel();
		panel.setLayout(null);
		lblTexto1 = new JLabel("INSTRUCCIONES");
		lblTexto1.setBounds(190, 20, 300, 40);//(x, y, w, h)
		lblTexto1.setFont(fuente1);
		lblTexto1.setForeground(Color.WHITE);

		lblTexto2 = new JLabel("Pepe, el internista perdi\u00f3 la noche anterior los corazones para las cirugias de hoy.");
		lblTexto2.setBounds(50, 30, 800, 120);//(x, y, w, h)
		lblTexto2.setForeground(Color.WHITE);

		lblTexto3 = new JLabel ("Ayudale a encontrarlos antes de que su jefe lo descubra,cuidado con los \u00e1rboles ");
		lblTexto3.setBounds(50, 45, 800, 120);//(x, y, w, h)
		lblTexto3.setForeground(Color.WHITE);

		lblTexto4 = new JLabel("y la hiedra venesosa, de lo contrario sus pacientes moriran ");
		lblTexto4.setBounds(50, 60, 800, 120);//(x, y, w, h)
		lblTexto4.setForeground(Color.WHITE);

		lblTexto5 = new JLabel("*Usa las flechas del teclado para moverte ");
		lblTexto5.setBounds(50, 85, 800, 120);//(x, y, w, h)
		lblTexto5.setForeground(Color.WHITE);

		lblTexto6 = new JLabel("*Puntos= corazones recolectados. ");
		lblTexto6.setBounds(50, 105, 800, 120);//(x, y, w, h)
		lblTexto6.setForeground(Color.WHITE);
	
		//Se agregan los objetos al panel
		panel.add(lblTexto1);
		panel.add(lblTexto2);
		panel.add(lblTexto3);
		panel.add(lblTexto4);
		panel.add(lblTexto5);
		panel.add(lblTexto6);
		panel.setBackground(Color.BLUE);



		/* agregar panel a la ventana y los valores iniciales de la ventana */
		this.add(panel);
		this.setTitle("Instrucciones");
		this.setSize(630, 250);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	
		
	}


}

