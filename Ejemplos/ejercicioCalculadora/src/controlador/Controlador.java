package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.ModeloLogico;
import vista.Calculadora;

public class Controlador implements ActionListener{
    Calculadora calcu = new Calculadora();
    ModeloLogico modelo = new ModeloLogico();
    
    public Controlador(Calculadora calcu, ModeloLogico modelo){
        this.calcu = calcu;
        this.modelo = modelo;
        this.calcu.lblFecha.setText(this.modelo.fechaActual());
        this.calcu.btnCero.addActionListener(this);
        this.calcu.btnUno.addActionListener(this);
        this.calcu.btnDos.addActionListener(this);
        this.calcu.btnTres.addActionListener(this);
        this.calcu.btnCuatro.addActionListener(this);
        this.calcu.btnCinco.addActionListener(this);
        this.calcu.btnSeis.addActionListener(this);
        this.calcu.btnSiete.addActionListener(this);
        this.calcu.btnOcho.addActionListener(this);
        this.calcu.btnNueve.addActionListener(this);
        this.calcu.btnSuma.addActionListener(this);
        this.calcu.btnResta.addActionListener(this);
        this.calcu.btnMultiplicacion.addActionListener(this);
        this.calcu.btnDivision.addActionListener(this);
        this.calcu.btnModulo.addActionListener(this);
        this.calcu.btnPotencia.addActionListener(this);
        this.calcu.btnPunto.addActionListener(this);
        this.calcu.btnIgual.addActionListener(this);
        this.calcu.btnAC.addActionListener(this);
        this.calcu.btnAbsoluto.addActionListener(this);
        this.calcu.btnRedondeo.addActionListener(this);
        this.calcu.btnSeno.addActionListener(this);
        this.calcu.btnCoseno.addActionListener(this);
        this.calcu.btnTangente.addActionListener(this);
        this.calcu.btnGuardar.addActionListener(this);
    }
    
    private void numCero(){
        numeroDespuesDeResultado();
        this.modelo.setCaracter("0");
        valorBotonATxt();
    }
    private void numUno(){
        numeroDespuesDeResultado();
        this.modelo.setCaracter("1");
        valorBotonATxt();
    }
    private void numDos(){
        numeroDespuesDeResultado();
        this.modelo.setCaracter("2");
        valorBotonATxt();
    }
    private void numTres(){
        numeroDespuesDeResultado();
        this.modelo.setCaracter("3");
        valorBotonATxt();
    }
    private void numCuatro(){
        numeroDespuesDeResultado();
        this.modelo.setCaracter("4");
        valorBotonATxt();
    }
    private void numCinco(){
        numeroDespuesDeResultado();
        this.modelo.setCaracter("5");
        valorBotonATxt();
    }
    private void numSeis(){
        numeroDespuesDeResultado();
        this.modelo.setCaracter("6");
        valorBotonATxt();
    }
    private void numSiete(){
        numeroDespuesDeResultado();
        this.modelo.setCaracter("7");
        valorBotonATxt();
    }
    private void numOcho(){
        numeroDespuesDeResultado();
        this.modelo.setCaracter("8");
        valorBotonATxt();
    }
    private void numNueve(){
        numeroDespuesDeResultado();
        this.modelo.setCaracter("9");
        valorBotonATxt();
    }
    private void signoSuma(){
        limpiarVariables();
        this.modelo.setCaracter("+");
        valorBotonATxt();
    }
    private void signoResta(){
        limpiarVariables();
        this.modelo.setCaracter("-");
        valorBotonATxt();
    }
    private void signoMultiplicacion(){
        limpiarVariables();
        this.modelo.setCaracter("x");
        valorBotonATxt();
    }
    private void signoDivision(){
        limpiarVariables();
        this.modelo.setCaracter("/");
        valorBotonATxt();
    }
    private void signoModulo(){
        limpiarVariables();
        this.modelo.setCaracter("%");
        valorBotonATxt();
    }
    private void signoPotencia(){
        limpiarVariables();
        this.modelo.setCaracter("^");
        valorBotonATxt();
    }
    private void signoPunto(){
        numeroDespuesDeResultado();
        this.modelo.setCaracter(".");
        valorBotonATxt();
    }
    private void signoSeno(){
        numeroDespuesDeResultado();
        this.modelo.setCaracter("S");
        valorBotonATxt();
    }
    private void signoCoseno(){
        numeroDespuesDeResultado();
        this.modelo.setCaracter("C");
        valorBotonATxt();
    }
    private void signoTangente(){
        numeroDespuesDeResultado();
        this.modelo.setCaracter("T");
        valorBotonATxt();
    }
    private void signoRedondeo(){
        numeroDespuesDeResultado();
        this.modelo.setCaracter("R");
        valorBotonATxt();
    }
    private void signoAbsoluto(){
        numeroDespuesDeResultado();
        this.modelo.setCaracter("A");
        valorBotonATxt();
    }
    private void valorBotonATxt(){
        this.modelo.escribirOperacion();
        this.calcu.txtOperacion.setText(this.modelo.getOperacion());
    }
    private void guardarArchivo(){
        this.calcu.fcrArchivo.setApproveButtonText("Guardar");
        FileNameExtensionFilter extension = new FileNameExtensionFilter(".txt", "txt");
        this.calcu.fcrArchivo.setFileFilter(extension);
        this.calcu.fcrArchivo.showSaveDialog(null);
        this.modelo.setRuta(this.calcu.fcrArchivo.getSelectedFile() + ".txt");
        this.modelo.guardarResultado();
    }
    private void resultadoOperacion(){
        this.modelo.realizarOperacion();
        this.calcu.txtOperacion.setText(String.valueOf(this.modelo.getResultado()));
    }
    private void borrarTodo(){
        limpiarVariables();
        this.modelo.setOperacion("");
        this.calcu.txtOperacion.setText(this.modelo.getOperacion());
    }
    private void limpiarVariables(){
        this.modelo.setN1("");
        this.modelo.setN2("");
        this.modelo.setCaracter("");
        this.modelo.setNumero1(0);
        this.modelo.setNumero2(0);
        this.modelo.setResultado(0);
        this.modelo.setOperacionRealizar(0);
        this.modelo.setValor("");
    }
    private void numeroDespuesDeResultado(){
        if(!(this.modelo.getValor().equals(""))){
            borrarTodo();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == calcu.btnCero){
            this.numCero();
        }
        if(ae.getSource() == calcu.btnUno){
            this.numUno();
        }
        if(ae.getSource() == calcu.btnDos){
            this.numDos();
        }
        if(ae.getSource() == calcu.btnTres){
            this.numTres();
        }
        if(ae.getSource() == calcu.btnCuatro){
            this.numCuatro();
        }
        if(ae.getSource() == calcu.btnCinco){
            this.numCinco();
        }
        if(ae.getSource() == calcu.btnSeis){
            this.numSeis();
        }
        if(ae.getSource() == calcu.btnSiete){
            this.numSiete();
        }
        if(ae.getSource() == calcu.btnOcho){
            this.numOcho();
        }
        if(ae.getSource() == calcu.btnNueve){
            this.numNueve();
        }
        if(ae.getSource() == calcu.btnSuma){
            this.signoSuma();
        }
        if(ae.getSource() == calcu.btnResta){
            this.signoResta();
        }
        if(ae.getSource() == calcu.btnMultiplicacion){
            this.signoMultiplicacion();
        }
        if(ae.getSource() == calcu.btnDivision){
            this.signoDivision();
        }
        if(ae.getSource() == calcu.btnModulo){
            this.signoModulo();
        }
        if(ae.getSource() == calcu.btnPotencia){
            this.signoPotencia();
        }
        if(ae.getSource() == calcu.btnPunto){
            this.signoPunto();
        }
        if(ae.getSource() == calcu.btnIgual){
            this.resultadoOperacion();
        }
        if(ae.getSource() == calcu.btnAC){
            this.borrarTodo();
        }
        if(ae.getSource() == calcu.btnAbsoluto){
            this.signoAbsoluto();
        }
        if(ae.getSource() == calcu.btnSeno){
            this.signoSeno();
        }
        if(ae.getSource() == calcu.btnCoseno){
            this.signoCoseno();
        }
        if(ae.getSource() == calcu.btnTangente){
            this.signoTangente();
        }
        if(ae.getSource() == calcu.btnRedondeo){
            this.signoRedondeo();
        }
        if(ae.getSource() == calcu.btnGuardar){
            this.guardarArchivo();
        }
    }
}