package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nLados, nDiagonais;
		System.out.print("Digite a quantidade de lados do polígono: ");
		nLados = sc.nextInt();
		nDiagonais = nLados * (nLados - 3)/2;
		
		System.out.println("O polígono possui " + nDiagonais + " diagonais.");
		sc.close();
	}

}
