package poo1;
import java.util.Scanner;
public class POO1 {
    public static void main(String[] args) {
        Scanner pi = new Scanner(System.in);
        Vehiculo siu = new Vehiculo(color ,velo, (int)trac,llantas);
        Conductor siuf = new Conductor(nombre, licencia,edad);
        System.out.println("Ingrese su nombre: ");
        String nombre = pi.nextLine();
        siu.nombre(nombre);
        System.out.println("Ingrese su tipo de licencia: ");
        String licencia = pi.nextLine();
        System.out.println("Ingrese su anio de nacimiento: ");
        int edad = pi.nextInt();
        System.out.println("Ingrese el color de su vehiculo: ");
        String color = pi.nextLine();
        System.out.println("Inngrese la velocidad a la que iba: ");
        int velo = pi.nextInt();
        System.out.println("Ingrese la traccion de su vehiculo: ");
        float trac = pi.nextFloat();
        System.out.println("Ingrese numero de llantas que posee su vehiculo: ");
        int llantas = pi.nextInt();
        if (velo >= 70){
            siu.bajarVelocidad();
        }
        siu.validarVehiculo();
        siuf.validarEdad();
        siuf.validarLicencia(licencia);
    }
    
}
