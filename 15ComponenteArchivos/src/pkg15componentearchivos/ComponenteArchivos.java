/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15componentearchivos;

/**
 *
 * @author demon
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//archivos
import java.io.BufferedReader;
import java.io.File;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

/*
vamos a crear una clase que nos permita cargar una ventana con un area
para poder abrri o guardar un archivo
*/

public class ComponenteArchivos extends JFrame implements ActionListener{
    
    private Container contenedor;
    JLabel labeltitulo;
    JTextArea areadetexto;
    JButton botonabrir;
    JButton botonguardar;
    JScrollPane scrollpanearea;
    JFileChooser filechooser;
    String texto;
    
    public ComponenteArchivos(){
        
        contenedor = getContentPane();
        contenedor.setLayout(null);
        
        //creamos el objeto del componente de archivos
        filechooser = new JFileChooser();
        
        //labels
        labeltitulo = new JLabel();
        labeltitulo.setText("Componente JFileChooser");
        labeltitulo.setBounds(110, 290, 180, 25);
        
        //area de texto
        areadetexto = new JTextArea();
        //para ajustar el texto dentro del area
        areadetexto.setLineWrap(true);
        //para que no queden palabras incompletas y se haga el salto de linea
        areadetexto.setWrapStyleWord(true);
        //vamos a agregar nuestro scroll
        scrollpanearea = new JScrollPane();
        scrollpanearea.setBounds(20, 50, 350, 270);
        scrollpanearea.setViewportView(areadetexto);
        
        //botones
        botonabrir = new JButton();
        botonabrir.setText("Abrir");
        botonabrir.setBounds(100, 330, 80, 25);
        botonabrir.addActionListener(this);
        
        botonguardar = new JButton();
        botonguardar.setText("Guardar");
        botonguardar.setBounds(220, 330, 80, 25);
        botonguardar.addActionListener(this);
        
        //agregamos los compoentes al contenedor
        contenedor.add(labeltitulo);
        contenedor.add(scrollpanearea);
        contenedor.add(botonabrir);
        contenedor.add(botonguardar);
        
        //vamos a ponerle color y cosas
        setTitle("Ventana de JFileChooser");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == botonabrir){
           try {
               String archivo = abrirArchivo();
           } catch (IOException ex) {
               Logger.getLogger(ComponenteArchivos.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       if(e.getSource() == botonguardar){
           guardarArchivo();
       }
    }

    private String abrirArchivo() throws FileNotFoundException, IOException {
        String aux = "";
        texto = "";
        
        try{
            //primero llamamos al pemetodo que permite cargar la ventana
            filechooser.showOpenDialog(this);
            //abrirmos el archivo seleccionado
            File abre = filechooser.getSelectedFile();
            
            System.out.println(abre.getAbsolutePath()); //ruta
            System.out.println(abre.getPath());
            
            try{
                Runtime.getRuntime().exec("cmd / c start "+ abre);
            }catch(IOException eio){
                //cuando valio gorro
                System.out.println("Error: " + eio.getMessage());
                eio.printStackTrace();  //ruta del error
            }
            //tenemos que recorrer el archivo leyendolo para que se coloque
            //en el text area
            if(abre!=null){
                //vamso a ocupar un buffer
                FileReader archivos = new FileReader(abre);
                BufferedReader lee = new BufferedReader(archivos);
                
                //hay que leer
                while((aux = lee.readLine()) != null ){
                    texto+= aux + "\n";
                }
                lee.close();
            }
               
            }catch(IOException eio){
                JOptionPane.showMessageDialog(null, "\n No se ha encontrado\n");
                System.out.println("Error: " + eio.getMessage());
        
        }
        return texto;
    }

    private void guardarArchivo() {
        
        try{
            String nombre = "";
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(this);
            File guarda = file.getSelectedFile();
            
            if(guarda != null){
                nombre = file.getSelectedFile().getName();
                /*guardamos el archivo y le damos el formato correspondiente
                si quieremos que sea docx, txt, etc*/
                FileWriter save = new FileWriter(guarda+".txt");
                save.write(areadetexto.getText());
                save.close();
                JOptionPane.showMessageDialog(null, "\n El archivo se guardo con exito\n");
                
            }
        }catch(IOException eio){
            JOptionPane.showMessageDialog(null, "\n Su archivo no se pudo guardar");
            System.out.println("Error: " + eio.getMessage());
        
        }
        
    }
    
}
