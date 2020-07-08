import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
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

class MiVentana extends JFrame implements KeyListener{

	BufferedImage imagen;
	BufferedImage subImagen;

	Monito monito;

	JPanel panel;
	JButton btn1;
	JButton btn2;

	//Elementos
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	JButton btn10;
	JButton btn11;

	//Puntaje
	JLabel p = new JLabel ();

	Icon corazon;
	Icon punto;
	Icon arbol;
	Icon pasto;
	Icon cartel;

	int indiceX=0;

	int points = 0;
	
	

	public MiVentana()
	{
		try 
		{
			imagen = ImageIO.read(new File("imagenes1/spriteSheetDoc.jpg"));
			corazon = new ImageIcon("imagenes1/coorazon.png");
			arbol = new ImageIcon("imagenes1/arbol.png");
			pasto = new ImageIcon("imagenes1/pasto.png");
			punto = new ImageIcon("imagenes1/coorazon.png");
			cartel = new ImageIcon("imagenes1/cartel.png");
		}
		catch (Exception e)
		{
			System.out.println("Error al importar imagen");
		}

		
		subImagen = imagen.getSubimage(0,103*3,90,100);

		monito = new Monito(subImagen);
		monito.setBounds(250,0,100,100);

		btn2 = new JButton(corazon);
		btn2.setBounds(0,400,50,60);
		btn2.setContentAreaFilled(false);
		btn2.setBorderPainted(false);

		btn3 = new JButton(arbol);
		btn3.setBounds(865,1,120,164);
		btn3.setContentAreaFilled(false);
		btn3.setBorderPainted(false);

		btn4 = new JButton(arbol);
		btn4.setBounds(30,50,120,164);
		btn4.setContentAreaFilled(false);
		btn4.setBorderPainted(false);

		btn5 = new JButton(arbol);
		btn5.setBounds(550,500,120,140);
		btn5.setContentAreaFilled(false);
		btn5.setBorderPainted(false);

		btn6 = new JButton(pasto);
		btn6.setBounds(1050,495,40,14);
		btn6.setContentAreaFilled(false);
		btn6.setBorderPainted(false);

		btn7 = new JButton(pasto);
		btn7.setBounds(300,400,40,14);
		btn7.setContentAreaFilled(false);
		btn7.setBorderPainted(false);

		btn8 = new JButton(pasto);
		btn8.setBounds(630,210,40,14);
		btn8.setContentAreaFilled(false);
		btn8.setBorderPainted(false);

		btn9 = new JButton(pasto);
		btn9.setBounds(200,590,40,14);
		btn9.setContentAreaFilled(false);
		btn9.setBorderPainted(false);

		btn10 = new JButton(pasto);
		btn10.setBounds(500,20,40,14);
		btn10.setContentAreaFilled(false);
		btn10.setBorderPainted(false);

		btn11 = new JButton(cartel);
		btn11.setBounds(940,300,250,250);
		btn11.setContentAreaFilled(false);
		btn11.setBorderPainted(false);

		panel = new JPanel();
		panel.setLayout(null);
		panel.setFocusable(true);
		panel.requestFocusInWindow();

		p = new JLabel ();
		p.setText("Corazones recolectados: " + points);
		p.setBounds(0,0,200,20);
		p.setForeground(Color.white);
		p.setBackground(Color.blue);
		p.setOpaque(true);

		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		panel.add(btn7);
		panel.add(btn8);
		panel.add(btn9);
		panel.add(btn10);
		panel.add(btn11);
		panel.add(monito);
		panel.add(p);


		this.add(panel);
		this.setTitle("JUEGO");
		this.setSize(1200, 700);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		panel.addKeyListener(this);
		panel.setBackground(Color.GREEN);
		
	}

	public void keyPressed(KeyEvent e)
	{
		int t = e.getKeyCode();


		Point pos = monito.getLocation();
		int x = (int)pos.getX();
		int y = (int)pos.getY();

		if(t==39)
		{
			//Derecha
			x = x+10;
			indiceX = ((indiceX + 100) % 3) * 103;
			monito.imagen = imagen.getSubimage(indiceX,103*6,90,100);
		}

		else if(t==37)
		{
			//Izquierda
			x = x-10;
			indiceX = ((indiceX + 103) % 5) * 103;
			monito.imagen = imagen.getSubimage(indiceX,103*2,100,100);
		}

		else if(t==40)
		{
			//Abajo
			y = y+10;
			indiceX = ((indiceX + 1) % 3 * 103);
			monito.imagen = imagen.getSubimage(indiceX,103*4,100,100);
		}
		else if(t==38)
		{
			//Arriba
			y = y-10;
			indiceX = ((indiceX + 1) % 3 * 103);
			monito.imagen = imagen.getSubimage(indiceX,0,100,100);
		}

		if(monito.getBounds().intersects(btn2.getBounds()))
		{
			
			int j;
			j= (int)(Math.random()*(552-100+1)+552);
			int k;
			k = (int)(Math.random()*(550-90+1)+90);
			this.btn2.setLocation(j,k);
			
			points++;
			p.setText ("Corazones recolectados:  " + points);
            
		}

		if(monito.getBounds().intersects(btn3.getBounds())||monito.getBounds().intersects(btn4.getBounds())||monito.getBounds().intersects(btn5.getBounds())||monito.getBounds().intersects(btn6.getBounds())||monito.getBounds().intersects(btn7.getBounds())||monito.getBounds().intersects(btn8.getBounds())||monito.getBounds().intersects(btn9.getBounds())||monito.getBounds().intersects(btn10.getBounds()))
		{
			
			dispose();
			GameOver g = new GameOver();

		}

		monito.setLocation(x,y);



	}
	
	public void keyReleased(KeyEvent e)
	{
		//System.out.println("Tecla liberada.");

	}
	
	public void keyTyped(KeyEvent e)
	{
		//System.out.println("Tecla en el buffer.");

	}

	public void Puntos(){

	}
	
}