package miPrincipal;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;

    }

    public LocalDate toLocalDate(){
        return LocalDate.of(año, mes, dia);
    }

    public static Fecha masProxima(Fecha fecha1, Fecha fecha2){
        LocalDate hoy = LocalDate.now();
        LocalDate localDate1 = fecha1.toLocalDate();
        LocalDate localDate2 = fecha2.toLocalDate();

        long dif1 = ChronoUnit.DAYS.between(hoy, localDate1);
        long dif2 = ChronoUnit.DAYS.between(hoy, localDate2);

        if (Math.abs(dif1) < Math.abs(dif2)) {
            return fecha1;
        } else {
            return fecha2;
        }
    }

    public String toString() {
        return dia + "/" + mes + "/" + año;
    }

    // Getters and Setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(28, 8, 2024);  
        Fecha fecha2 = new Fecha(13, 11, 2024);   

        System.out.println("fecha actual: " + LocalDate.now());
        System.out.println("fecha 1: " + fecha1);
        System.out.println("fecha 2: " + fecha2);

        Fecha fechaProxima = Fecha.masProxima(fecha1, fecha2);
        System.out.println("Fecha más próxima al día actual: " + fechaProxima);
    }

    }
