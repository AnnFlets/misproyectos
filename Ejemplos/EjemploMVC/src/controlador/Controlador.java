package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloLogico;
import vista.FrmOperaciones;

public class Controlador implements ActionListener{
    //Creacion de objetos a los cuales va a tener acceso el controlador
    FrmOperaciones vista = new FrmOperaciones();
    ModeloLogico modelo = new ModeloLogico();
    
    //Constructor
    public Controlador(FrmOperaciones vista, ModeloLogico modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnSumar.addActionListener(this);
        this.vista.btnRestar.addActionListener(this);
        this.vista.btnMultiplicar.addActionListener(this);
        this.vista.btnDividir.addActionListener(this);
    }
    
    //Funcionamiento del controlador
    private void sum(){
       //Proceso del controlador para trasladar los datos al modelo
       this.modelo.setN1(Double.parseDouble(this.vista.txtN1.getText()));
       this.modelo.setN2(Double.parseDouble(this.vista.txtN2.getText()));
       //Proceso del controlador de recibir y trasladar la respuesta a la vista
       vista.jopResultado.showMessageDialog(this.vista, modelo.suma());
    }
    private void rest(){
       //Proceso del controlador para trasladar los datos al modelo
       this.modelo.setN1(Double.parseDouble(this.vista.txtN1.getText()));
       this.modelo.setN2(Double.parseDouble(this.vista.txtN2.getText()));
       //Proceso del controlador de recibir y trasladar la respuesta a la vista
       vista.jopResultado.showMessageDialog(this.vista, modelo.resta());
        
    }
    
    private void mult(){
        //Proceso del controlador para trasladar los datos al modelo
       this.modelo.setN1(Double.parseDouble(this.vista.txtN1.getText()));
       this.modelo.setN2(Double.parseDouble(this.vista.txtN2.getText()));
       //Proceso del controlador de recibir y trasladar la respuesta a la vista
       vista.jopResultado.showMessageDialog(this.vista, modelo.multiplicacion());
    }
    
    private void div(){
        //Proceso del controlador para trasladar los datos al modelo
       this.modelo.setN1(Double.parseDouble(this.vista.txtN1.getText()));
       this.modelo.setN2(Double.parseDouble(this.vista.txtN2.getText()));
       //Proceso del controlador de recibir y trasladar la respuesta a la vista
       vista.jopResultado.showMessageDialog(this.vista, modelo.division());
    }

    //Metodo abstracto de la implementacion del ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnSumar){
            this.sum();
        }
        if(e.getSource() == vista.btnRestar){
            this.rest();
        }
        if(e.getSource() == vista.btnMultiplicar){
            this.mult();
        }
        if(e.getSource() == vista.btnDividir){
            this.div();
        }
    }
}