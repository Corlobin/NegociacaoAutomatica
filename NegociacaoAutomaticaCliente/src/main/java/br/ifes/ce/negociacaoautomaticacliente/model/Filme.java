/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.ce.negociacaoautomaticacliente.model;

import java.util.Set;

/**
 *
 * @author Ricardo
 */
public class Filme {
    private String titulo;
    private String sinopse;
    
    private Set<Diretor> diretores;
    private Set<Escritor> escritor;
    private Set<Genero> genero;    
    private Set<Artista> artistas;
    
    private Long popularidade;
    
        
}
