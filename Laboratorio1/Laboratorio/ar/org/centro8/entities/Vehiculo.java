package ar.org.centro8.entities;

/*
*   Radio:
 * Una Radio solo puede estar en un Vehículo a la vez.
 * Una Radio siempre tiene marca, potencia.
 * 
 *  Vehiculo (Abstract):
 * Un Vehículo siempre tiene color marca modelo
 * Un Vehículo no siempre tiene precio.
 * Todos los vehículos pueden cambiar de radio.
 * En todos los vehículos se puede agregar una Radio.
 * 
 *AutoClasico:
 *Un Auto Clásico se puede fabricar sin Radio, después se puede agregar 1 Radio.

 *AutoNuevo:
 *Un Auto Nuevo siempre tiene Radio y se puede cambiar de Radio.

 *Colectivo:
 *Los Colectivos se pueden fabricar sin radio y después se puede agregar una radio.
 *No se pueden crear subproductos derivados del Colectivo.
 * 
 */
public abstract class Vehiculo{
   
    private String marca;
    private String modelo;
    private String color;
    private Double precio;
    private Radio radio;


   
    
    
    //Constructor sin radio, con precio.
     public Vehiculo(String marca, String modelo, String color, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

   
    //Constructor sin radio, sin precio.
    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //Constructor con radio, sin  precio.
     public Vehiculo(String marca, String modelo, String color, String marcaRadio, String potenciaRadio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.radio = new Radio(marcaRadio, potenciaRadio);
    }


    //Constructor con radio y precio.
     public Vehiculo(String marca, String modelo, String color, Double precio, String marcaRadio, String potenciaRadio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.radio = new Radio(marcaRadio, potenciaRadio);
    }


    




    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio
                + ", radio=" + radio + "]";
    }
    
  

   


   

    public void agregarRadio(String marcaRadio, String potenciaRadio){
        if(this.radio!=null) System.out.println("Este Vehiculo ya tiene radio");else{
            this.radio= new Radio(marcaRadio, potenciaRadio);
        }
    }

    public void modificarRadio(String marcaRadio, String potenciaRadio){
        if (this.radio!=null) this.radio= new Radio(marcaRadio, potenciaRadio); else System.out.println("Este vehiculo no tiene radio");
        
    }


    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }


    public String getColor() {
        return color;
    }


    public Double getPrecio() {
        return precio;
    }


    public Radio getRadio() {
        return radio;
    }

    







   





    
}

    