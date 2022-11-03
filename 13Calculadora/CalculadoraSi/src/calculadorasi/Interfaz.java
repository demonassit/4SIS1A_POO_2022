/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasi;

/**
 *
 * @author demon
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Interfaz extends JFrame implements ActionListener {
    
    
    //definir los campos que son necesarios para interfaz
    JTextField txtnum1;
    JTextField txtnum2;
    //definir botones
    JButton btnresta;
    JButton btnsuma;
    JButton btnproducto;
    JButton btndivision;
    //etiquetas
    JLabel numero1;
    JLabel numero2;
    JLabel resultado;
    JLabel mostrarresultado;
    //panel
    JPanel panel = (JPanel)this.getContentPane();//contenedor de la interfaz
    
    Operaciones op = new Operaciones();
    
    //variables para las operaciones
    double num1, num2;
    
    //interfaz
    
    public Interfaz(){
    
        //aqui vamos a cargar con todo
        setLayout(null);
        //localizacion del panel
        setLocation(100, 80);
        //que no se pueda redimensionar
        setResizable(false);
        //definir el tamaño
        setSize(600, 600);
        //salir del programa cuando se cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //hay que cargar los componentes
        componentes();
    }
    


    private void componentes() {
        
        panel.setLayout(null);
        numero1 = new JLabel("Numero 1");
        numero1.setBounds(10, 10, 70, 30);
        panel.add(numero1);
        
        
        numero2 = new JLabel("Numero 2");
        numero2.setBounds(10, 70, 70, 30);
        panel.add(numero2);
        
        
        resultado = new JLabel("Resultado");
        resultado.setBounds(10, 140, 70, 30);
        panel.add(resultado);
        
        mostrarresultado = new JLabel("");
        mostrarresultado.setBounds(100, 140, 70, 30);
        panel.add(mostrarresultado);
        
        txtnum1 = new JTextField();
        txtnum1.setBounds(100, 10, 70, 30);
        panel.add(txtnum1);
        
        txtnum2 = new JTextField();
        txtnum2.setBounds(100, 70, 70, 30);
        panel.add(txtnum2);
        
        btnsuma = new JButton("+");
        btnsuma.setBounds(10, 200, 50, 50);
        panel.add(btnsuma);
        //mando a llamar el listener (accion)
        btnsuma.addActionListener(this);  //del metodo abstracto
        
        btnresta = new JButton("-");
        btnresta.setBounds(100, 200, 50, 50);
        panel.add(btnresta);
        //mando a llamar el listener (accion)
        btnresta.addActionListener(this);  //del metodo abstracto
        
        btnproducto = new JButton("*");
        btnproducto.setBounds(10, 270, 50, 50);
        panel.add(btnproducto);
        //mando a llamar el listener (accion)
        btnproducto.addActionListener(this);  //del metodo abstracto
        
        btndivision = new JButton("/");
        btndivision.setBounds(100, 270, 50, 50);
        panel.add(btndivision);
        //mando a llamar el listener (accion)
        btndivision.addActionListener(this);  //del metodo abstracto
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        //aqui adentro se diferencia las acciones
        //try catch
        if(event.getSource()==btnsuma){
            //estoy asignando a la variable num1 
            //el valor del campo de texto txtnum1 y 
            //lo estoy transformando a Double
            num1 = Double.parseDouble(txtnum1.getText());
            //enviar el valor
            op.setNum1(num1);
            
            num2 = Double.parseDouble(txtnum2.getText());
            
            op.setNum2(num2);
            
            //debo mostrar el resultado
            mostrarresultado.setText(String.valueOf(op.suma()));
        }
        
        if(event.getSource()==btnresta){
            //estoy asignando a la variable num1 
            //el valor del campo de texto txtnum1 y 
            //lo estoy transformando a Double
            num1 = Double.parseDouble(txtnum1.getText());
            //enviar el valor
            op.setNum1(num1);
            
            num2 = Double.parseDouble(txtnum2.getText());
            
            op.setNum2(num2);
            
            //debo mostrar el resultado
            mostrarresultado.setText(String.valueOf(op.resta()));
        }
        
    }
    
    //ñps eventos son las acciones de los botones

    
    
    
}