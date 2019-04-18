package gui;
import javax.swing.*;

public class Botones
{
        JFrame f;
        
        Botones()
      {
        f=new JFrame();
        f.setSize(600,300);
        f.setLayout(null);
        f.setVisible(true);
        
        JLabel texto= new JLabel("Sexo");
        
        texto.setBounds(75,25,100,30);
        ButtonGroup bg=new ButtonGroup();
        JRadioButton r1=new JRadioButton("A) Masculino",false);
        JRadioButton r2=new JRadioButton("B) Femenino",true);
        
        r1.setBounds(75,50,100,30);
        r2.setBounds(75,100,100,30);
        bg.add(r1);
        bg.add(r2);
        
        // combo box
        JLabel texto1= new JLabel("Pais");
        texto1.setBounds(75,320,150,30);
        
        JComboBox combo = new JComboBox();
        combo.addItem("Seleccione");
        combo.addItem("Aguascalientes");    
        combo.addItem("BajaCalifornia");
        combo.addItem("Campeche");
        combo.addItem("CDMex");
        
        combo.setBounds(75,350,100,30);
        
        JLabel texto2= new JLabel("Documentos");
        texto2.setBounds(200,75,150,30);
        JCheckBox checkBox1 = new JCheckBox("INE");
        checkBox1.setBounds(200,100, 100,50);
        JCheckBox checkBox2 = new JCheckBox("Acta Nac.");
        JCheckBox checkBox3 = new JCheckBox("Pasaporte");
        
        checkBox2.setBounds(200,150, 100,50);
        checkBox3.setBounds(200,200, 100,50);
        
        
        f.add(r1);
        f.add(r2);
        f.add(combo);
        f.add(texto);
        f.add(texto1);
        f.add(texto2);
        f.add(checkBox1);
        f.add(checkBox2);
        f.add(checkBox3);

        
}
public static void main(String[] args) 
{
   Botones boton= new Botones();
 }
}