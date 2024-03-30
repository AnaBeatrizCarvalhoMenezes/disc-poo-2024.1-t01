package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Esse programa recebe as duas dimensões de um cômodo (em metros), calcula e mostra a sua área (em m2) e a potência de iluminação que deverá ser utilizada.");
        System.out.println("Qual é a largura do cômodo? Digite aqui(Lembre-se que a unidade é em metros.): ");
        double larg = sc.nextDouble();
        System.out.println("Qual é o comprimento do cômodo? Digite aqui(Lembre-se que a unidade é em metros.): ");
        double comp = sc.nextDouble();
        double Area = larg*comp;
        System.out.println("A área do cômodo é de: "+Area+"m²");
        System.out.println("E a potência de iluminação que deverá ser utilizada é de: "+Area*18+"W");
        sc.close();
    }
}