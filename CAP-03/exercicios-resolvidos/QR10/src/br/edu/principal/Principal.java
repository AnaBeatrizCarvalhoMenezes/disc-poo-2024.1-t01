package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area, raio = 0;
		System.out.println("Este programa calcula a área do círculo");
		System.out.println("Por favor digite o raio do círculo em metros:");
		raio = sc.nextDouble();
		area = 3.1415 * (raio*raio);
		System.out.println("A área do círculo é: " + area + "m2");
		sc.close();
	}

}
