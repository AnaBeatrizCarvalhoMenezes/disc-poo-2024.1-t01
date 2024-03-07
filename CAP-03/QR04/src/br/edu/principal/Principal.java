package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, novosalario;
		System.out.println("Este programa calcula o novo salário de um funcionário após um aumento de 25%");
		System.out.println("Por favor digite o salário anterior ao aumento:");
		salario = sc.nextDouble();
		novosalario = salario + salario * 25/100;
		System.out.println("Seu novo salário é: " + novosalario);
		
		sc.close();
	}

}
