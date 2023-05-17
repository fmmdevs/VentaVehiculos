/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fmmdevs.ventavehiculos;

/**
 *
 * @author Francisco Martínez Marín
 */
public class Moto extends Vehiculo {

    private int numRuedas;

    public Moto() {
    }

    ;

    public Moto(String marca, String modelo, int añoFabricacion, int kms, int potenciaCV, double precio, TipoCombustible combustible, Medidas medidas, int numRuedas) {
        super(marca, modelo, añoFabricacion, kms, potenciaCV, precio, combustible, medidas);
        this.numRuedas = numRuedas;
    }

    public Moto(Moto moto) {
        setMarca(moto.getMarca());
        setModelo(moto.getModelo());
        setAñoFabricacion(moto.getAñoFabricacion());
        setKms(moto.getKms());
        setPotenciaCV(moto.getPotenciaCV());
        setPrecio(moto.getPrecio());
        setCombustible(moto.getCombustible());
        setMedidas(moto.getMedidas());
        numRuedas = moto.numRuedas;

    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    // REVISAR OVERRIDES
    @Override
    public int hashCode() {
        int hash = super.hashCode() + 7;
        hash = 59 * hash + this.numRuedas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        final Moto other = (Moto) obj;
        return (this.numRuedas == other.numRuedas && super.equals(obj));
    }

    @Override
    public String toString() {
        StringBuilder vehiculo = new StringBuilder(super.toString());
        vehiculo.replace(1, 9, "Moto");
        return vehiculo + "numRuedas=" + numRuedas + '}';
    }

}
