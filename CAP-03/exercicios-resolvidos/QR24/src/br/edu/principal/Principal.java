package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double hora, h, min, conversao, resultado;
		System.out.println("Por favor, escrever o horário utilizando ponto (Ex: 4:30 -> 4.30)");
		System.out.println("\n\n Qual o horário?");
		hora = sc.nextDouble();
		h = Math.floor(hora);
		conversao = h*60;
		min = (hora - h)*100;
		resultado = conversao + min;
		System.out.println("\n A conversão do horário é de: " + resultado);
		sc.close();

	}

}
