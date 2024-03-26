package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pes, polegadas, jardas, milhas;
		System.out.println("Qual a distância em pés?");
		pes = sc.nextDouble();
		polegadas = pes * 12;
		jardas = pes / 3;
		milhas = jardas / 1760;
		
		
		System.out.println("O valor convertido em polegadas é: " + polegadas);
		System.out.println("O valor convertido em jardas é: " + jardas);
		System.out.println("O valor convertido em milhas é: " + milhas);		
		sc.close();
	}

}
