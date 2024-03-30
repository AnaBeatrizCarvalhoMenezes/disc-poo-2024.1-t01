package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double diMaior, diMenor, area;
		System.out.println("O programa calcula e mostra a área de um losango");
		System.out.println("Qual é tamanho da diagonal maior da sua forma?");
		diMaior = sc.nextDouble();
		System.out.println("Qual é tamanho da diagonal menor da sua forma?");
		diMenor = sc.nextDouble();
		area = (diMaior*diMenor)/2;
		System.out.println("\n a área deste losango é: " + area + " metros quadrados");
		sc.close();
	}

}
