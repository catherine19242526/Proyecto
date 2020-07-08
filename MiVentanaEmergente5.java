import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;

class MiVentanaEmergente5 extends JFrame implements ActionListener{

    JPanel panel;
    JLabel lblTexto1;
    JLabel lblTexto2;
    JLabel lblTexto3;
    JLabel lblTexto4;
    JLabel lblTexto5;
    JLabel lblTexto6;
    JLabel lblTexto7;
    JLabel lblTexto8;
    JLabel lblTexto9;
    JLabel lblTexto10;
    JLabel lblTexto11;
    JLabel lblTexto12;
    JLabel lblTexto13;


    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;  
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;  

    MiReproductor mr = new MiReproductor();
    JTextArea txaArea1;
    JTextField txtCampoTexto1;

    Font fuente1;
    Font fuente2;
    Color fondo;

    MiReproductor miReproductor = new MiReproductor();
    ArrayList<String> contenido_1;
    ArrayList<Integer> contenidoInt = new ArrayList<Integer>();
    ArrayList<Integer> contenidoDur = new ArrayList<Integer>();

    Lectura lec1 = new Lectura("ESTRUCTURA NEURONA","NeuroUno");
    Lectura lec2 = new Lectura("POTENCIAL DE MEMBRANA","NeuroDos");
    Lectura lec3 = new Lectura("TRANSMISION SINAPTICA", "NeuroTres");
    Diagrama dia1 = new Diagrama("neuro1");
    Diagrama dia2 = new Diagrama("neuro2");
    Diagrama dia3 = new Diagrama("neuro3");

    public MiVentanaEmergente5()
    {
        fuente1 = new Font("Bernard MT Condensed", 15, 40);
        fuente2 = new Font("Impact", 7, 20);
        fondo = new Color(203, 108, 230);        
       
        panel = new JPanel();
        panel.setLayout(null);
        lblTexto1 = new JLabel("NEURONAS Y SINAPSIS");
        lblTexto1.setBounds(230, 20, 500, 40); //(x, y, w, h)
        lblTexto1.setFont(fuente1); 

        ////////////////////////////////////////////////////////////////

        lblTexto2 = new JLabel("Estructura de las neuronas");
        lblTexto2.setBounds(50, 100, 800, 20); //(x, y, w, h)
        lblTexto2.setFont(fuente2);

        btn1 = new JButton("Ir");
        btn1.setBounds(90, 133, 50, 20);
        btn1.setBackground(Color.BLUE);

       lblTexto3 = new JLabel(" Lectura sobre la estructura de la neurona.");
        lblTexto3.setBounds(145, 128, 2000, 30); //(x, y, w, h)

         btn2 = new JButton("Ir");
        btn2.setBounds(90, 163, 50, 20);
        btn2.setBackground(Color.GREEN);

       lblTexto4 = new JLabel(" Diagrama rotulado de la estructura de una neurona.");
        lblTexto4.setBounds(145, 160, 2000, 30); //(x, y, w, h)

          btn3 = new JButton("Ir");
        btn3.setBounds(90, 193, 50, 20);
        btn3.setBackground(Color.RED);

       lblTexto5 = new JLabel(" Hacer resumen del tema.");
        lblTexto5.setBounds(145, 190, 400, 30); //(x, y, w, h)
        
     ////////////////////////////////////////////////////////////////////


        lblTexto6 = new JLabel("Potencial de membrana");
        lblTexto6.setBounds(50, 240, 800, 20); //(x, y, w, h)
        lblTexto6.setFont(fuente2);

        btn4 = new JButton("Ir");
        btn4.setBounds(90, 280, 50, 20);
        btn4.setBackground(Color.BLUE);

       lblTexto7 = new JLabel("Lectura sobre el potencial de membrana.  ");
        lblTexto7.setBounds(145, 280, 2000, 30); //(x, y, w, h)

         btn5 = new JButton("Ir");
        btn5.setBounds(90, 320, 50, 20);
        btn5.setBackground(Color.GREEN);

       lblTexto8= new JLabel("Esquema rotulado sobre las fases del potencial de membrana en un osciloscopio.");
        lblTexto8.setBounds(145, 320, 2000, 30); //(x, y, w, h)

          btn6 = new JButton("Ir");
        btn6.setBounds(90, 360, 50, 20);
        btn6.setBackground(Color.RED);

       lblTexto9= new JLabel("Hacer resumen del tema.");
        lblTexto9.setBounds(145, 360, 400, 30); //(x, y, w, h)

        ////////////////////////////////////////////////

        lblTexto10 = new JLabel("Transmisi\u00f3n sin\u00e1ptica");
        lblTexto10.setBounds(50, 400, 800, 20); //(x, y, w, h)
        lblTexto10.setFont(fuente2);

        btn7 = new JButton("Ir");
        btn7.setBounds(90, 440, 50, 20);
        btn7.setBackground(Color.BLUE);

       lblTexto11 = new JLabel(" Lectura sobre la transmisi\u00f3n sin\u00e1ptica.");
        lblTexto11.setBounds(145, 440, 800, 30); //(x, y, w, h)

         btn8 = new JButton("Ir");
        btn8.setBounds(90, 480, 50, 20);
        btn8.setBackground(Color.GREEN);

       lblTexto12 = new JLabel(" Diagrama de la transmisi\u00f3n sin\u00e1ptica.");
        lblTexto12.setBounds(145, 480, 400, 30); //(x, y, w, h)

          btn9 = new JButton("Ir");
        btn9.setBounds(90, 520, 50, 20);
        btn9.setBackground(Color.RED);

       lblTexto13 = new JLabel("Hacer resumen del tema.");
        lblTexto13.setBounds(145, 520, 400, 30); //(x, y, w, h)

        ///////////////////////////////////////////////////////

     
        panel.add(lblTexto1);
        panel.add(lblTexto2);
        panel.add(lblTexto3);
        panel.add(lblTexto4);
        panel.add(lblTexto5);
        panel.add(lblTexto6);
        panel.add(lblTexto7);
        panel.add(lblTexto8);
        panel.add(lblTexto9);
        panel.add(lblTexto10);
        panel.add(lblTexto11);
        panel.add(lblTexto12);
        panel.add(lblTexto13);

      
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);

        panel.setBackground(fondo);
        
       
     

        this.add(panel);
        this.setTitle("NEURONAS Y SINAPSIS");
        this.setSize(700, 610);
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

       
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);

    }

   
    public void actionPerformed(ActionEvent event) {
        
       if (event.getSource() == this.btn1) {  //lectura
            mr.inicializar();
            mr.reproducirNota(72, 1, 500);
            mr.finalizar();
            lec1.setVisible(true);     
           }

        if (event.getSource() == this.btn2) {  // diagrama
            mr.inicializar();
            mr.reproducirNota(72, 1, 500);
            mr.finalizar();
            dia1.setVisible(true);
            
        }

        if (event.getSource() == this.btn3) {  // resumen
            mr.inicializar();
            mr.reproducirNota(72, 1, 500);
            mr.finalizar();
            Resumen resumen = new Resumen();
        }

        if (event.getSource() == this.btn4) {  //lectura
            mr.inicializar();
            mr.reproducirNota(72, 1, 500);
            mr.finalizar();
            lec2.setVisible(true);     
           }

        if (event.getSource() == this.btn5) {  // diagrama
            mr.inicializar();
            mr.reproducirNota(72, 1, 500);
            mr.finalizar();
            dia2.setVisible(true);
            
        }

        if (event.getSource() == this.btn6) {  // resumen
            mr.inicializar();
            mr.reproducirNota(72, 1, 500);
            mr.finalizar();
            Resumen resumen = new Resumen();
        }
        if (event.getSource() == this.btn7) {  //lectura
            mr.inicializar();
            mr.reproducirNota(72, 1, 500);
            mr.finalizar();
            lec3.setVisible(true);     
           }

        if (event.getSource() == this.btn8) {  // diagrama
            mr.inicializar();
            mr.reproducirNota(72, 1, 500);
            mr.finalizar();
            dia3.setVisible(true);
            
        }

        if (event.getSource() == this.btn9) {  // resumen
            mr.inicializar();
            mr.reproducirNota(72, 1, 500);
            mr.finalizar();
            Resumen resumen = new Resumen();
        }

      
    } 





  

}


    

