package Entidades;

import Enumeraciones.TamanioPerro;

public class Perro {
    private String nombre;
    private String raza;
    private Integer edad;
    private TamanioPerro tamanio;
    private Boolean adoptado;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, TamanioPerro tamanio,Boolean adoptado) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.adoptado= adoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public TamanioPerro getTamanio() {
        return tamanio;
    }

    public void setTamanio(TamanioPerro tamanio) {
        this.tamanio = tamanio;
    }

    public Boolean getAdoptado() {
        return adoptado;
    }

    public void setAdoptado(Boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre 
                + " - Raza: " + raza + " - edad: " + edad 
                + " - Tamaño: " + tamanio.getValor();
    }
}
