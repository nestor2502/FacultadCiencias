package Proyecto2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Visualizar implements ActionListener{

     public JFrame ventana1;
     public JFrame ventana2;
     public JTextField frase, ruta;
     public JLabel ingresados;
     public JButton ingresar;
     public JButton anadir, anadir2, regresa1;
     public JButton mostrar;
     public JButton limpiar;


     public Visualizar(){

     	iniciaComponentes1();
     	iniciaComponentes2();

     }

     public void iniciaComponentes1(){
     	 ventana1 = new JFrame();


     	 //ventana1.setLayout(null);
	 	 Toolkit mipantalla = Toolkit.getDefaultToolkit();
	 	 Dimension tamanoPantalla = mipantalla.getScreenSize();
	 	 int altura = tamanoPantalla.height;
	 	 int ancho = tamanoPantalla.width;

         ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	 ventana1.setSize(ancho/2, altura /2);
	 	 ventana1.setLocation(ancho/4, altura/4);
	 	 ventana1.setTitle("Proyecto 2");
	 	 ventana1.setVisible(true);
	 	 ventana1.setResizable(false);

	 	 //frase = new JTextField("                                Ingresa una frase");
	 	 frase = new JTextField();
	 	 TextPrompt placeholder = new TextPrompt("Ingresa una frase", frase);
	 	 placeholder.changeAlpha(0.75f);
         placeholder.changeStyle(Font.ITALIC);
      	  //frase.setLocation(10, 50);
      	 frase.setBounds(30, 20, 400, 40 );
      	 //frase.setVisible(true);
      	 ventana1.add(frase);
      	  ingresar = new JButton("ingresar");
      	  ingresar.setBounds(450, 20, 200, 40);
      	  ingresar.addActionListener(this);
      	  //ingresar.setVisible(true);
      	  ventana1.add(ingresar);

      	  anadir = new JButton("Añadir documento");
      	  anadir.setBounds(30, 80, 200, 40);
      	  ventana1.add(anadir);

     }

     public void iniciaComponentes2(){
     	 JLabel etiqueta1 = new JLabel();
         ruta = new JTextField();
         anadir2= new JButton("Añadir");
         regresa1 = new JButton("Regresar");

     	 //ventana2.setBounds(500, 500, 300, 300);
     	 ventana2 = new JFrame();
     	 ventana2.setSize(300, 223);
     	 ventana2.setLocationRelativeTo(null); // centramos la ventana en la pantalla
         ventana2.setLayout(null);
         ventana2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	 	 ventana2.setTitle("Proyecto 2");
	 	 ventana2.setVisible(true);
	 	 ventana2.setResizable(false);
	 	 etiqueta1.setText("       Ingresa la ruta del archivo:");
	 	 etiqueta1.setBounds(20, 10, 250, 40);
	 	 ventana2.add(etiqueta1);
         ruta.setBounds(20, 60, 250, 40);
         TextPrompt sombra = new TextPrompt("   c :   . . . / . . . / . . . ", ruta);
	 	 sombra.changeAlpha(0.75f);
         sombra.changeStyle(Font.ITALIC);
         ventana2.add(ruta);
         anadir2.setBounds(20, 130, 120, 40 );
         ventana2.add(anadir2);
         regresa1.setBounds(160, 130, 120, 40 );
         ventana2.add(regresa1);


     }
     @Override
     public void actionPerformed(ActionEvent e){

     	String frase2 =""; 

     	if(e.getSource()==ingresar){

     	frase2 = frase.getText();
     	frase.setEnabled(false);

     	

     	System.out.println(frase2);


     }}



	  public static void main(String[] args) {
	  	Visualizar v1 = new Visualizar();

	  }



}