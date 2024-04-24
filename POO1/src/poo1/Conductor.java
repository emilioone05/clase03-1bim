package poo1;
public class Conductor {
    String nombre;
    String licencia;
    int edad;
    public Conductor(String nombre, String licencia, int edad){
        this.nombre = nombre;
        this.licencia = licencia;
        this.edad = edad;
        System.out.println("Hola!! " + nombre + " tu tipo de licencia es la Tipo " + licencia + " y eres "+ edad);        
    }
    public void validarEdad(){
        System.out.println("Usted nadie en el: " + edad);
        if(2024-(int)edad>18 ){
            System.out.println("Usted es menor de edad y es DELITO que maneje sin papeles");
        
        }else{
            System.out.println("Usted es legal, CIRCULE CON CUIDADO");
        }
    }
    public void validarLicencia(String tipo){
        if((licencia == "A" && tipo.equals(" moto "))||(licencia == "B" && tipo.equals("carro")) ||(licencia == "C" && tipo.equals(" taxi ")) || (licencia == "E" && tipo.equals(" Camiones de carga "))){
            System.out.println("Usted maneja legalmente.");
        }else{
            System.out.println("Usted no tiene la licencia indicada");
        }
    }
    
}
