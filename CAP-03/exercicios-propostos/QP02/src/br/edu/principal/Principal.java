package br.edu.principal;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3;
        System.out.println("Este programa calcula a soma e a multiplicação de 3 números reais e os mostra na tela");
        System.out.println("\n\n qual o primeiro número?");
        n1 = sc.nextDouble();
        System.out.println("\n e o segundo?");
        n2 = sc.nextDouble();
        System.out.println("\n e agora o terceiro?");
        n3 = sc.nextDouble();
        System.out.println("Os números foram: " + n1 + ", " + n2 + ", " + n3 + ".");
        System.out.println("A multiplicação deles é: " + n1*n2*n3);
        sc.close();
    }

}