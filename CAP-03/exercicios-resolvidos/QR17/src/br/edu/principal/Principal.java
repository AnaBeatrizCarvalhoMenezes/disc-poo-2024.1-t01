package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sal, cheq1, cheq2;
		double saldo, cpmf1, cpmf2;
		
		System.out.println("Qual o salário do trabalhador?");
		sal = sc.nextFloat();
		System.out.println("Qaul é o valor do primeiro cheque?");
		cheq1 = sc.nextFloat();
		System.out.println("Qual é o valor do segundo cheque?");
		cheq2 = sc.nextFloat();
		
		cpmf1 = cheq1 * 0.38/100;
		cpmf2 = cheq2 * 0.38/100;
		saldo = sal - cheq1 - cheq2 - cpmf1 - cpmf2;
		System.out.println("O saldo final será de: " + saldo);
		sc.close();
	}

}
