/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17componentesatomicos;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 *
 * @author demon
 */
public class ComponenteAtomico extends JFrame implements ActionListener, ChangeListener {
    
    
    private Container contenedor;
    //nuestros label
    JLabel labelTitutlo;
    JLabel etiquetalabel;
    JLabel etiquetaBoton;
    JLabel etiquetaToogleButton;
    JLabel etiquetaCheckbox;
    JLabel etiquetaRadioButton;
    JLabel etiquetaCombo;
    JLabel etiquetaSeparador;
    JLabel etiquetaSpinner;
    JLabel etiquetaDeslizador;
    JLabel etiquetaBarra;
    
    JButton boton;
    JCheckBox checbox1, checbox2;
    ButtonGroup grupoRadios;
    JRadioButton radio1, radio2;
    JToggleButton toggleButton;
    JComboBox combo;
    JSeparator spinner;
    JSlider deslizador;
    JProgressBar barra;
    
    public ComponenteAtomico(){
        //metodo para iniicar las propiedades de los componentes
        inicarComponentes();
        //asingamos el titulo a la ventana
        setTitle("Componente Atomico de la Hormiga Atomica wiii");
        //tamaño de la ventana
        setSize(630, 250);
        //poner la ventana al centro
        setLocationRelativeTo(null);
        //para que no se redimensione la pantalla
        setResizable(false);
    }
    
     private void inicarComponentes() {
         //instanciar al contenedor
        contenedor = getContentPane();
        //definimos los mismos tamaños y posicion de la ventana
        contenedor.setLayout(null);
        
        
        //definimos las propiedades de los componentes
        labelTitutlo = new JLabel();
        labelTitutlo.setText("Componentes Atomicos kawaii");
        labelTitutlo.setFont(new java.awt.Font("Tahoma", 3, 20));
        labelTitutlo.setBounds(180, 5, 380, 50);
        
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
    
    
}
