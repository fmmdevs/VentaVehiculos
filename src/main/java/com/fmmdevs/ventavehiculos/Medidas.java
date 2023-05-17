/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fmmdevs.ventavehiculos;

/**
 *
 * @author Francisco Martínez Marín
 */
public class Medidas {
    
    private double alto,ancho,largo;
    
    public Medidas(){};
    
    public Medidas(double alto,double ancho,double largo){
        this.alto=alto;
        this.ancho=ancho;
        this.largo=largo;
    }
    public Medidas(Medidas medidas){
        alto=medidas.alto;
        ancho=medidas.ancho;
        largo=medidas.largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.alto) ^ (Double.doubleToLongBits(this.alto) >>> 32));
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.ancho) ^ (Double.doubleToLongBits(this.ancho) >>> 32));
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.largo) ^ (Double.doubleToLongBits(this.largo) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Medidas other = (Medidas) obj;
        if (Double.doubleToLongBits(this.alto) != Double.doubleToLongBits(other.alto)) {
            return false;
        }
        if (Double.doubleToLongBits(this.ancho) != Double.doubleToLongBits(other.ancho)) {
            return false;
        }
        return Double.doubleToLongBits(this.largo) == Double.doubleToLongBits(other.largo);
    }

    @Override
    public String toString() {
        return "Medidas{" + "alto=" + alto + ", ancho=" + ancho + ", largo=" + largo + '}';
    }
    
    
    
}