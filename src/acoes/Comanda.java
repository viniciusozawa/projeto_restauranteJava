/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoes;

import pessoas.Clientes;

/**
 *
 * @author Otávio
 */
public class Comanda {
    private String[] nomeComida = new String[2];
    private double[] valorComida = new double[2];
    private String nomeCliente;
    private int numeroMesa;
    
    public String[] getnomeComida(){
        return nomeComida;
    }
    public void setnomeComida(String nomeComida , int indice){
        this.nomeComida[indice] = nomeComida;
    }

    public double getValorComida(int indice) {
        return this.valorComida[indice];
    }
    
    public void setValorComida(double valorComida , int indice) {
        this.valorComida[indice] = valorComida;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public int getNumeroMesa() {
        return this.numeroMesa;
    }

    
    
    
    public int registrarNacomanda(String nome, int numeroMesa){
        this.nomeCliente = nome;
        return this.numeroMesa = numeroMesa;
    }
    
    public void exibirRelatorio(){
        for (int i = 0; i <= 1; i++) {
            
            System.out.println("\n\n---Pedido relizado com sucesso--- ");
            System.out.println("\nComida "+(i+1)+": "+this.nomeComida[i]+" Valor: R$"+this.valorComida[i]); 
        }
    }
        
    
}
