/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoes;



/**
 *
 * @author Otávio
 */
public class Cardapio {
    private String[] comida = new String[5];
    private double[] valor = new double[5];
    
    public void setComida(String comida , int indice ) {
        try {
           this.comida[indice] = comida; 
        } catch (Exception e) {
            System.out.println("Erro ao Cadastrar o nome da comida indice "+indice);
        }
        
    }

    public void setValor(double valor , int indice) {
        try {
            this.valor[indice] = valor;
        } catch (Exception e) {
            System.out.println("Erro ao Cadastrar o nome da comida indice "+indice);
        }
        
    }

    public String getComida(int indice) {
        return this.comida[indice];
    }

    public double getValor(int indice) {
        return this.valor[indice];
    }
    
    public void exibirCardapio(){
        for (int i = 0; i < comida.length; i++) {
            System.out.println("Código: "+i+"  Comida: "+this.comida[i]+" VALOR R$: "+this.valor[i]);
        }
       
    }
    
    public void cardapioAutomatico(){
        this.comida[0] = "Picanha na Brasa";
        this.valor[0] = 89.90;
        
        this.comida[1] = "Moqueca De Camarão";
        this.valor[1] = 79;
        
        this.comida[2] = "Risoto ";
        this.valor[2] = 84.50; 
        
        this.comida[3] = "Bacalhau";
        this.valor[3] = 92;
        
        this.comida[4] = "Feijoada Completa";
        this.valor[4] = 69;
    }

    
    
    
}
