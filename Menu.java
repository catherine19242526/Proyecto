import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.net.*;

class Menu extends JFrame implements ActionListener{

 //declaracion de objetos
	
	MiReproductor mr = new MiReproductor();
	JPanel panel;
	JLabel lblTexto1;
	JLabel lblTexto2;
	JButton btnBoton1;
	JButton btnBoton2;
	JButton btnBoton3;
	JButton btnBoton4;
	JButton btnBoton5;
	JButton btnBoton6;
	JButton btnBoton7;

	ArrayList <String> contenido_1;

	Icon icon, icon2, icon3, icon4, icon5, icon6, icon7;
	Font fuente1;
	Color letras, fondo;


	public Menu()
	{
		//creacion de objetos iniciales
		 icon = new ImageIcon("imagenes1/btn1.png");
		 icon2 = new ImageIcon("imagenes1/btn2.png");
		 icon3 = new ImageIcon("imagenes1/btn3.png");
		 icon4 = new ImageIcon("imagenes1/btn4.png");
		 icon5 = new ImageIcon("imagenes1/btn5.png");
		 icon6 = new ImageIcon("imagenes1/btn6.png");
		 icon7 = new ImageIcon("imagenes1/btn7.png");
		 fuente1 = new Font("Bernard MT Condensed", 15, 60);
		 letras = new Color(0, 32, 96);
		 fondo = new Color(247, 218, 150 );

	
		panel = new JPanel();
		panel.setLayout(null);
		lblTexto1 = new JLabel("FISIOLOGIA");
		lblTexto1.setBounds(260, 180, 800, 80); //(x, y, w, h)
		lblTexto1.setFont(fuente1);
		lblTexto1.setForeground(letras);
		lblTexto2 = new JLabel("HUMANA");
		lblTexto2.setBounds(290, 240, 800, 100); //(x, y, w, h)
		lblTexto2.setFont(fuente1);
		lblTexto2.setForeground(letras);
		

		btnBoton1 = new JButton(icon);//digestion
		btnBoton1.setBounds(30, 40, 190, 90);
		btnBoton1.setForeground(Color.WHITE);
		btnBoton1.setBorder(null);
		btnBoton1.setContentAreaFilled(false);
		


		btnBoton2 = new JButton(icon6);//sanguineo
		btnBoton2.setBounds(30, 160, 190, 90);
		btnBoton2.setForeground(Color.WHITE);
		btnBoton2.setBorder(null);
		btnBoton2.setContentAreaFilled(false);

		btnBoton3 = new JButton(icon3);//hormonas
		btnBoton3.setBounds(30, 280, 180, 90);
		btnBoton3.setForeground(Color.WHITE);
		btnBoton3.setBorder(null);
		btnBoton3.setContentAreaFilled(false);

		btnBoton4 = new JButton(icon2);//intercambio de gases
		btnBoton4.setBounds(560, 40, 180, 90);
		btnBoton4.setForeground(Color.WHITE);
		btnBoton4.setBorder(null);
		btnBoton4.setContentAreaFilled(false);

		btnBoton5 = new JButton(icon4);//neuronas
		btnBoton5.setBounds(560, 280, 200, 100); 
		btnBoton5.setForeground(Color.WHITE);
		btnBoton5.setBorder(null);
		btnBoton5.setContentAreaFilled(false);

		btnBoton6 = new JButton(icon5);//reproduccion
		btnBoton6.setBounds(560, 160, 180, 90);
		btnBoton6.setForeground(Color.WHITE);
		btnBoton6.setBorder(null);
		btnBoton6.setContentAreaFilled(false);

		btnBoton7 = new JButton(icon7);//juego
		btnBoton7.setBounds(305, 390, 200, 90);
		btnBoton7.setForeground(Color.WHITE);
		btnBoton7.setBorder(null);
		btnBoton7.setContentAreaFilled(false);
		
		// se agregan los objetos al panel
		panel.add(lblTexto1);
		panel.add(btnBoton1);
		panel.add(btnBoton2);
		panel.add(btnBoton3);
		panel.add(btnBoton4);
		panel.add(btnBoton5);
		panel.add(btnBoton6);
		panel.add(btnBoton7);
		panel.add(lblTexto2);
		panel.setBackground(fondo);



		// agregamos el panel a la ventana y declaramos los valores iniciales de la ventana 
		this.add(panel);
		this.setTitle("MENU");
		this.setSize(810, 550);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		//declaramos los actionlistener para que el programa ejecute el if correspondiente al dar click en un boton
		btnBoton1.addActionListener(this);
		btnBoton2.addActionListener(this);
		btnBoton3.addActionListener(this);
		btnBoton4.addActionListener(this);
		btnBoton5.addActionListener(this);
		btnBoton6.addActionListener(this);
		btnBoton7.addActionListener(this);

		
	}

	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource() == this.btnBoton1)//dig
		{
			mr.inicializar();
			mr.reproducirNota(72, 1, 500);
			mr.finalizar();
			try{
			MiVentanaEmergente1 me1 = new MiVentanaEmergente1();	
			}catch(Exception e)
			{
			System.out.println("Error al presionar el boton");}
		
		}

		if(event.getSource() == this.btnBoton2)//sang
		{
			mr.inicializar();
			mr.reproducirNota(72, 1, 500);
			mr.finalizar();
			try{
			MiVentanaEmergente2 me1 = new MiVentanaEmergente2();
			}catch(Exception e)
			{
			System.out.println("Error al presionar el boton");}
		}

		if(event.getSource() == this.btnBoton3)//hormo
		{
			mr.inicializar();
			mr.reproducirNota(72, 1, 500);
			mr.finalizar();
			try{
			MiVentanaEmergente3 me1 = new MiVentanaEmergente3();
			}catch(Exception e)
			{
			System.out.println("Error al presionar el boton");}	
		}
		if(event.getSource() == this.btnBoton4)//gases
		{
			mr.inicializar();
			mr.reproducirNota(72, 1, 500);
			mr.finalizar();
			try{
			MiVentanaEmergente4 me1 = new MiVentanaEmergente4();
			}catch(Exception e)
			{
			System.out.println("Error al presionar el boton");}	
		}

		if(event.getSource() == this.btnBoton5)//neuro
		{
			mr.inicializar();
			mr.reproducirNota(72, 1, 500);
			mr.finalizar();
			try{
			MiVentanaEmergente5 me1 = new MiVentanaEmergente5();
			}catch(Exception e)
			{
			System.out.println("Error al presionar el boton");}	
		}

		if(event.getSource() == this.btnBoton6)//repro
		{
			mr.inicializar();
			mr.reproducirNota(72, 1, 500);
			mr.finalizar();
			try{
			MiVentanaEmergente6 me1 = new MiVentanaEmergente6();
			}catch(Exception e)
			{
			System.out.println("Error al presionar el boton");}	
		}

		if(event.getSource() == this.btnBoton7)//juego sprie
		{
			mr.inicializar();
            mr.reproducirNota(72, 1, 500);
            mr.finalizar();
            MiVentana juego = new MiVentana();
            Anuncio a = new Anuncio();
		}

		
	}

}
