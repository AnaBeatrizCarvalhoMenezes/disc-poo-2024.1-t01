package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura, area = 0;
		System.out.println("Este programa calcula a área do triângulo");
		System.out.println("Por favor digite a seguir a base do triângulo:");
		base = sc.nextDouble();
		System.out.println("Por favor digite a seguir a altura do triângulo em metros:");
		altura = sc.nextDouble();	
		area = (base * altura) /2;
		System.out.println("Esta é a área do seu triângulo: " + area + "m2");
		sc.close();
	}

}
