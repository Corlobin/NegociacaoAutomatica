/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ricardo
 */
public enum EnumMensagemInicializacao {
    CRIADO("1"),
    EXISTENTE("2");
    
    private String key;
    EnumMensagemInicializacao(String key){
        this.key = key;
    }

    public String getKey() {
        return key;
    }
    
}
