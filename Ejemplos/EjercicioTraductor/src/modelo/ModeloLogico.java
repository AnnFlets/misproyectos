package modelo;

public class ModeloLogico {
    private String palabra;
    
    public ModeloLogico(){
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    public String traduccionPalabra(){
        String palabraT;
        switch(palabra){
            case "gato":
                palabraT = "cat";
                break;
            case "manzana":
                palabraT = "apple";
                break;
            case "libro":
                palabraT = "book";
                break;
            case "agua":
                palabraT = "water";
                break;
            case "perro":
                palabraT = "dog";
                break;
            case "amarillo":
                palabraT = "yellow";
                break;
            case "rojo":
                palabraT = "red";
                break;
            case "azul":
                palabraT = "blue";
                break;
            default:
                palabraT = "";
        }
        return palabraT;
    }
}