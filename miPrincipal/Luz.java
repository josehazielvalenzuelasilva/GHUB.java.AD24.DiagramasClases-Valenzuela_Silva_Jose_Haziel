package miPrincipal;

public class Luz {
    private String color;

    //contructor empieza en rojo
    public Luz (){
        this.color = "rojo";
    }

    //metodo para cambiar el color al semaforo
    public void cambio(){
        switch (color) {
            case "rojo":
                color = "verde";
                break;
                case "verde":
                color = "amarillo";
                break;
                case "amarillo":
                color = "rojo";
                break;
            default:
                throw new IllegalStateException("color desconosido: "+color);
        }
    }
    //metodo para obtener el color actual
    public String getColor(){
        return color;
    }

    public static void main(String[] args) {
        Luz semaforo = new Luz();

        //visualizacion y cambio de color del semaforo
        System.out.println("Color inicial: " + semaforo.getColor());
        
        semaforo.cambio();
        System.out.println("Después del primer cambio: " + semaforo.getColor());
        
        semaforo.cambio();
        System.out.println("Después del segundo cambio: " + semaforo.getColor());
        
        semaforo.cambio();
        System.out.println("Después del tercer cambio: " + semaforo.getColor());
        
        semaforo.cambio();
        System.out.println("Después del cuarto cambio: " + semaforo.getColor());
    }


}
