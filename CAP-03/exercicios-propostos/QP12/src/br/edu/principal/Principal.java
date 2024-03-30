package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salmin, salfun, quant;
		System.out.println("Este programa recebe o salário de um funcionário e calcula quantos salários mínimos esta pessoa recebe.");
		System.out.println("Qual é o valor do salário mínimo?");
		salmin = sc.nextDouble();
		System.out.println("Qual é o valor do salário do funcionário?");
		salfun = sc.nextDouble();
		quant = salfun/salmin;
		System.out.println("O salário " + salfun + " é equivalente a " + quant + " vezes um salário mínimo de " + salmin);
		sc.close();
	}

}