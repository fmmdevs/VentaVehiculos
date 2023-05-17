/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.fmmdevs.ventavehiculos;

/**
 *
 * @author Francisco Martínez Marín
 */
public class VentaVehiculos {

    public static void main(String[] args) {

        // TODO code application logic here
        Industrial ind1 = new Industrial("Peugeot", "308", 2020, 10000, 200, 50000.0, TipoCombustible.DIÉSEL, new Medidas(2.5, 2.5, 6.0), 5.0f);
        
        Industrial ind2 = new Industrial("Toyota", "Hilux", 2018, 5000, 150, 40000.0, TipoCombustible.GASOLINA, new Medidas(3.0, 3.0, 7.0), 7.0f);

        Industrial ind3 = new Industrial("Ford", "Transit", 2022, 2000, 300, 60000.0, TipoCombustible.HÍBRIDO, new Medidas(2.0, 2.0, 5.0), 3.0f);

        Moto moto1 = new Moto("Harley-Davidson", "Sportster Iron 883", 2020, 10000, 200, 50000.0, TipoCombustible.DIÉSEL, new Medidas(1.5, 1.0, 2.0), 2);

        Moto moto2 = new Moto("Honda", "CBR500R", 2018, 5000, 150, 40000.0, TipoCombustible.GASOLINA, new Medidas(1.8, 1.2, 2.5), 2);

        Moto moto3 = new Moto("Yamaha", "YZF-R6", 2022, 2000, 300, 60000.0, TipoCombustible.GLP, new Medidas(1.6, 1.0, 2.2), 2);

        Turismo turismo1 = new Turismo("Toyota", "Corolla", 2020, 10000, 200, 50000.0, TipoCombustible.DIÉSEL, new Medidas(1.5, 1.0, 2.0), Carroceria.BERLINA);

        Turismo turismo2 = new Turismo("BMW", "M4", 2018, 5000, 150, 40000.0, TipoCombustible.GASOLINA, new Medidas(1.8, 1.2, 2.5), Carroceria.DESCAPOTABLE);

        Turismo turismo3 = new Turismo("Audi", "Q5", 2022, 2000, 300, 60000.0, TipoCombustible.GLP, new Medidas(1.6, 1.0, 2.2), Carroceria.SUV);

//        System.out.println(ind1);
//        System.out.println(ind2);
//        System.out.println(ind3);
//        
//        System.out.println(moto1);
//        System.out.println(moto2);
//        System.out.println(moto3);
//        
//        System.out.println(turismo1);
//        System.out.println(turismo2);
//        System.out.println(turismo3);
        Usuario juan = new Usuario("Juan", "Pérez", "12/06/1995", "Madrid");
        Usuario ana = new Usuario("Ana", "García", "15/02/2000", "Barcelona");
        Usuario javi = new Usuario("Javi", "Aranjuez", "14/05/1999", "Murcia");

//        System.out.println(juan);
//        System.out.println(ana);
        juan.addToFavoritos(turismo1);
        juan.addToFavoritos(moto1);
        juan.addToFavoritos(ind1);
        
        System.out.println(juan.getFavoritos());
        
        juan.addToFavoritos(turismo3); // intento añadir pero la lista de favoritos está llena
        
        juan.delFavorito(1); // elimino el segundo vehiculo de mi lista de favoritos
        System.out.println(juan.getFavoritos());
        juan.addToFavoritos(turismo3);
        System.out.println(juan.getFavoritos());
        
        
        

        ana.addToFavoritos(turismo2);
        ana.addToFavoritos(moto2);
        ana.addToFavoritos(ind2);

        javi.addToFavoritos(turismo3);
        javi.addToFavoritos(moto3);
        javi.addToFavoritos(ind3);
        
        

        
        juan.setMiCoche(moto2);
        System.out.println(juan);
        
        
        ana.setMiCoche(moto1);
        System.out.println(ana);
        ana.delFavorito(0);
        ana.delFavorito(2);
        System.out.println(ana);
        
        javi.setMiCoche(moto3);
        System.out.println(javi);
        
        javi.delFavorito(0);
        javi.delFavorito(1);
        
        System.out.println(javi);
        
               
        

    }

}
