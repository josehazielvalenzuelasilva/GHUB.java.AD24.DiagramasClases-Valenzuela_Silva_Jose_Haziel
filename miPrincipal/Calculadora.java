package miPrincipal;

public class Calculadora {
    private double val1;
    private double val2;

    //constructor
    public Calculadora(double val1, double val2){
        this.val1=val1;
        this.val2=val2;
    }

    //metodos de las operaciones aritmeticas
    public double sumar(){
        return val1 + val2;
    }

    public double restar(){
        return val1 - val2;
    }

    public double multiplicar(){
        return val1 * val2;
    }

    public double dividir(){
        if(val2 != 0){
            return val1 / val2;

        }else{
            System.out.println("error division por 0");
            return Double.NaN;
        }
    }

    public double residuo(){
        if (val2 != 0) {
            return val1 % val2;

        }else{
            System.out.println("error division por 0");
            return Double.NaN;
        }
    }

    //metodo para el uso de la calculadora
    public static void main(String[] args){
        Calculadora cal = new Calculadora(127, 27);

        System.out.println("sumar: "+cal.sumar());
        System.out.println("restar: "+cal.restar());
        System.out.println("multiplicar: "+cal.multiplicar());
        System.out.println("dividir: "+cal.dividir());
        System.out.println("residuo: "+cal.residuo());

    }

}
