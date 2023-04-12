package ar.org.centro8.entities;

public class Radio {
    private String marca;
    private String potencia;

    public Radio(String marca, String potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }
    
    @Override
    public String toString() {
        return "Radio [marca=" + marca + ", potencia=" + potencia + "]";
    }
    public String getMarca() {
        return marca;
    }
    public String getPotencia() {
        return potencia;
    } 
    
    
}

    



