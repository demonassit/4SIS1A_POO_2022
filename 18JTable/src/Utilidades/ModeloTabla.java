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

import javax.swing.table.DefaultTableModel;


public class ModeloTabla extends DefaultTableModel{
    
    String[] titulos;
    Object[][] datos;
    
    public ModeloTabla(){
    
    }

    public ModeloTabla(String[] titulos, Object[][] datos) {
        super();
        this.titulos = titulos;
        this.datos = datos;
        setDataVector(datos, titulos);
    }
    
    //definir si una celda puede ser o no editada
    public boolean isCellEditable(int row, int column){
        if(column != Utilidades.PERFIL && column != Utilidades.EVENTO 
                && column != Utilidades.NOTA1 && column != Utilidades.NOTA2
                && column != Utilidades.NOTA3){
            return false;
        }else{
            return true;
        }
    }
    
    
    
}
