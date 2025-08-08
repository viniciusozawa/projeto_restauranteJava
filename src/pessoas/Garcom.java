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
public class Garcom extends Funcionario{
    

    public Garcom(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        super.setId("Garcom");
    }

    @Override
    public void exibirPerfil() {
        System.out.println("Perfil");
        System.out.println("Garçom: "+this.getNome()+"\nSalário: "+this.getSalario());
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

    @Override
    public void comissao() {
        this.salario = this.salario + (this.salario * 0.10);
    }
    
    
    
}
