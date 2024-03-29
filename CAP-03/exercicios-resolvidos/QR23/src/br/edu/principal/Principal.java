package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, n2, n3, a;
		System.out.println("Escolha um número:");
		num = sc.nextDouble();
		System.out.println("\n Qual a parte INTEIRA (ex: 1,5 -> 1) do seu número?");
		n3 = sc.nextDouble();
		
		n2 = num - n3;
		a = Math.round(num);
		
		System.out.println("\n\n A parte não inteira do seu número é: " + n2);
		System.out.println("\n seu número aproximado é: " + a);
		
		sc.close();
	}

}
