import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;

class Usuario extends JFrame implements ActionListener{

	//declaracion de objetos
	JPanel panel;
	JLabel usuario, contrasena;
	JTextField usuarioTexto;
	JPasswordField contraTexto;
	JButton ingresar;

	public Usuario()
	{
	
		panel = new JPanel();
		panel.setLayout(null);

		usuario = new JLabel("Usuario: ");
		usuario.setBounds(30, 30, 100, 15);//(x, y, w, h)
		contrasena = new JLabel("Contrase\u00f1a: ");
		contrasena.setBounds(30, 80, 100, 15);
		
		usuarioTexto = new JTextField();
		usuarioTexto.setBounds(150,25,150,30);
		contraTexto = new JPasswordField();
		contraTexto.setBounds(150, 75, 150, 30);

		ingresar = new JButton("Ingresar");
		ingresar.setBounds(130, 130, 100, 30);
	
		//Se agregan los objetos al panel
		panel.add(usuario);
		panel.add(contrasena);
		panel.add(usuarioTexto);
		panel.add(contraTexto);
		panel.add(ingresar);
		
		/* agregar panel a la ventana y los valores iniciales de la ventana */
		this.add(panel);
		this.setTitle("Usuario");
		this.setSize(350, 230);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		ingresar.addActionListener(this);
		
		
	}

	public void actionPerformed(ActionEvent event)
	{
	  String user = usuarioTexto.getText();
      String password = contraTexto.getText();
      if (password.trim().equals("admin")) {
        //System.out.println("Bienvendio");
        JOptionPane.showMessageDialog(null, "Bienvenido");
      } else {
         //System.out.println("Usuario incorrecto");
         JOptionPane.showMessageDialog(null, "contrase\u00f1a incorrecta");
      }
	}
}

