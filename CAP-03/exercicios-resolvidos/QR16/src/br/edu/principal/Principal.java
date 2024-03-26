package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float horas, valorSalMin, valorHora, salBruto, imp, salLiq;
		System.out.println("Quantas horas o trabalhador trabalhou?");
		horas = sc.nextFloat();
		System.out.println("Qual o salário mínimo deste trabalhou?");
		valorSalMin = sc.nextFloat();
		
		valorHora = valorSalMin/2;
		salBruto = valorHora*horas;
		imp = salBruto*3/100;
		salLiq = salBruto - imp;
		System.out.println("O valor do salário líquido é de: " + salLiq);
		sc.close();
	}

}
