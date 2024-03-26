package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double psSaco, rG1, rG2, total;
		System.out.println("Qual o peso do saco de ração em Kg?");
		psSaco = sc.nextDouble();
		System.out.println("Qual é a quantidade de ração para o primeiro gato em gramas?");
		rG1 = sc.nextDouble();
		System.out.println("Qual é a quantidade de ração para o segundo gato em gramas?");
		rG2 = sc.nextDouble();
		
		rG1 = rG1/1000;
		rG2 = rG2/1000;
		total = psSaco - 5*(rG1+rG2);
		
		System.out.println("Restará " + total + " Kg de ração após 5 dias");
		
		sc.close();
	}

}
