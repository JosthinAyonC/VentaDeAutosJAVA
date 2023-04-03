
package clases;
public class Trailer extends Vehiculo {
    public Trailer(String color, String placa, String marca, String modelo) {
        super(color, placa, marca, modelo);
    }
    

    @Override
    public String getTipo() {
        return "Trailer";
    }
}
