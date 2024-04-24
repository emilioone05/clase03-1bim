package poo1;

/**
 *
 * @author utpl
 */
public class Vehiculo {
    String color;
    int velocidad;
    int traccion;
    int llantas;
    public Vehiculo(String color, int velocidad, int traccion, int llantas){
        this.color = color;
        this.velocidad = velocidad;
        this.traccion = traccion;
        this.llantas = llantas;
        System.out.println("El color del vehiculo es: " + color + " va a una velocidad de " + velocidad + " Km/h " + " y su traccion es " + traccion+"X"+traccion);
    }
    public void subirVelocidad(){
        System.out.println("Subir Velocidad");
    }
    public void bajarVelocidad(){
        System.out.println("Bajar Velocidad");
    }
    public void cambiarMarcha(){
        System.out.println("Cambiar Marcha "+ velocidad);
    }
    public void validarVehiculo(){
        String queEs;
        if (llantas == 2){
            queEs = "moto";
        }else if(llantas == 4){
            queEs = "Auto";
        }else if(llantas == 1 || llantas == 3 || llantas == 5){
            queEs = "A su Vehiculo le falta una llanta";
            System.out.println("POR FAVOR REPARELO. LA MAYORIA DE ACCIDENTES EXISTEN POR DEFECTOS DE LANTAS");
        }else{
            queEs = "Transporte de carga o Camion";
        }
        System.out.println("Su vehiculo es un/a: " + queEs );
    }
    public void setColor(String color1){
        color = color1;
    }
    public void setVelocidad(int velocidad1){
        velocidad = velocidad1;
    }
    public void setTraccion(int traccion1){
        traccion = traccion1;
    }
    public void setLlantas(int llantas1){
        llantas = llantas1;
    }
    public void getColor(){
        
    }
}
