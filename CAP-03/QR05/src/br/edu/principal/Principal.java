package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, novosalario, percentual;
		System.out.println("Este programa calcula o novo salário de um funcionário após um percentual de aumento aumento");
		System.out.println("Por favor digite o salário anterior ao aumento:");
		salario = sc.nextDouble();
		System.out.println("Por favor digite o percentual de aumento do salário:");
		percentual = sc.nextDouble();
		novosalario = salario + salario * percentual/100;
		System.out.println("Seu novo salário é: " + novosalario);
		
		sc.close();
	}

}
