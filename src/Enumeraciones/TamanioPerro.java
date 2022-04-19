/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeraciones;

/**
 *
 * @author Walter
 */
public enum TamanioPerro {
    TOY_O_ENANO("Toy o Enano"),PEQUENIO("Pequeño"),MEDIANO("Mediano"),GRANDE("Grande"),GIGANTE("Gigante");
    
    private String valor;

    private TamanioPerro() {
    }
    
    private TamanioPerro(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
