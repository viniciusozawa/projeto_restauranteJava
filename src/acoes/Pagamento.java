/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Otávio
 */
public class Pagamento {

    private double valorTotal;
    private boolean status = false;
    private LocalDateTime dataHora;
    private String comprovante;

    public double gerarPagamento(Comanda comanda){
        for (int i = 0; i <= 1; i++) {
            this.valorTotal += comanda.getValorComida(i);
        }
        System.out.println("Valor a Pagar Total: "+this.valorTotal);
        return this.valorTotal;
    }

    public boolean confirmarPagamento(Comanda comanda, boolean estadoPagamento) {
        if(estadoPagamento){
            gerarComprovante(comanda);
            return this.status = true;
            
        }else{
            System.out.println("Houve um Problema");
            return this.status;
        }  
    }
    
    

    public void gerarComprovante(Comanda comanda) {
        
        System.out.println("---Método do Pagamento---");
        System.out.println("Nome: "+comanda.getNomeCliente());
        System.out.println("\n\n");
        System.out.println("---Pedidos: \n\n");
        comanda.exibirRelatorio();
        System.out.println("\n\n---COMPROVANTE DE PAGAMENTO---Valor: R$" + this.valorTotal);
        System.out.println("\n\n");
        this.dataHora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = this.dataHora.format(formato);
        System.out.println("---Data do Pagamento---" +dataHoraFormatada );

    }
}
