package ar.org.centro8.entities;

public class AutoClasico extends Vehiculo {

   //Constructor sin radio, con precio.
    public AutoClasico(String marca, String modelo, String color, Double precio) {
        super(marca, modelo, color, precio);
    }


    //Constructor sin radio, sin precio.
    public AutoClasico(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }


    //Constructor con radio, sin  precio.
    public AutoClasico(String marca, String modelo, String color, String marcaRadio, String potenciaRadio) {
        super(marca, modelo, color, marcaRadio, potenciaRadio);
    }


    //Constructor con radio y precio.
    public AutoClasico(String marca, String modelo, String color, Double precio, String marcaRadio,
            String potenciaRadio) {
        super(marca, modelo, color, precio, marcaRadio, potenciaRadio);
    }



    @Override
    public String toString() {
        return super.toString()+"AutoClasico []";
    }

  

    @Override
    public String getColor() {
       
        return super.getColor();
    }

    @Override
    public String getMarca() {
       
        return super.getMarca();
    }

    @Override
    public String getModelo() {
        
        return super.getModelo();
    }

    @Override
    public Double getPrecio() {
       
        return super.getPrecio();
    }

    @Override
    public Radio getRadio() {
       
        return super.getRadio();
    }
    
}
