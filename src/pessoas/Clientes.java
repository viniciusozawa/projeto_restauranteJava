/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoas;

import acoes.Cardapio;
import acoes.Comanda;
import acoes.Pagamento;
import java.util.Scanner;

/**
 *
 * @author Otávio
 */
public class Clientes {

    private String nome;
    private String contato;
    private String cpf;
    private String endereco;
    private int comida1, comida2;
    

    public Clientes(String nome, String contato, String cpf, String endereco){
        this.nome = nome;
        this.contato = contato;
        this.cpf = cpf;
        this.endereco = endereco; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void chamarGarcom(Garcom garcom, Pagamento pagamento, Cardapio cardapio, Comanda comanda, int opcao) {

        switch (opcao) {
            case 1:
                //fazer pedido
                comanda.registrarNacomanda(this.nome, 1);
                garcom.fazerPedido(cardapio, comanda, this.comida1, this.comida2);
                break;
            case 2:
                //levar a conta
                garcom.levarConta(comanda, pagamento);
                break;
        }
    }

    public void escolherComida() {
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("\n---Trabalhamos apenas 2 Pedidos--- \n");
            System.out.println("Digite o Códico do Primero pedido: ");
            this.comida1 = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Digite o Códico do Segundo pedido: ");
            this.comida2 = entrada.nextInt();
        } while ((comida1 < 0 || comida1 > 4) || (comida2 < 0 || comida2 > 4));
        
        System.out.println("Pedido registrado com sucesso: " + comida1 + " e " + comida2);
    }

    public void exibirCardapio(Cardapio cardapio) {
        cardapio.exibirCardapio();
    }
}
