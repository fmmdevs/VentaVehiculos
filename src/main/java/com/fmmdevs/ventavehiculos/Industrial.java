/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fmmdevs.ventavehiculos;

/**
 *
 * @author Francisco Martínez Marín
 */
public class Industrial extends Vehiculo implements Camperizable{
    private float tamCaja;
    
    public Industrial(String marca, String modelo, int añoFabricacion, int kms, int potenciaCV, double precio, TipoCombustible combustible, Medidas medidas,float tamCaja){
        super(marca,modelo,añoFabricacion,kms,potenciaCV,precio,combustible,medidas);
        this.tamCaja=tamCaja;
    }
    public Industrial(){};
    public Industrial(Industrial industrial){
        setMarca(industrial.getMarca());
        setModelo(industrial.getModelo());
        setAñoFabricacion(industrial.getAñoFabricacion());
        setKms(getKms());
        setPotenciaCV(industrial.getPotenciaCV());
        setPrecio(industrial.getPrecio());
        setCombustible(industrial.getCombustible());
        setMedidas(industrial.getMedidas());
        tamCaja=industrial.tamCaja;
    }

    public double getTamañoCaja() {
        return tamCaja;
    }

    public void setTamañoCaja(float tamCaja) {
        this.tamCaja = tamCaja;
    }
    
    //REVISAR OVERRIDES

    @Override
    public int hashCode() {
        int hash = super.hashCode()+3;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.tamCaja) ^ (Double.doubleToLongBits(this.tamCaja) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        final Industrial other = (Industrial) obj;
        return (Float.floatToIntBits(this.tamCaja) == Float.floatToIntBits(other.tamCaja)&& super.equals(obj));
    }

    

    @Override
    public String toString() {
        StringBuilder vehiculo=new StringBuilder(super.toString());
        vehiculo.replace(1, 9, "Industrial");
        return vehiculo+ "tama\u00f1oCaja=" + tamCaja + '}';
    }

    @Override
    public void añadirCama() {
        System.out.println("Cama añadida");
    }

    @Override
    public void añadirDucha() {
        System.out.println("Ducha añadida");
    }

    @Override
    public void añadirCocina() {
        System.out.println("Cocina añadida");
    }
    
    
    
}