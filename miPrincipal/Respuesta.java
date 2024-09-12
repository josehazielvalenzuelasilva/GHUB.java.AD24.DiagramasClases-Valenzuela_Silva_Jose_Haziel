package miPrincipal;

public class Respuesta {
    //atributos
    private int respuestaCorrecta;
    private int respuestaIncorrecta;
    private int respuestaBlanco;

    //constructor
    public Respuesta(int respuestaCorrecta, int respuestaIncorrecta, int respuestaBlanco){
        this.respuestaCorrecta = respuestaCorrecta;
        this.respuestaIncorrecta = respuestaIncorrecta;
        this.respuestaBlanco = respuestaBlanco;

    }

    //metodo para obtener los calculos de los puntajes
    public int calcularPuntaje(){
        int correctas = 4;
        int incorecta = -1;
        int blanco = 0;

        return(respuestaCorrecta*correctas)+(respuestaIncorrecta*incorecta)+(respuestaBlanco*blanco);

    }

    //metodo para correr el programa
    public static void main(String[] args) {
        Respuesta respuesta = new Respuesta(10,2,1);
        int puntaje = respuesta.calcularPuntaje();
        System.out.println("puntaje total: "+ puntaje);
    }

}
