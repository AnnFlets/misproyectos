package modelo;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ModeloLogica {
    //Variables
    private String cadena;
    private Font fuente;
    private String ruta;
    
    //Constructor vacio
    public ModeloLogica(){
    }
    
    //Getters y Setters
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }
    
    //Métodos
    public void nuevoArchivo(){
        fuente = new Font("Dialog", Font.PLAIN, 12);
        this.cadena = "";
    }
    
    public void abrirArchivo(){
        File f;
        FileReader fr;
        BufferedReader br;
        try{
            f = new File(this.ruta);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String lineas;
            while((lineas = br.readLine())!=null){
                this.cadena += lineas + "\n";
            }
            fr.close();
        }catch(Exception e){
            DateTimeFormatter fechaHora = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            System.err.println(fechaHora.format(LocalDateTime.now()) +  " --- No se pudo realizar la acción solicitada");
        }        
    }
    
    public void guardarArchivo(){
        FileWriter fw;
        PrintWriter pw;
        try{
            fw = new FileWriter(this.ruta);
            pw = new PrintWriter(fw);
            pw.print(this.cadena);
            fw.close();
        }catch(Exception e){
            DateTimeFormatter fechaHora = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            System.err.println(fechaHora.format(LocalDateTime.now()) +  " --- No se pudo realizar la acción solicitada.");
        }
    }
    
    public String textoMayusculas(){
        this.cadena = this.cadena.toUpperCase();
        return this.cadena;
    }
    
    public String textoMinusculas(){
        this.cadena = this.cadena.toLowerCase();
        return this.cadena;
    }
    
    public void textoNegrita(){
        fuente = new Font("Dialog", Font.BOLD, 12);
    }
    
    public void textoNormal(){
        fuente = new Font("Dialog", Font.PLAIN, 12);
    }
}