package Proyecto2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Visualizar implements ActionListener{

     public JFrame ventana1;
     public JFrame ventana2;
     public JFrame ventana3;
     public JTextField frase, ruta;
     public JLabel etiqueta, etiqueta1, etiqueta2, etiqueta3, etiqueta4, etiqueta5;
     public JButton ingresar;
     public JButton anadir, anadir2, regresa1, regresa2;
     public JButton mostrar;
     public JButton limpiar;
     public String fraseIng="";
     public JTable ingresados;
     public JComboBox ingresados2, importancia;



     public Visualizar(){

     	iniciaComponentes1();
     	iniciaComponentes2();
     	iniciaComponentes3();

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
	 	 TextPrompt placeholder = new TextPrompt("     Ingresa una frase", frase);
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
      	  anadir.setBounds(30, 100, 200, 40);
      	  anadir.addActionListener(this);
      	  ventana1.add(anadir);

      	  etiqueta = new JLabel();
      	  etiqueta.setText("Documentos ingresados");
          etiqueta.setBounds(30, 180, 400, 40);
          ventana1.add(etiqueta);
          
          //String []titulos = {"nestor"};
          ingresados2 = new JComboBox();
          ingresados2.setBounds(30, 230, 400, 40);
          ingresados2.addItem("Doc1");
          ingresados2.addItem("Doc2");
          ingresados2.addItem("Doc3");
          ingresados2.addItem("Doc4");
          ventana1.add(ingresados2);

          etiqueta4 = new JLabel();
          etiqueta4.setText("Documentos ingresados");
          etiqueta4.setBounds(30, 150, 400, 40);
          ventana1.add(etiqueta4);

          mostrar = new JButton("Mostrar coincidencias");
          mostrar.setBounds(30, 320, 200, 40);
          mostrar.addActionListener(this);
          ventana1.add(mostrar);

          limpiar = new JButton("Limpiar");
          limpiar.setBounds(260, 320, 200, 40);
          limpiar.addActionListener(this);
          ventana1.add(limpiar);




     }

     public void iniciaComponentes2(){
     	 etiqueta1 = new JLabel();
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
	 	 ventana2.setVisible(false);
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
         anadir2.addActionListener(this);
         ventana2.add(anadir2);
         regresa1.setBounds(160, 130, 120, 40 );
         regresa1.addActionListener(this);
         ventana2.add(regresa1);


     }

     public void iniciaComponentes3(){


     	 String frase3 = fraseIng;
     	 System.out.println(fraseIng);

     	 ventana3 = new JFrame();
     	 ventana3.setSize(300, 323);
     	 ventana3.setLocationRelativeTo(null); // centramos la ventana en la pantalla
         ventana3.setLayout(null);
         ventana3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	 	 ventana3.setTitle("Proyecto 2");
	 	 ventana3.setVisible(false);
	 	 ventana3.setResizable(false);

	 	 etiqueta2 = new JLabel();
	 	 etiqueta2.setText("Frase ingresada:");
	 	 etiqueta2.setBounds(20, 20, 200, 40);
	 	 ventana3.add(etiqueta2);

	 	 etiqueta3 = new JLabel();
	 	 etiqueta3.setBounds(20, 60, 250, 40);
	 	 ventana3.add(etiqueta3);

	 	 etiqueta5 = new JLabel();
	 	 etiqueta5.setText("Orden de importancia: ");
	 	 etiqueta5.setBounds(20, 100, 250, 40);
	 	 ventana3.add(etiqueta5);

	 	 importancia = new JComboBox();
	 	 importancia.setBounds(20, 156, 260, 40);
	 	 ventana3.add(importancia);

	 	 regresa2 = new JButton("Regresar");
	 	 regresa2.setBounds(85, 230, 120, 40);
	 	 regresa2.addActionListener(this);
	 	 ventana3.add(regresa2);


     }

     @Override
     public void actionPerformed(ActionEvent e){

     	 //String frase2 =""; 

     	 if(e.getSource()==ingresar){

     	     //frase2 = frase.getText();
     	     fraseIng= frase.getText().trim();
     	     frase.setEnabled(false);
     	     ingresar.setEnabled(false);
     	     System.out.println(fraseIng);

     }

      if(e.getSource()==anadir){

         ventana2.setVisible(true);
     }
     
     if(e.getSource()==anadir2){
     	  String ruta1;
          ruta1 = ruta.getText();
     	  ruta.setText("");
         

     }

      if(e.getSource()==regresa1){

      	 ventana2.setVisible(false);

     }

     if(e.getSource()==limpiar){

     	frase.setText("");
     	frase.setEnabled(true);
     	ingresar.setEnabled(true);
     }

     if(e.getSource()==mostrar){
         
         etiqueta3.setText("'"+fraseIng+"'");
     	 ventana3.setVisible(true);
     }

     if(e.getSource()==regresa2){

     	 ventana3.setVisible(false);
     }

 }



	  public static void main(String[] args) {
	  	Visualizar v1 = new Visualizar();

	  }



}