package br.com.newton.main;
import java.util.Scanner;

import br.com.newton.agenda.Contato;

public class Telefone {
    public static void main(String[] args) {
        Contato contact = new Contato();
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome do contato: ");
        String nome = ler.nextLine();

        System.out.print("Digite seu número de telefone sem espaço e sem DDD: ");
        String numero = ler.nextLine();

        if(numero.length()!=9){
            System.out.println("Telefone inválido!");
        }

    }
}
