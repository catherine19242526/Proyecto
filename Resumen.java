import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;

class Resumen extends JFrame implements ActionListener{

	//declaracion de objetos
	JPanel panel;
	JLabel lblTexto1;
	JLabel lblTexto2;
	JLabel lblTexto3;
	JLabel lblTexto4;
	JTextArea txaArea1;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem menuItem;
 	Font fuente1;
 	Color fondo;

	public Resumen()
	{
		//creacion de objetos iniciales
		fondo = new Color(247, 218, 150 );
		
		fuente1 = new Font("Bernard MT Condensed", 15, 40);
		panel = new JPanel();
		panel.setLayout(null);
		lblTexto1 = new JLabel("Resumen");
		lblTexto1.setBounds(220, 20, 200, 40);//(x, y, w, h)
		lblTexto1.setFont(fuente1);

		lblTexto2 = new JLabel("Dentro del cuadro de texto escribe un resumen de lo que hayas aprendido en la seccion y ve");
		lblTexto2.setBounds(50, 30, 800, 120);//(x, y, w, h)
		lblTexto3 = new JLabel ("guardando en archivos de tu computadora para que lleves un registro de tu aprendizaje! ");
		lblTexto3.setBounds(50, 45, 800, 120);//(x, y, w, h)

		lblTexto4 = new JLabel("No olvides guardarlo en la barra de menu. ");
		lblTexto4.setBounds(50, 65, 800, 120);//(x, y, w, h)

		txaArea1 = new JTextArea();
		txaArea1.setBounds(50, 150, 520, 380);

		menuBar = new JMenuBar();
		menu = new JMenu("ARCHIVO");
		menuItem = new JMenuItem("Guardar como...");


		//Se agregan los objetos al panel
		panel.add(lblTexto1);
		panel.add(lblTexto2);
		panel.add(lblTexto3);
		panel.add(lblTexto4);
		panel.add(txaArea1);
		panel.setBackground(fondo);
		

		menu.add(menuItem);
		menuBar.add(menu);

		this.setJMenuBar(menuBar);


		/* agregar panel a la ventana y los valores iniciales de la ventana */
		this.add(panel);
		this.setTitle("RESUMEN");
		this.setSize(630, 680);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		menuItem.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == this.menuItem)
		{
			
			String contenido_a_guardar;
			contenido_a_guardar = txaArea1.getText();

			String nombre_archivo_guardar = "";;


			JFileChooser fc = new JFileChooser();
			fc.setDialogTitle("Guardando archivo...");

			int userSelection = fc.showSaveDialog(this);

			
			if(userSelection == JFileChooser.APPROVE_OPTION)
			{
				File fs = fc.getSelectedFile();
			
				nombre_archivo_guardar = fs.getAbsolutePath();
				
			}
			
			Archivo.guardarTodo(contenido_a_guardar, nombre_archivo_guardar);

			
		}
	}
}

