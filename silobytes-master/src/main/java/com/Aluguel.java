/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.Serializable;

/**
 *
 * @author Antonio
 */
public class Aluguel implements Serializable{
    private int dias;
    private double toneladas;
    private double preco;
    
    
     Aluguel(){
        this.dias = dias; 
        this.toneladas = toneladas;
        this.preco = preco;
    }

    

   
    /**
     * @return the dias
     */
    public int getDias() {
        return dias;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

    /**
     * @return the toneladas
     */
    public double getToneladas() {
        return toneladas;
    }

    /**
     * @param toneladas the toneladas to set
     */
    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
