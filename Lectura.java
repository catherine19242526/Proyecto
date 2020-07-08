import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

class Lectura extends JFrame {
	//declaracion de objetos 
	JPanel panel;
	JTextArea txaArea1;
	JScrollPane sc;
	JButton btnBoton1;
  	ArrayList<String> contenido_1;
  	Font fuente1;
 	JLabel lblTexto1;
 	Color fondo;



	public Lectura(String nombre,String archivo)
	{
		// damos valores a los objetos
		fondo = new Color(247, 218, 150);
		panel = new JPanel();
		panel.setLayout(null);
		fuente1 = new Font("Bernard MT Condensed", 15, 40);
		lblTexto1 = new JLabel(nombre);
		lblTexto1.setBounds(100, 20, 800, 60);//(x, y, w, h)
		lblTexto1.setFont(fuente1);
		//delcaracion de la barra de desplazamiento
		sc = new JScrollPane();
		sc.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);//para que la barra este siempre presente y no se oculte
 
		txaArea1 = new JTextArea();
		txaArea1.setBounds(50, 100, 520, 480);

		//lectura del archivo que aparecera en el area de texto
		contenido_1 = Archivo.leerTodo("sinAcento/"+archivo+".txt");
            String cadena = "";

             for (int i=0 ; i<contenido_1.size();i++ ) 
             {
                 cadena = cadena + contenido_1.get(i)+"\n";
             }

             txaArea1.setText(cadena);
             txaArea1.setEditable(false);

		sc.setBounds(50, 100, 520, 480);
		sc.getViewport().add(txaArea1);

		//se agregan los objetos al panel
		panel.add(sc);
		panel.add(lblTexto1);
		panel.setBackground(fondo);
		panel.repaint();

		//se agrega el panel a la ventana y se valores de la ventana
		this.add(panel);
		this.setResizable(false);
		this.setTitle("LECTURA");
		this.setLocation(200, 100);
		this.setSize(630, 680);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setVisible(false);
		this.setLocationRelativeTo(null);	
	}
}

