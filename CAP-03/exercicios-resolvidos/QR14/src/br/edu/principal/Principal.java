package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int anoAtual, anoNascimento, idadeAtual, idade2050;
	System.out.println("Qual o ano atual?");
	anoAtual = sc.nextInt();
	System.out.println("Qual o seu ano de nascimento?");
	anoNascimento = sc.nextInt();
	idadeAtual = anoAtual - anoNascimento;
	idade2050 = 2050 - anoNascimento;
	
	System.out.println("A sua idade atualmente é: " + idadeAtual);
	System.out.println("A sua idade em 2050 seria: " + idade2050);
	
	sc.close();
	}

}
