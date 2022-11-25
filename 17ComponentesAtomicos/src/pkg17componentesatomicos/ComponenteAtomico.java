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
import javax.swing.border.TitledBorder;
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
    JSeparator separadorVertical, separadorHorizontal;
    JSpinner spinner; 
    
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
        
        etiquetalabel = new JLabel();
        etiquetalabel.setText("Etiqueta bonita");
        etiquetalabel.setBounds(20, 50, 280, 23);
        
        etiquetaBoton = new JLabel();
        etiquetaBoton.setText("Boton: ");
        etiquetaBoton.setBounds(20, 80, 80, 23);
        
        boton = new JButton();
        boton.setText("Oprimeme");
        boton.setBounds(80, 80, 80, 23);
        boton.addActionListener(this);
        
        checbox1 = new JCheckBox();
        checbox1.setText("Checo1");
        checbox1.setBounds(100, 110, 80, 23);
        
        checbox2 = new JCheckBox();
        checbox2.setText("Checo2");
        checbox2.setBounds(180, 110, 80, 23);
        
        etiquetaRadioButton = new JLabel();
        etiquetaRadioButton.setText("Radio boton");
        etiquetaRadioButton.setBounds(20, 140, 100, 23);
        
        grupoRadios = new ButtonGroup();
        radio1 = new JRadioButton();
        radio1.setText("Opcion 1");
        radio1.setBounds(110, 140, 80, 23);
        
        radio2 = new JRadioButton();
        radio2.setText("Opcion 2");
        radio2.setBounds(190, 140, 80, 23);
        
        grupoRadios.add(radio1);
        grupoRadios.add(radio2);
        
        etiquetaToogleButton = new JLabel();
        etiquetaToogleButton.setText("Activar");
        etiquetaToogleButton.setBounds(20, 180, 100, 23);
        
        toggleButton = new JToggleButton();
        toggleButton.setText("Activar boton");
        toggleButton.setBounds(120, 180, 80, 23);
        
        etiquetaCombo = new JLabel();
        etiquetaCombo.setText("Combo wiii");
        etiquetaCombo.setBounds(350, 50, 100, 23);
        
        combo = new JComboBox();
        combo.addItem("Opciones");
        combo.addItem("Opcion 1");
        combo.addItem("Opcion 2");
        combo.addItem("Opcion 3");
        combo.addItem("Opcion 4");
        combo.setBounds(430, 50, 100, 23);
        combo.setSelectedIndex(0);
        
        separadorVertical = new JSeparator();
        separadorVertical.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separadorVertical.setBounds(300, 60, 10, 200);
        
        etiquetaSeparador = new JLabel();
        etiquetaSeparador.setText("El separador");
        etiquetaSeparador.setBounds(350, 80, 100, 23);
        
        separadorHorizontal = new JSeparator();
        separadorHorizontal.setBounds(430, 92, 100, 5);
        
        etiquetaSpinner = new JLabel();
        etiquetaSpinner.setText("Spinner loco");
        etiquetaSpinner.setBounds(350, 110, 100, 23);
        
        spinner = new JSpinner();
        spinner.setBounds(430, 110, 50, 23);
        spinner.addChangeListener(this);
        
        etiquetaDeslizador = new JLabel();
        etiquetaDeslizador.setText("Slicer ");
        etiquetaDeslizador.setBounds(350, 140, 100, 23);
        
        deslizador = new JSlider(JSlider.HORIZONTAL, 0, 100, 30);
        deslizador.setBounds(430, 140, 100, 30);
        deslizador.setPaintTicks(true);
        deslizador.setMajorTickSpacing(50);
        deslizador.setMinorTickSpacing(5);
        deslizador.setBorder(new TitledBorder(""));
        deslizador.setValue(0);
        deslizador.addChangeListener(this);
        
        etiquetaBarra = new JLabel();
        etiquetaBarra.setText("Barrita");
        etiquetaBarra.setBounds(350, 180, 100, 23);
        
        barra = new JProgressBar();
        barra.setBounds(450, 180, 110, 20);
        
        //Agregar todo
        contenedor.add(labelTitutlo);
        contenedor.add(etiquetalabel);
        contenedor.add(etiquetaBoton);
        contenedor.add(etiquetaCheckbox);
        contenedor.add(checbox1);
        contenedor.add(checbox2);
        contenedor.add(etiquetaRadioButton);
        contenedor.add(radio1);
        contenedor.add(radio2);
        contenedor.add(etiquetaToogleButton);
        contenedor.add(toggleButton);
        contenedor.add(etiquetaCombo);
        contenedor.add(separadorVertical);
        contenedor.add(etiquetaSeparador);
        contenedor.add(separadorHorizontal);
        contenedor.add(etiquetaSpinner);
        contenedor.add(spinner);
        contenedor.add(etiquetaDeslizador);
        contenedor.add(etiquetaBarra);
        contenedor.add(barra);
        contenedor.add(combo);
        contenedor.add(boton);
        
        
        
        
        
                
        
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
    }

   
    
    
    
    
    
}
