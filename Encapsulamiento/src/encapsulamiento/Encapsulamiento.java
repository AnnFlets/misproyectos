package encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {
        Clase2 clase = new Clase2();
        
        clase.setNombre("Amelia");
        System.out.println("Nombre: " + clase.getNombre());
        clase.setTarjeta(21215616);
        System.out.println("Tarjeta: " + clase.getTarjeta());
    }
}