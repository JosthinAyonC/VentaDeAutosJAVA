
package clases;

public abstract class Vehiculo {
    private String color;
    private String placa;
    private String marca;
    private String modelo;
    
    public Vehiculo(String color, String placa, String marca, String modelo) {
        this.color = color;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Métodos getters y setters para los atributos
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public abstract String getTipo();
}