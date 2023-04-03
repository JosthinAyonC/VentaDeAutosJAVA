
package clases;
public class Buseta extends Vehiculo {
    public Buseta(String color, String placa, String marca, String modelo) {
        super(color, placa, marca, modelo);
    }
    
    

    @Override
    public String getTipo() {
        return "Buseta";
    }
    
}