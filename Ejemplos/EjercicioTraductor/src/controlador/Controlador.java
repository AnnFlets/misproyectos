package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloLogico;
import vista.FrmTraductor;

public class Controlador implements ActionListener{
    FrmTraductor vista = new FrmTraductor();
    ModeloLogico modelo = new ModeloLogico();
    
    public Controlador(FrmTraductor vista, ModeloLogico modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnTraducir.addActionListener(this);
    }
    
    private void traducirP(){
        this.modelo.setPalabra((String)(this.vista.cbbPalabras.getSelectedItem()));
        this.vista.jopTraduccion.showMessageDialog(this.vista, this.modelo.traduccionPalabra());
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == vista.btnTraducir){
            this.traducirP();
        }
    }
}
