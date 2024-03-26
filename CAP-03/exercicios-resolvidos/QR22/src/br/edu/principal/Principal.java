package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valorsal, quantkw, valorkw, reais, desc, valordesc = 0;
		System.out.println("Este programa calcula a quantidade de quilowatts consumida por uma residência, junto do valor a ser pago com e sem um desconto de 15%.");
		System.out.println("Por favor, digite o valor do seu salário atual:");
		valorsal = sc.nextDouble();
		System.out.println("Por favor, digite quantos quilowatts são gastos na sua residência:");
		quantkw = sc.nextDouble();
		valorkw = valorsal/5;
		reais = valorkw*quantkw;
		desc = reais * 15/100;
		valordesc = reais - desc;
		System.out.println("A seguir o valor de cada quilowatt consumido na sua residência: " + valorkw);
		System.out.println("A seguir o valor a ser pago pelo consumo total de quilowatts na sua residência: " + reais);		
		System.out.println("A seguir o valor a ser pago pelo consumo total de quilowatts na sua residência com desconto de 15%: " + valordesc);		
		
		
		sc.close();
	}

}
