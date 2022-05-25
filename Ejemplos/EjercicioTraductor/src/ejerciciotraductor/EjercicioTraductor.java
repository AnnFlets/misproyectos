package ejerciciotraductor;

import controlador.Controlador;
import modelo.ModeloLogico;
import vista.FrmTraductor;

public class EjercicioTraductor {

    public static void main(String[] args) {
        FrmTraductor ventana = new FrmTraductor();
        ModeloLogico modeloL = new ModeloLogico();
        Controlador control = new Controlador(ventana, modeloL);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
    }
}