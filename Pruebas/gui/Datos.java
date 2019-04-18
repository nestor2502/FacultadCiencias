package gui;
/**
 * Write a description of class Datos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Datos implements ActionListener
{
   
  JFrame ventana,ventana1;
  JLabel etiqueta1,etiqueta2,etiqueta3,etiqueta4,etiqueta5;  
  JButton boton,boton1,boton2;
  JTextField caja1;  
  ButtonGroup grupo;
  JRadioButton r1,r2;
  JCheckBox chk1,chk2,chk3;
  JComboBox combo;
  // componentes para la ventana 2
  JButton Vboton,Vboton1;
   public Datos()
   {
      inicaliza_ventana();
      inicaliza_componentes();
      Inicializa_Componentes1();
      ventana.setVisible(true);
      ventana1.setVisible(false);
   }   
   public void inicaliza_ventana()
   {
    ventana= new JFrame();
    ventana1= new JFrame();
    ventana.setTitle("Datos Personales");
    ventana.setSize(700,600); // colocamos tamaÃ±o a la ventana (ancho, alto)
    ventana.setResizable(false); // hacemos que la ventana no sea redimiensionable  
  
    ventana.setLocationRelativeTo(null); // centramos la ventana en la pantalla
    ventana.setLayout(null); 
    
    ventana1.setTitle("Captura");
    ventana1.setSize(400,300); // colocamos tamaÃ±o a la ventana (ancho, alto)
    ventana1.setResizable(false); // hacemos que la ventana no sea redimiensionable  
  
    ventana1.setLocationRelativeTo(null); // centramos la ventana en la pantalla
    ventana1.setLayout(null); 
    
    
    
    
    }
    
    public void inicaliza_componentes()
    {
      etiqueta1=new JLabel("Datos Personales");
      etiqueta2=new JLabel("Nombre:");
      etiqueta1.setBounds(230,20,150,30);
      
      
      etiqueta1.setFont(new java.awt.Font("Tahoma", 1, 14));
      etiqueta2.setBounds(50,75,150,30);

      caja1 = new JTextField();
      caja1.setBounds(120,75,150,30);
      etiqueta3=new JLabel("Estado Civil:");
      etiqueta3.setBounds(50,150,150,30);
      
      combo = new JComboBox();
      combo.addItem("Seleccione");
      combo.addItem("Soltero");    
      combo.addItem("Casado");
      combo.addItem("Viudo");
      combo.addItem("Separado");
      combo.addItem("Union libre");
      combo.addItem("Otro");
      combo.setBounds(120,150,100,30);
      
      etiqueta4=new JLabel("Sexo:");
      etiqueta4.setBounds(350,75,150,30);
      grupo= new ButtonGroup();
      r1= new JRadioButton("Femenino",true);
      r2= new JRadioButton("Masculino",false);
      r1.setBounds(375,120,150,30);
      r2.setBounds(375,150,150,30);
      grupo.add(r1);
      grupo.add(r2);
      etiqueta5=new JLabel("Documentos:");
      etiqueta5.setBounds(350,225,150,30);
    
      chk1 = new JCheckBox("INE");
      chk2 = new JCheckBox("Acta Nac.");
      chk3 = new JCheckBox("Pasaporte");
    
     chk1.setBounds(375,250, 100,50);
     chk2.setBounds(375,290, 100,50);
     chk3.setBounds(375,330, 100,50);
    
       boton = new JButton("Imprimir");
       boton1 = new JButton("Captura");
       boton2 = new JButton("Salir");
     
      boton.setBounds(75,500, 100,50);
      boton1.setBounds(275,500, 100,50);
      boton2.setBounds(475,500, 100,50);
      boton.addActionListener(this);
      boton1.addActionListener(this);
      boton2.addActionListener(this);
                  
      ventana.add(etiqueta1);
      ventana.add(etiqueta2);
      ventana.add(etiqueta3);
      ventana.add(etiqueta4);
      ventana.add(etiqueta5);
      ventana.add(caja1);
      ventana.add(combo);
      ventana.add(r1);
      ventana.add(r2);
      ventana.add(chk1);
      ventana.add(chk2);
      ventana.add(chk3);
      ventana.add(boton);
      ventana.add(boton1);
      ventana.add(boton2);
    }
    public void Inicializa_Componentes1()
    {
       Vboton = new JButton("Salir");
       Vboton.setBounds(200,200, 100,50);
       Vboton.setVisible(true);
      Vboton.addActionListener(this);
       ventana1.add(Vboton);
      
    
    
    }
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==boton){//podemos comparar por el nombre del objeto del boton
         JOptionPane.showMessageDialog(null,"Tu nombre es: "+ caja1.getText());  
        }   
       if(e.getSource()==boton1){
        ventana.setEnabled(false);
        ventana1.setVisible(true);
        
        } 
        if(e.getSource()==boton2){
          System.exit(0);
        }  
        if(e.getSource()==Vboton){
          ventana.setEnabled(true);  
          ventana1.dispose();
        } 
        
    }    
    
    
      public static void main(String [] args)
      {
          Datos prueba=new Datos();
        
        }
    }
  
 
    
   
