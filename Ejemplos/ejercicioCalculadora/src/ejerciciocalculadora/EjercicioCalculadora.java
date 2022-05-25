package ejerciciocalculadora;

import controlador.Controlador;
import modelo.ModeloLogico;
import vista.Calculadora;

public class EjercicioCalculadora {

    public static void main(String[] args) {
        Calculadora calcu = new Calculadora();
        ModeloLogico modelo = new ModeloLogico();
        Controlador controlador = new Controlador(calcu, modelo);
        calcu.setVisible(true);
        calcu.setLocationRelativeTo(null);
        calcu.setResizable(false);
        calcu.setSize(550,480);
    }
    
}
