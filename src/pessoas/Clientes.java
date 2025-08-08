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
public class Clientes extends Usuarios{

    
    private String endereco;
    private int comida1, comida2;
    private static int n_id = 0;

    public Clientes(String nome, String cpf, String telefone, String endereco) {
        super(nome, cpf, telefone);
        setN_id();
        super.setId(Integer.toString(n_id));
        this.endereco = endereco;
    }

    @Override
    public void exibirPerfil() {
       System.out.println("Perfil");
       System.out.println("Usuário: "+this.getNome()+"\nNúmero ID: "+this.getId());
    }
    
    
    
    public static void setN_id() {
        Clientes.n_id++;
    }
    

    public void chamarGarcom(Garcom garcom, Pagamento pagamento, Cardapio cardapio, Comanda comanda, int opcao) {

        switch (opcao) {
            case 1:
                //fazer pedido
                comanda.registrarNacomanda(super.getNome(), 1);
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
