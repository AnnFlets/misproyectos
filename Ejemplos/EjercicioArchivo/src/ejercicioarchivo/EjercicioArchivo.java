package ejercicioarchivo;

import controlador.Controlador;
import modelo.ModeloLogica;
import vista.FrmEditor;

public class EjercicioArchivo {

    public static void main(String[] args) {
        FrmEditor ventana = new FrmEditor();
        ModeloLogica modeloL = new ModeloLogica();
        Controlador control = new Controlador(ventana, modeloL);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setSize(529,611);
    }
}