package ar.org.centro8.test;

import ar.org.centro8.entities.AutoClasico;
import ar.org.centro8.entities.AutoNuevo;
import ar.org.centro8.entities.Colectivo;
import ar.org.centro8.entities.Radio;

public class TestVehiculos {
    public static void main(String[] args) {

       System.out.println("------Radio------");
        Radio radio1= new Radio("Sony", "5Kw");
        System.out.println(radio1.getMarca());
        System.out.println(radio1.getPotencia());
        System.out.println(radio1);


       
        System.out.println("------AutoNuevo1------");
        AutoNuevo autonuevo1= new AutoNuevo("Fiat", "C3", "Azul", 300000., "Sony", "2Kw");
        System.out.println(autonuevo1);
        autonuevo1.modificarRadio("Samsung", "10Kw");
        System.out.println(autonuevo1);
        autonuevo1.agregarRadio("sony", "8Kw");

        System.out.println("------AutoNuevo2------");
        System.out.println("------Sin precio------");
        AutoNuevo autonuevo2= new AutoNuevo("Renault", "C3", "Negro", "Phillips", "10kw");
        System.out.println(autonuevo2);
        autonuevo2.modificarRadio("Sony", "20Kw");
        System.out.println(autonuevo2);
        autonuevo2.agregarRadio("Samsung", "10Kw");


        
        System.out.println("------AutoClasico1------");
        System.out.println("-Sin radio, con precio-");
        AutoClasico autoclasico1= new AutoClasico("BMW", "G3", "Amarillo", 300000.);
        System.out.println(autoclasico1);
        autoclasico1.modificarRadio("Sony", "20Kw");
        autoclasico1.agregarRadio("Sony", "20Kw");
        System.out.println(autoclasico1);
        autoclasico1.modificarRadio("samsumg", "40Kw");
        System.out.println(autoclasico1);


        System.out.println("------AutoClasico2------");
        System.out.println("--Sin radio ni precio--");
        AutoClasico autoclasico2= new AutoClasico("Dodge", "F1", "Gris");
        System.out.println(autoclasico2);
        autoclasico2.modificarRadio("Phillips", "50Kw");
        autoclasico2.agregarRadio("Sony", "50Kw");
        System.out.println(autoclasico2);
        autoclasico2.modificarRadio("Phillips", "50Kw");
        System.out.println(autoclasico2);


        System.out.println("------AutoClasico3------");
        System.out.println("---Con radio y precio---");
        AutoClasico autoclasico3= new AutoClasico("Chevrolet", "p9", "Marron", 780000., "JBL", "80Kw");
        System.out.println(autoclasico3);
        autoclasico3.modificarRadio("Phillips", "50Kw");
        System.out.println(autoclasico3);
        autoclasico3.agregarRadio("Sony", "50Kw");


        System.out.println("------AutoClasico4------");
        System.out.println("-Con radio, sin precio-");
        AutoClasico autoclasico4= new AutoClasico("BMW", "T8", "Verde", "JBL", "30Kw");
        System.out.println(autoclasico4);
        autoclasico4.modificarRadio("Phillips", "50Kw");
        System.out.println(autoclasico4);
        autoclasico4.agregarRadio("Sony", "50Kw");
        






        System.out.println("------Colectivo1------");
        System.out.println("-Sin radio, con precio-");
        Colectivo colectivo1= new Colectivo("BMW", "c149", "Celeste", 300000.);
        System.out.println(colectivo1);
        colectivo1.modificarRadio("Samsung", "100Kw");
        colectivo1.agregarRadio("Sony", "300Kw");
        System.out.println(colectivo1);


        System.out.println("------Colectivo2------");
        System.out.println("--Sin radio ni precio--");
        Colectivo colectivo2=new Colectivo("Marcopolo", "N303", "Amarillo");
        System.out.println(colectivo2);
        colectivo2.modificarRadio("Phillips", "120Kw");
        colectivo2.agregarRadio("Phillips", "150Kw");
        System.out.println(colectivo2);


        System.out.println("------Colectivo3------");
        System.out.println("---Con radio y precio---");
        Colectivo colectivo3=new Colectivo("BMW", "J5", "Blanco", 500000., "Kingston", "200Kw");
        System.out.println(colectivo3);
        colectivo3.modificarRadio("Phillips", "120Kw");
        System.out.println(colectivo3);
        colectivo3.agregarRadio("Phillips", "150Kw");
        


        System.out.println("------Colectivo4------");
        System.out.println("-Con radio, sin precio-");
        Colectivo colectivo4=new Colectivo("Metropol", "L2", "Naranja", "JBL", "200Kw");
        System.out.println(colectivo4);
        colectivo4.modificarRadio("Phillips", "120Kw");
        System.out.println(colectivo4);
        colectivo4.agregarRadio("Phillips", "150Kw");

        












    }

    
}
