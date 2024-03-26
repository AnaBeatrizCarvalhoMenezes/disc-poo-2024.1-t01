package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Adeg, Auser, qtd;
		
		System.out.println("Qual é a altura de um degrau de escada?");
		Adeg = sc.nextDouble();
		System.out.println("Qual é a altura que vc deseja subir?");
		Auser = sc.nextDouble();
		
		qtd = Auser/Adeg;
		System.out.println("A quantidade necessária de degraus que você");
		System.out.printf(" precisa subir para chegar a altura desejada é de: %.0f", qtd);
		
		sc.close();
	}

}
