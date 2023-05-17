/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fmmdevs.ventavehiculos;

import java.util.Objects;

/**
 *
 * @author Francisco Martínez Marín
 */
public class Turismo extends Vehiculo {
    private Carroceria carroceria;
    
    
    public Turismo(String marca, String modelo, int añoFabricacion, int kms, int potenciaCV, double precio, TipoCombustible combustible, Medidas medidas,Carroceria carroceria){
        super(marca,modelo,añoFabricacion,kms,potenciaCV,precio,combustible,medidas);
        this.carroceria=carroceria;
    }
    public Turismo(){};
    public Turismo(Turismo turismo){
       
        setMarca(turismo.getMarca());
        setModelo(turismo.getModelo());
        setAñoFabricacion(turismo.getAñoFabricacion());
        setKms(getKms());
        setPotenciaCV(turismo.getPotenciaCV());
        setPrecio(turismo.getPrecio());
        setCombustible(turismo.getCombustible());
        setMedidas(turismo.getMedidas());
//        setTipoCarroceria(turismo.getTipoCarroceria());
        carroceria=turismo.carroceria;
    }

    
    
    //TERMINAR OVERRIDES

    @Override
    public int hashCode() {
        int hash = super.hashCode()+7;
        hash = 23 * hash + Objects.hashCode(this.carroceria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        final Turismo other = (Turismo) obj;
        return (Objects.equals(this.carroceria, other.carroceria)&&super.equals(obj));
    }

    @Override
    public String toString() {
        StringBuilder vehiculo=new StringBuilder(super.toString());
        vehiculo.replace(1, 9, "Turismo");
        return vehiculo+ "tipoCarroceria=" + carroceria + '}';
    }
    
    
    
    
    
}
