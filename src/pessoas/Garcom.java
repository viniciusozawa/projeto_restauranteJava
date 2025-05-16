/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoas;
import acoes.Cardapio;
import acoes.Comanda;
import acoes.Pagamento;
import java.util.Arrays;
/**
 *
 * @author Otávio
 */
public class Garcom {
    private String nome;
    private String id;
    
    public Garcom(){
        this.id = "Funcionário";
    } 
    
    public Garcom(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    public void fazerPedido(Cardapio cardapio,Comanda comanda, int pedido1 , int pedido2){
        
        comanda.setnomeComida(cardapio.getComida(pedido1), 0);
        comanda.setValorComida(cardapio.getValor(pedido1), 0);
        
        comanda.setnomeComida(cardapio.getComida(pedido2), 1);
        comanda.setValorComida(cardapio.getValor(pedido2), 1);
        
        comanda.exibirRelatorio();
        
    }
    
    public void levarConta(Comanda comanda, Pagamento pagamento){
        pagamento.gerarPagamento(comanda);
        pagamento.confirmarPagamento(comanda, true);
    
    }
        
    
    //fazer o pedido
    //Levar a conta;
    //
    
    
    
}
