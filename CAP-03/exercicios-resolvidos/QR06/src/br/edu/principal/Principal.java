package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, salreceber, grat, imp = 0;
		
		System.out.println("Este programa calcula um novo salário a partir de uma gratificação de 5% a partir do salário original e também calcula o imposto a ser pago, de 7% do salário original.");
		System.out.println("Por favor digite seu salário original:");
		sal = sc.nextDouble();
		grat = sal * 5/100;
		imp = sal * 7/100;
		salreceber = (sal + grat) - imp;
		System.out.println("A seguir o seu novo salário:" + salreceber);
		
		sc.close();

	}

}
