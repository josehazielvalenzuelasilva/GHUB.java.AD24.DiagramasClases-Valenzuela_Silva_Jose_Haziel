package miPrincipal;

public class Empleado {
    // Atributos de la clase
    private int id;
    private double salario;
    private int maxHorasTrabajo;
    private boolean seguridadSocial;
    private boolean seguroContratado;

    // Constructor para inicializar los datos del empleado
    public Empleado(int id, double salario, int maxHorasTrabajo) {
        this.id = id;
        this.salario = salario;
        this.maxHorasTrabajo = maxHorasTrabajo;
        this.seguridadSocial = false; // El empleado no está dado de alta inicialmente
        this.seguroContratado = false; // El seguro no está contratado inicialmente
    }

    // Métodos para ingresar datos de un nuevo empleado
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setMaxHorasTrabajo(int maxHorasTrabajo) {
        this.maxHorasTrabajo = maxHorasTrabajo;
    }

    // Método para visualizar los datos del empleado
    public void mostrarDatos() {
        System.out.println("ID del Empleado: " + id);
        System.out.println("salario: " + salario);
        System.out.println("horas de trabajo máximas por semana: " + maxHorasTrabajo);
        System.out.println("alta en Seguridad Social: " + (seguridadSocial ? "Sí" : "No"));
        System.out.println("seguro contratado: " + (seguroContratado ? "Sí" : "No"));
    }

    // Métodos para dar de alta y baja en la Seguridad Social
    public void darAltaSeguridadSocial() {
        if (!seguridadSocial) {
            seguridadSocial = true;
            System.out.println("el empleado ha sido dado de alta en la Seguridad Social.");
        } else {
            System.out.println("el empleado ya está dado de alta en la Seguridad Social.");
        }
    }

    public void darBajaSeguridadSocial() {
        if (seguridadSocial) {
            seguridadSocial = false;
            System.out.println("el empleado ha sido dado de baja en la Seguridad Social.");
        } else {
            System.out.println("el empleado no está dado de alta en la Seguridad Social.");
        }
    }

    // Métodos para gestionar el seguro contratado
    public void contratarSeguro() {
        if (!seguroContratado) {
            seguroContratado = true;
            System.out.println("el empleado ha contratado el seguro.");
        } else {
            System.out.println("el empleado ya tiene el seguro contratado.");
        }
    }

    public void cancelarSeguro() {
        if (seguroContratado) {
            seguroContratado = false;
            System.out.println("el empleado ha cancelado el seguro.");
        } else {
            System.out.println("el empleado no tiene seguro contratado.");
        }
    }

    public static void main(String[] args) {

        Empleado empleado = new Empleado(354, 6000, 45);

        // Mostrar los primeros datos ingresados
        System.out.println("Datos iniciales del empleado:");
        empleado.mostrarDatos();

        // Dar de alta al empleado en la seguridad social
        System.out.println("\nDando de alta en la Seguridad Social:");
        empleado.darAltaSeguridadSocial();

        // Contratar un seguro para el empleado
        System.out.println("\nContratando seguro:");
        empleado.contratarSeguro();

        // Mostrar los datos del empleado actualizados
        System.out.println("\nDatos actualizados del empleado:");
        empleado.mostrarDatos();

        // Dar de baja al empleado de la seguridad social
        System.out.println("\nDando de baja en la Seguridad Social:");
        empleado.darBajaSeguridadSocial();

        // Cancelar el seguro del empleado
        System.out.println("\nCancelando seguro:");
        empleado.cancelarSeguro();

        // Mostrar los datos finales del empleado
        System.out.println("\nDatos finales del empleado:");
        empleado.mostrarDatos();
    }

}
