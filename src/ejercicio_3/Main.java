package ejercicio_3;

public class Main {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        
        byte edad = 23;
        persona1.setEdad(edad);
        persona1.setNombre("Mario");
        persona1.setTelefono(123456789);
        
        System.out.println("La persona registrada se llama " + persona1.getNombre() + " tiene " + persona1.getEdad() + " años y su tel es " + persona1.getTelefono());
        
    }
    
}

class Persona{
    private byte edad;
    private String nombre;
    private int telefono;

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
};