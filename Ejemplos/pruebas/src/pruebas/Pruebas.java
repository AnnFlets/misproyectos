package pruebas;

public class Pruebas {
    
    public static void main(String[] args) {
        String palabra = "HOla";
        String caracter;
        for(int i = 0; i < palabra.length(); i++){
            caracter = String.valueOf(palabra.charAt(i));
            System.out.print(caracter);
        }
    }    
}
