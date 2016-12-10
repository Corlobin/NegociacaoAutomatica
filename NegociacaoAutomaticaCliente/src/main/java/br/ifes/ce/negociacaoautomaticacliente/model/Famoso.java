/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.ce.negociacaoautomaticacliente.model;

import java.util.Date;
import java.util.Set;

/**
 *
 * @author Ricardo
 */
public abstract class Famoso extends Pessoa {
    
    private String biografia;
    private Set<Filme> filmes;

    public Set<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(Set<Filme> filmes) {
        this.filmes = filmes;
    }
    
    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getBiografia() {
        return biografia;
    }
        
    

}
