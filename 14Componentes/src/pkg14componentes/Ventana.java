/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14componentes;


import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JColorChooser;


/**
 *
 * @author demon
 */
public class Ventana extends JFrame implements ActionListener{
    
    //declaramos nuestras variables
    JLabel labelTitulo;
    private JPanel minpanelprincipal;
    private JPanel panelColor;
    private JButton botoncolor;
    private Color color;
    
    public Ventana(){
        
        //declara un metodo para los componentes
        iniciaComponentes();
        setTitle("Ventana de Colorcitos wiiii");
        setSize(550, 540);
        //ponerla al centro
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
    private void iniciaComponentes() {
        minpanelprincipal = new JPanel();
        minpanelprincipal.setLayout(null);
        
        //propiedades de los label
        labelTitulo = new JLabel();
        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 28 ));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Componente JColorChooser");
        labelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(
                javax.swing.border.BevelBorder.RAISED));
        labelTitulo.setBounds(40, 20, 450, 40);
        
        //propiedades del panel 1
        componentesPanel1();
        
        botoncolor = new JButton();
        botoncolor.setText("Seleccionar Color");
        botoncolor.setBounds(190, 460, 150, 25);
        botoncolor.addActionListener(this);
        
        //agregamos los componentes del contenedor
        minpanelprincipal.add(labelTitulo);
        minpanelprincipal.add(panelColor);
        minpanelprincipal.add(botoncolor);
        add(minpanelprincipal);
        
        
        
        
    }
    
     private void componentesPanel1() {
        panelColor = new JPanel();
        panelColor.setBounds(10, 80, 510, 350);
        panelColor.setBorder(javax.swing.BorderFactory.createBevelBorder(
                javax.swing.border.BevelBorder.LOWERED));
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
        El sigueinte codigo va a definir cuando se presione el boton entonces
        cree una unstancia de la clase de JColorChooser y luego el color
        seleccionado se asigna a un objeto de tipo awt.Color por medio de un  metodo
        showDialog, le asignamod un titulo y color por defecto
        */
        if(e.getSource() == botoncolor){
            //creo el objeto
            JColorChooser ventanadecolores = new JColorChooser();
            //defino mi nueva ventanita
            color = ventanadecolores.showDialog(null, "Seleccione un color", Color.CYAN);
            //lo envio al fondo
            panelColor.setBackground(color);
        }
    }

   

    
    
    
    
}
