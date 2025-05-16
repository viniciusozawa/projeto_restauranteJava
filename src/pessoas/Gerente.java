/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoas;

import acoes.Cardapio;

/**
 *
 * @author Otávio
 */
public class Gerente {

    private String nome;
    private String cpf;
    private String id;
    
    public Gerente(){
        this.id = "admin";
    }
    
    public Gerente(String nome, String cpf ){
        this();
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    
    
    
    
    public void cadastrarComida(String nome, double valor, Cardapio cardapio) {
        int indice = 0;
        if (indice < 5) {
            for (int i = 0; i < 1; i++) {
                
                //cardapio.comida[this.indice] = nome;
                cardapio.setComida(nome, indice);
                //cardapio.valor[this.indice] = valor;
                cardapio.setValor(valor, indice);
                indice++;
                
            }
        } else{
            System.out.println("Cardápio Cheio");
        }          
    }
}
