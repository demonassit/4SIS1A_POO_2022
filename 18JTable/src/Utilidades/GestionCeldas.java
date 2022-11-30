/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 *
 * @author demon
 */

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class GestionCeldas extends DefaultTableCellRenderer {
    
    /*
    Esta clase nos permite gestionar la tabla y los eventos que se van
    a realizar dentro de ella haciendo que sea un objeto 
    personalizable
    */
    
    private String tipo = "text";
    
    //definir los tipos de datos que vamos a usar
    private Font normal = new Font("Verdana", Font.PLAIN, 12);
    private Font bold = new Font("Verdana", Font.BOLD, 12);
    
    private JLabel label = new JLabel();
    
    //iconos
    private ImageIcon iconoGuardar = new ImageIcon(getClass().getResource("/Recursos/ico_guardar.png"));
    private ImageIcon iconoBuscar = new ImageIcon(getClass().getResource("/Recursos/ico_buscar.png"));
    
    public GestionCeldas(){
    
    }
    
    
     public GestionCeldas(String tipo){
         this.tipo = tipo;
    }
     
    //crear un metodo que se encargue de poder manipular la tabla
    
}
