
package clases;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private String correo;
    private List<Vehiculo> compras;
    
    public Cliente(String nombre, String apellido, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.compras = new ArrayList<>();
    }
    
    // Métodos getters y setters para los atributos
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public List<Vehiculo> getCompras() {
        return compras;
    }
    
    public void agregarCompra(Vehiculo vehiculo) {
        compras.add(vehiculo);
    }
    
    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + correo + ")";
    }
}