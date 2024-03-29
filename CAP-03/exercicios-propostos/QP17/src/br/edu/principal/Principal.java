package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14;
		double raio = 0;
		System.out.println("O programa calcula o comprimento, área e volume da esfera com base em seu raio.");
		System.out.println("Qual é o raio da sua esfera? (Ou circunferência)");
		raio = sc.nextDouble();
		double compr = 2*pi*raio;
		double area = pi*Math.pow(raio, 2);
		double volume = (3.0 / 4.0) * pi * Math.pow(raio, 3);
		System.out.println("\n o comprimento da circunferência de sua esfera é: " + compr);
		System.out.println("\n a área da sua esfera é: " + area);
		System.out.println("\n o volume de sua esfera é de: " + volume);
		sc.close();
		
	}

}
