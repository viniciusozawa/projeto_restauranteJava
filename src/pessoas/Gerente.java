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
public class Gerente extends Usuarios{

    
    private int indice = 0;

    public Gerente(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        super.setId("admin");
    }
    
    
    
    
    public void cadastrarComida(String nome, double valor, Cardapio cardapio) {
        
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
