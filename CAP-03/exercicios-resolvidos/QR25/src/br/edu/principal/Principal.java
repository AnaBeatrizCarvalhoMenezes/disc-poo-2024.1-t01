package br.edu.principal;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double custo, convite, qtd, Aqtd;
        System.out.println("Qual o custo do teatro?");
        custo = sc.nextDouble();
        System.out.println("\n Qual o custo do ingresso/convite?");
        convite = sc.nextDouble();

        qtd = custo/convite;
        Aqtd = Math.ceil(qtd);
        System.out.print("\n\n A quantidade de ingressos a serem vendidas para alcançar os custos do teatro são de: " + Aqtd + " entradas");
        sc.close();
    }

} 