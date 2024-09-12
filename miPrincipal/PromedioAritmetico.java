package miPrincipal;

public class PromedioAritmetico {
    //atributos
    private double cal1;
    private double cal2;
    private double cal3;

    //constructor
    public PromedioAritmetico(double cal1, double cal2, double cal3){
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;

    }
    //metodo para los calculos del promedio aritmetico
    public double calcularProm(){
        return (cal1 + cal2 + cal3 ) /3;
    }
    //metodo para probar el programa
    public static void main(String[] args) {
        PromedioAritmetico promAritmetico = new PromedioAritmetico(9.8, 8.7, 7.1);
        double promedio= promAritmetico.calcularProm();
        System.out.println("promedio aritmetico del alumno: "+promedio);
    }

}
