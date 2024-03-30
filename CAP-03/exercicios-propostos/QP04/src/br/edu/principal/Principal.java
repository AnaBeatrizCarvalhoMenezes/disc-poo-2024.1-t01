package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa recebe duas notas, calculando e mostrando a média ponderada delas sendo peso 2 para a primeira e peso 3 para a segunda.");
        System.out.println("Qual foi a primeira nota? Digite aqui: ");
        double n1 = sc.nextDouble();
        System.out.println("Qual foi a segunda nota? Digite aqui: ");
        double n2 = sc.nextDouble();
        n1 = n1*2;
        n2 = n2*3;
        double soma = n1+n2;
        double mediaPond = soma/5;
        System.out.println("A média ponderada de suas notas foi de: "+mediaPond);
        sc.close();
    }

}