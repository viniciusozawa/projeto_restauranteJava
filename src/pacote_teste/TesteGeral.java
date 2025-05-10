/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote_teste;

import acoes.Cardapio;
import acoes.Comanda;
import acoes.Pagamento;
import java.util.Scanner;
import pessoas.Clientes;
import pessoas.Funcionamento;
import pessoas.Garcom;
import pessoas.Gerente;

/**
 *
 * @author Usuario
 */
public class TesteGeral {

    public static void main(String[] args) {

        //intanciando objetos
        Gerente g1 = new Gerente();
        Scanner entrada = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();
        Clientes cliente = new Clientes();
        Garcom garcom = new Garcom();
        Comanda comanda = new Comanda();
        Pagamento pagamento = new Pagamento();
        Funcionamento funcionamento = new Funcionamento();
        //parte do gerente

        garcom.setId("10");
        garcom.setNome("Otavio");
        
        g1.setNome("Roberto");
        g1.setCpf("082.308.203-20");
        g1.setId("admin");
        while (true) {
            System.out.println("Digite seu Id: ");
            String autenticador = entrada.nextLine();
            if (autenticador.equals(g1.getId())) {
                break;
            } else {
                System.out.println("Id errado");
            }
        }

        System.out.println("Bem vindo Gerente: " + g1.getNome());
        System.out.println("Deseja Utilizar Cardápio Automático: 1(sim) 2(não)");
        int opcao = entrada.nextInt();
        entrada.nextLine();
        if (opcao == 1) {
            System.out.println("Cardápio Automático: ");
            cardapio.cardapioAutomatico();
            cardapio.exibirCardapio();
        } else {
            for (int i = 0; i < 5; i++) {
                System.out.println("\nDigite nome da Comida: ");
                String nomeComida = entrada.nextLine();
                System.out.println("\nDigite o valor da Comida acima: ");
                double valorComida = entrada.nextDouble();
                entrada.nextLine();
                g1.cadastrarComida(nomeComida, valorComida, cardapio);

            }
        }

        //Parte do cliente
      
        cliente.setNome("Vinicius");
        cliente.setCpf("202.040.409-03");
        cliente.setContato("35 99999999");
        cliente.setEndereco("Cidade Paraguaçu-MG");
        
        funcionamento.exibirInfo();
        do {
            System.out.println("\n\n----- MENU DO CLIENTE -----");
            System.out.println("1 - Ver Cardápio");
            System.out.println("2 - Fazer Pedido");
            System.out.println("3 - Solicitar Conta");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.println("\n--- CARDÁPIO ---");//Cardapio do Restaurante 
                    cliente.exibirCardapio(cardapio);
                    break;
                case 2:
                    cliente.escolherComida();
                    cliente.chamarGarcom(garcom, pagamento, cardapio, comanda, 1);
                    break;
                case 3:

                    cliente.chamarGarcom(garcom, pagamento, cardapio, comanda, 2);
                    break;
                case 4:
                    System.out.println("Saindo... Obrigado pela visita!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);
    }

}
