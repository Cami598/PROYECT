package edu.programacion;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class MainWindow extends JFrame {
    
    public MainWindow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        
       
               
        initComponents();

//        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
//        int iCoordX = (objDimension.width - this.getWidth()) / 2;
//        int iCoordY = (objDimension.height - this.getHeight()) / 2;
//        this.setLocation(iCoordX, iCoordY); 
//        this.pack();
        this.setVisible(true);
        
    
    }
    
    private static void createAndShowGUI() {
        
        MainWindow mainWindow = new MainWindow();
    
    }
    
      public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private void initComponents() {
    	
    	 JComboBox<String> comboBox = new JComboBox<>();
    	 comboBox.setFont(new Font("Papyrus", Font.BOLD, 14));
    	 comboBox.addItemListener(
    			 e -> {
    				 System.out.println("hello");
    				 
    				 if (e.getSource()==comboBox) {
    			            String seleccionado=(String)comboBox.getSelectedItem();
    			            this.setTitle(seleccionado);
    			        }
    			 });
    	 
    	 JLabel lblNewLabel = new JLabel("Seleccione una opción");
    	 lblNewLabel.setForeground(new Color(25, 25, 112));
    	 lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 20));
    	 getContentPane().add(lblNewLabel);
    	 comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ingresar Datos de Parque", "Ingresar Datos Cabaña", "Ingresar Datos Persona", "Ver Parque Natural", "Ver Cabaña", "Ver Empleado", "Ver Visitante"}));
         
         
         getContentPane().add(comboBox);
   
    }
    
    

    
}
