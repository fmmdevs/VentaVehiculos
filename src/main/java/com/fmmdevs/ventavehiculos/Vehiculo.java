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
public abstract class Vehiculo {

    private String marca, modelo;
    private int añoFabricacion, kms, potenciaCV;
    private double precio;
    private TipoCombustible combustible;
    private Medidas medidas;

    public Vehiculo(String marca, String modelo, int añoFabricacion, int kms, int potenciaCV, double precio, TipoCombustible combustible, Medidas medidas) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.kms = kms;
        this.potenciaCV = potenciaCV;
        this.precio = precio;
        this.combustible = combustible;
        this.medidas = medidas;
    }

    public Vehiculo() {
    }

    ;


    public Vehiculo(Vehiculo vehiculo) {
        marca = vehiculo.marca;
        modelo = vehiculo.modelo;
        añoFabricacion = vehiculo.añoFabricacion;
        kms = vehiculo.kms;
        potenciaCV = vehiculo.potenciaCV;
        precio = vehiculo.precio;
        combustible = vehiculo.combustible;
        medidas = vehiculo.medidas;
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

    
    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    
    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    
    public int getKms() {
        return kms;
    }

    
    public void setKms(int kms) {
        this.kms = kms;
    }

   
    public int getPotenciaCV() {
        return potenciaCV;
    }

    
    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    
    public double getPrecio() {
        return precio;
    }

  
    public void setPrecio(double precio) {
        this.precio = precio;
    }

   
    public TipoCombustible getCombustible() {
        return combustible;
    }

   
    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }

    
    public Medidas getMedidas() {
        return medidas;
    }

   
    public void setMedidas(Medidas medidas) {
        this.medidas = medidas;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.marca);
        hash = 59 * hash + Objects.hashCode(this.modelo);
        hash = 59 * hash + this.añoFabricacion;
        hash = 59 * hash + this.kms;
        hash = 59 * hash + this.potenciaCV;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.combustible);
        hash = 59 * hash + Objects.hashCode(this.medidas);
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
        final Vehiculo other = (Vehiculo) obj;
        if (this.añoFabricacion != other.añoFabricacion) {
            return false;
        }
        if (this.kms != other.kms) {
            return false;
        }
        if (this.potenciaCV != other.potenciaCV) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (this.combustible != other.combustible) {
            return false;
        }
        return Objects.equals(this.medidas, other.medidas);
    }

    
    @Override
    public String toString() {
        return "-Vehiculo{" + "Marca=" + marca + ", Modelo=" + modelo
                + ", a\u00f1oFabricacion=" + añoFabricacion + ", Kms=" + kms
                + ", PotenciaCV=" + potenciaCV + ", Precio=" + precio
                + ", Combustible=" + combustible + ", Medidas=" + medidas + '}';
    }

    /**
     * Calcula la potencia del vehículo en KW.
     *
     * @return la potencia del vehículo en KW.
     */
    public double getPotenciaKW() {
        return potenciaCV / 1.34;
    }

}
