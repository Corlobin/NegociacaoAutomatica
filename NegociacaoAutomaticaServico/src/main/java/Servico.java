

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Ricardo
 */
public class Servico {
    private HashMap<String, String > solucaoParcial = new HashMap<>();
    private Set<String> clientes = new HashSet<>();
    private Stack pilha = new Stack();
    
    public String enviarInicializacao(String nome){
        if(!clientes.contains(nome)){
            clientes.add(nome);
            return "1";
        }else {
            return "2";
        }
    }
    
    public String enviarDesligamento(String nome){
        if(clientes.contains(nome)){
            clientes.remove(nome);
            return "1";
        }
        else
        {
            return "2";
        }
    }
    
    public String receberClientes(){
        String retorno = "";
        for(String k: clientes){
            retorno += k + ";";
        }
        return retorno;
    }
    
    public String enviarMarcacoes(String marcacoes){
        //RICARDO=AC;10|AV;10|FC;10|TR;10|GR;10|CM;10=L;T|M;T|C;T=1;3;4;5;
        //RICARDO
        //=
        //AC;10|AV;10|FC;10|TR;10|GR;10|CM;10
        //=
        //L;T|M;T|C;T
        //=
        //1;3;4;5;
        // FIM
        String[] lista = marcacoes.split("=");
        String nomePessoa = lista[0];
        String gostos = lista[1];
        String tempos = lista[2];
        String diretores = lista[3];
        
        // lista[0] = RICARDO
        solucaoParcial.put(nomePessoa, marcacoes);
        // lista[1] = AC;10|AV;10|FC;10|TR;10|GR;10|CM;10
        // lista[2] = L;T|M;T|C;T
        // lista[3] = 1;3;4;5;
        return gostos;
    }
    
    public String enviarAcao(String acao)
    {
        pilha.push(acao);
        return acao;
    }
    public String receberAcao(){
        if( pilha.isEmpty())
            return "vazia";
        String acao = (String) pilha.pop();
        return acao;
    }
    


    
    
}
