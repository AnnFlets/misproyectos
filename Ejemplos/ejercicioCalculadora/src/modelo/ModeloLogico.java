package modelo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ModeloLogico {

    //VARIABLES
    private double numero1 = 0;
    private double numero2 = 0;
    private String n1 = "";
    private String n2 = "";
    private double resultado = 0;
    private String operacion = "";
    private String caracter = "";
    private int operacionRealizar = 0;
    private String valor = "";
    private String fecha;
    private String ruta;

    //CONSTRUCTOR
    public ModeloLogico() {
    }
    
    //GETTERS Y SETTERS
    public double getNumero1() {
        return numero1;
    }
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    public double getNumero2() {
        return numero2;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public String getOperacion() {
        return operacion;
    }
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    public String getCaracter() {
        return caracter;
    }
    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }
    public String getN1() {
        return n1;
    }
    public void setN1(String n1) {
        this.n1 = n1;
    }
    public String getN2() {
        return n2;
    }
    public void setN2(String n2) {
        this.n2 = n2;
    }
    public int getOperacionRealizar() {
        return operacionRealizar;
    }
    public void setOperacionRealizar(int operacionRealizar) {
        this.operacionRealizar = operacionRealizar;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getRuta() {
        return ruta;
    }
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    //METODOS
    public void guardarResultado(){
        FileWriter fw;
        PrintWriter pw;
        try{
            fw = new FileWriter(this.ruta);
            pw = new PrintWriter(fw);
            pw.print("RESULTADO: " + this.resultado);
            fw.close();
        }catch(Exception e){
            DateTimeFormatter fechaHora = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            System.err.println(fechaHora.format(LocalDateTime.now()) +  " --- No se pudo realizar la acción solicitada.");
        }
    }
    public void escribirOperacion() {
        switch (caracter) {
            case "0":
                operacion += caracter;
                break;
            case "1":
                operacion += caracter;
                break;
            case "2":
                operacion += caracter;
                break;
            case "3":
                operacion += caracter;
                break;
            case "4":
                operacion += caracter;
                break;
            case "5":
                operacion += caracter;
                break;
            case "6":
                operacion += caracter;
                break;
            case "7":
                operacion += caracter;
                break;
            case "8":
                operacion += caracter;
                break;
            case "9":
                operacion += caracter;
                break;
            case "+":
                operacion += caracter;
                break;
            case "-":
                operacion += caracter;
                break;
            case "x":
                operacion += caracter;
                break;
            case "/":
                operacion += caracter;
                break;
            case "%":
                operacion += caracter;
                break;
            case "^":
                operacion += caracter;
                break;
            case ".":
                operacion += caracter;
                break;
            case "S":
                operacion += caracter;
                break;
            case "C":
                operacion += caracter;
                break;
            case "T":
                operacion += caracter;
                break;
            case "R":
                operacion += caracter;
                break;
            case "A":
                operacion += caracter;
            default:
                break;
        }
    }

    public void realizarOperacion() {
        for (int i = 0; i < operacion.length(); i++) {
            caracter = String.valueOf(operacion.charAt(i));
            switch (caracter) {
                case "+":
                    operacionRealizar = 1;
                    break;
                case "-":
                    operacionRealizar = 2;
                    break;
                case "x":
                    operacionRealizar = 3;
                    break;
                case "/":
                    operacionRealizar = 4;
                    break;
                case "%":
                    operacionRealizar = 5;
                    break;
                case "^":
                    operacionRealizar = 6;
                    break;
                case "S":
                    operacionRealizar = 7;
                    break;
                case "C":
                    operacionRealizar = 8;
                    break;
                case "T":
                    operacionRealizar = 9;
                    break;
                case "R":
                    operacionRealizar = 10;
                    break;
                case "A":
                    operacionRealizar = 11;
                    break;
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "0":
                case ".":
                    if (operacionRealizar == 0) {
                        n1 += caracter;
                    }else if(operacionRealizar > 0){
                        n2 += caracter;
                    }
                    break;
            }
        }
        caracter = String.valueOf(operacion.charAt(0));
        if(caracter.equals("S")||caracter.equals("C")||caracter.equals("T")||caracter.equals("R")||caracter.equals("A")){
            numero2 = Double.parseDouble(n2);
        }else{
            numero1 = Double.parseDouble(n1);
            numero2 = Double.parseDouble(n2);
        }
        switch (operacionRealizar) {
            case 1:
                resultadoSuma();
                break;
            case 2:
                resultadoResta();
                break;
            case 3:
                resultadoMultiplicacion();
                break;
            case 4:
                resultadoDivision();
                break;
            case 5:
                resultadoModulo();
                break;
            case 6:
                resultadoPotencia();
                break;
            case 7:
                resultadoSeno();
                break;
            case 8:
                resultadoCoseno();
                break;
            case 9:
                resultadoTangente();
                break;
            case 10:
                resultadoRedondeo();
                break;
            case 11:
                resultadoAbsoluto();
                break;
            default:
                break;
        }
        operacion = String.valueOf(resultado);
        valor = "Z";
    }
    
    public void resultadoSuma() {
        this.resultado = this.numero1 + this.numero2;
    }

    public void resultadoResta() {
        this.resultado = this.numero1 - this.numero2;
    }

    public void resultadoMultiplicacion() {
        this.resultado = this.numero1 * this.numero2;
    }

    public void resultadoDivision() {
        this.resultado = this.numero1 / this.numero2;
    }

    public void resultadoModulo() {
        this.resultado = this.numero1 % this.numero2;
    }

    public void resultadoPotencia() {
        this.resultado = Math.pow(this.numero1, this.numero2);
    }
    
    public void resultadoAbsoluto(){
        this.resultado = Math.abs(numero2);
    }
    public void resultadoRedondeo(){
        this.resultado = Math.round(numero2);
    }
    public void resultadoSeno(){
        this.resultado = Math.sin(numero2);
    }
    public void resultadoCoseno(){
        this.resultado = Math.cos(numero2);
    }
    public void resultadoTangente(){
        this.resultado = Math.tan(numero2);
    }
    public String fechaActual() {
        DateTimeFormatter fechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha = (String) (fechaHora.format(LocalDateTime.now()));
        return this.fecha;
    }
}