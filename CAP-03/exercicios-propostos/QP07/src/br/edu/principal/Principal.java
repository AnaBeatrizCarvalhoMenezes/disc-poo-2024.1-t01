package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float peso, pesoMaior, pesoMenor;
		System.out.print("Digite seu peso em Kg por favor: ");
		peso = sc.nextFloat();
		
		pesoMaior = peso + peso * 15/100;
		pesoMenor = peso - peso * 20/100;
		
		System.out.println("Caso você ganhe 15% do seu peso atual, seu peso será: " + pesoMaior);

		System.out.println("Caso você perca 20% do seu peso atual, seu peso será: " + pesoMenor);
		
		sc.close();
	}

}
