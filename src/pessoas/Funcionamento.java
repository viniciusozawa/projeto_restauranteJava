/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoas;

import java.time.LocalTime;

/**
 *
 * @author Otávio
 */
public class Funcionamento {

    private static String nomeEstabelecimento;

    private LocalTime horaInialRestaurante = LocalTime.of(8, 0);//Definindo O horario funcinamento 8 da manhã
    private LocalTime horaFinalRestaurante = LocalTime.of(21, 0);//Definindo o horario final 6 da tarde
    //Basicamente vamos fazer um intervalo que a pessoa digitar um exemplo
    //18:55 a pessoa deverá
    
    
    public Funcionamento(LocalTime agora) {
        Funcionamento.nomeEstabelecimento = "BIG TITES";
        if (horaInialRestaurante.isBefore(agora) && horaFinalRestaurante.isAfter(agora)) {
            exibirInfo();
        } else {
            
            System.out.println("\n\n----FECHADO----");
            System.out.println("Horario de Funcionamento:");
            exibirInfoHorario();
            System.out.println("Não Estamos Aberto");
            System.exit(0);
        }

    }
    

    public void setHoraInialRestaurante(int hora, int minuto) {
        this.horaInialRestaurante = LocalTime.of(hora, minuto);
    }

    public void setHoraFinalRestaurante(int hora, int minuto) {
        this.horaFinalRestaurante = LocalTime.of(hora, minuto);
    }

    public void exibirInfo() {
        System.out.println("\n---Bem vindo ao " +Funcionamento.nomeEstabelecimento+ "---");
        System.out.println("Endereço: Rua João Alfredo Jardim Bela Vista\nLocal: Centro\nNome: Big Tites\n");
        exibirInfoHorario();
        System.out.println("Número de Telefone: 11 9786-2524\nCidade:São Paulo\n\n");
    }
    public void exibirInfoHorario(){
        System.out.println("Início: "+this.horaInialRestaurante);
        System.out.println("Fim: "+this.horaFinalRestaurante);
    }
        

}
