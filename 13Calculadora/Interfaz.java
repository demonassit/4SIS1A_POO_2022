
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Interfaz extends JFrame implements ActionListener {

    //definirmos los campos

    JTextField txtnum1;
    JTextField txtnum2;

    //definir botones

    JButton btnsuma;
    JButton btnresta;
    JButton btnproducto;
    JButton btndivision;

    //etiquetas

    JLabel numero1;
    JLabel numero2;
    JLabel resultado;
    JLabel mostrarresultado;

    //panel
    JPanel panel = (JPanel)this.getContentPane();//contenedor de la interfaz

    public Interfaz(){
        //inicilizar los elementos del frame
        setLayout(null);
        //localizacion
        setLocation(100, 80);
        //sin redinmensionar
        setResizable(false);
        //tamaño
        setSize(600, 600);
        //salir 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //cargar componentes
        componentes();
    }

    private void componentes(){

        //todas las etiquetas
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

        //agregar campos
        txtnum1 = new JTextField();
        txtnum1.setBounds(100, 10, 70, 30);
        panel.add(txtnum1);

        txtnum2 = new JTextField();
        txtnum2.setBounds(100, 70, 70, 30);
        panel.add(txtnum2);

        //botones

        btnsuma = new JButton("+");
        btnsuma.setBounds(10, 200, 50, 50);
        panel.add(btnsuma);
        //agregar el listener
        btnsuma.addActionListener(new ActionListener(this));

        btnresta = new JButton("-");
        btnresta.setBounds(100, 200, 50, 50);
        panel.add(btnresta);
        btnresta.addActionListener(new ActionListener(this));

        btnproducto = new JButton("*");
        btnproducto.setBounds(10, 270, 50, 50);
        panel.add(btnproducto);
        btnproducto.addActionListener(new ActionListener(this));

        btndivision = new JButton("/");
        btndivision.setBounds(100, 270, 50, 50);
        panel.add(btndivision);
        btndivision.addActionListener(new ActionListener(this));


    }

    @Override
    public void actionPerformed(ActionEvent event){
        //aqui es donde se deben diferenciar las acciones porque todos tienen el mismo evento
        Operaciones op = new Operaciones();

        if(event.getSource()==btnsuma){
            double num1 = Double.parseDouble(txtnum1.getText());
            op.setNum1(num1);
            double num2 = Double.parseDouble(txtnum2.getText());
            op.setNum1(num2);
            //mostrar el resultado
            mostrarresultado.setText(String.valueOf(op.suma()));

        }
    }




    
}
