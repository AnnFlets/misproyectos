package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.ModeloLogica;
import vista.FrmEditor;

public class Controlador implements ActionListener{
    //Objetos
    FrmEditor vista = new FrmEditor();
    ModeloLogica modelo = new ModeloLogica();

    //Constructor
    public Controlador(FrmEditor vista, ModeloLogica modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.miNuevo.addActionListener(this);
        this.vista.miAbrir.addActionListener(this);
        this.vista.miGuardar.addActionListener(this);
        this.vista.miMayusculas.addActionListener(this);
        this.vista.miMinusculas.addActionListener(this);
        this.vista.miNegrita.addActionListener(this);
        this.vista.miNormal.addActionListener(this);
    }
    
    //Métodos
    private void miNuevoArchivo(){
        this.vista.setVisible(false);
        this.modelo.nuevoArchivo();
        this.vista.txtaBloc.setFont(this.modelo.getFuente());
        this.vista.txtaBloc.setText(this.modelo.getCadena());
        this.vista.setVisible(true); 
    }
    
    private void abrirMiArchivo(){
        this.vista.fcrArchivos.setApproveButtonText("Abrir");
        this.vista.fcrArchivos.showOpenDialog(null);
        this.modelo.setRuta(this.vista.fcrArchivos.getSelectedFile() + "");
        this.modelo.setCadena("");
        this.vista.txtaBloc.setText(this.modelo.getCadena());
        this.modelo.abrirArchivo();
        this.vista.txtaBloc.setText(this.modelo.getCadena());
        
    }
    
    private void guardarMiArchivo(){
        this.vista.fcrArchivos.setApproveButtonText("Guardar");
        FileNameExtensionFilter extensionArchivo = new FileNameExtensionFilter(".txt", "txt");
        this.vista.fcrArchivos.setFileFilter(extensionArchivo);
        this.vista.fcrArchivos.showSaveDialog(null);
        this.modelo.setCadena((String)(this.vista.txtaBloc.getText()));
        this.modelo.setRuta(this.vista.fcrArchivos.getSelectedFile() + ".txt");
        this.modelo.guardarArchivo();
    }
    
    private void convertirMayusculas(){
        this.modelo.setCadena((String)(this.vista.txtaBloc.getText()));
        this.vista.txtaBloc.setText(this.modelo.textoMayusculas());
    }
    
    private void convertirMinusculas(){
        this.modelo.setCadena((String)(this.vista.txtaBloc.getText()));
        this.vista.txtaBloc.setText(this.modelo.textoMinusculas());
    }
    
    public void convertirNegrita(){
        this.modelo.setCadena((String)(this.vista.txtaBloc.getText()));
        this.modelo.textoNegrita();
        this.vista.txtaBloc.setFont(this.modelo.getFuente());
    }
    
    public void convertirNormal(){
        this.modelo.setCadena((String)(this.vista.txtaBloc.getText()));
        this.modelo.textoNormal();
        this.vista.txtaBloc.setFont(this.modelo.getFuente());
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == vista.miNuevo){
            this.miNuevoArchivo();
        }
        if(ae.getSource() == vista.miAbrir){
            this.abrirMiArchivo();
        }
        if(ae.getSource() == vista.miGuardar){
            this.guardarMiArchivo();
        }
        if(ae.getSource() == vista.miMayusculas){
            this.convertirMayusculas();
        }
        if(ae.getSource() == vista.miMinusculas){
            this.convertirMinusculas();
        }
        if(ae.getSource() == vista.miNegrita){
            this.convertirNegrita();
        }
        if(ae.getSource() == vista.miNormal){
            this.convertirNormal();
        }
    }
}