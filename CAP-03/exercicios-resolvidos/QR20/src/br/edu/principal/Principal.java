package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ang, escada, radiano, alt;
		System.out.println("Qual é a medida do ângulo que a escada está formando?");
		ang = sc.nextDouble();
		System.out.println("Qual a altura que se encontra o ponto onde a escada toca a parede?");
		alt = sc.nextDouble();
		
		radiano = ang*3.14/180;
		escada = alt/radiano;
		System.out.printf("A medida da escada é de: %.2f", escada);
		sc.close();
	}

}
