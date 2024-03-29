package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("AVISO!! Escala em metros!!");
		double x, z;
		System.out.println("Qual é o tamanho da escada?");
		z = sc.nextDouble();
		System.out.println("Qual a altura que deseja colocar o quadro?");
		x = sc.nextDouble();
		
		double y = Math.pow(x, z) - Math.pow(x, 2);
		y = Math.sqrt(y);
		System.out.printf("A distância que a escada deve ficar é de %.2f", y);
	}

}
