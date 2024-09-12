package miPrincipal;

public class MovimientoRectilineo {
    //atributos
    private double velocidad;
    private double tiempo;

    //constructor
    public MovimientoRectilineo(double velocidad, double tiempo){
        this.velocidad = velocidad;
        this.tiempo = tiempo;

    }

    //metodo para los calculos de la distancia
    public double CalcularDistancia(){
        return velocidad * tiempo;
    }

    //metodo para probar la clase
    public static void main(String[] args){
        MovimientoRectilineo mr = new MovimientoRectilineo(40, 12);
        double distancia = mr.CalcularDistancia();
        System.out.println("Distancia recorrida: "+distancia+" metros ");

    }


}
