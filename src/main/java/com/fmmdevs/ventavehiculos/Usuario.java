/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fmmdevs.ventavehiculos;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Francisco Martínez Marín
 */
public class Usuario {

    private String nombre, apellido, fechaNac, provincia;
    private Vehiculo miCoche;
//    private ArrayList<Vehiculo> favoritos= new ArrayList<>(3);
    private Vehiculo[] favoritos = new Vehiculo[3];

    public Usuario(String nombre, String apellido, String fechaNac, String provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.provincia = provincia;
    }

    public Usuario() {
    }

    ;
    
    public Usuario(Usuario usuario) {
        nombre = usuario.nombre;
        apellido = usuario.apellido;
        fechaNac = usuario.fechaNac;
        provincia = usuario.provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.apellido);
        hash = 47 * hash + Objects.hashCode(this.fechaNac);
        hash = 47 * hash + Objects.hashCode(this.provincia);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.fechaNac, other.fechaNac)) {
            return false;
        }
        return Objects.equals(this.provincia, other.provincia);
    }

    @Override
    public String toString() {
        return "\n\n-----------------------------------------------------------------------------------------\nUsuario:\n" + "-Nombre=" + nombre + ", Apellido=" + apellido + ", FechaNac=" + fechaNac + ", Provincia=" + provincia + "\n\n" + getFavoritos() + "\nCoche en Venta: \n" + miCoche.toString() + "-----------------------------------------------------------------------------------------";
    }

    // METODOS EXTRA
    public void addToFavoritos(Vehiculo vehiculo) {
        if (favoritos.length <= 3) {
            int emptyIndex = -1;
            for (int i = 0; i < favoritos.length; i++) {
                if (favoritos[i] == null) {
                    emptyIndex = i;
                    break;
                }
            }
            if (emptyIndex != -1) {
                favoritos[emptyIndex] = vehiculo;
            } else {
                System.out.println("La lista de favoritos está llena");
            }
        }
    }

    public String getFavoritos() {
        String aux = "";
        for (Vehiculo favorito : favoritos) {
            if (favorito != null) {
                aux += favorito.toString() + "\n";
            }
        }
        return "Lista de favoritos de " + this.getNombre() + " " + this.getApellido() + " :\n" + aux;
    }

    public void delFavorito(int index) {
        if (index >= 0 && index < favoritos.length) {
            favoritos[index] = null;
        }
    }

    public String getMiCoche() {
        return miCoche.toString();
    }

    public void setMiCoche(Vehiculo vehiculo) {
        miCoche = vehiculo;
    }

}
