package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double pFab, percLucro, percImp, valorLucro, valorImp, precoFinal;
	
	System.out.println("Qual o preço de fábrica do carro?");
	pFab = sc.nextDouble();
	System.out.println("Qual o percentual de lucro para o distribuidor?");
	percLucro = sc.nextDouble();
	System.out.println("Qual o percentual de impostos?");
	percImp = sc.nextDouble();
	
	valorLucro = (pFab * percLucro)/100;
	valorImp = (pFab * percImp)/100;
	precoFinal = pFab + valorLucro + valorImp;
	
	System.out.println("O valor de lucro para o distribuidor é: " + valorLucro);
	System.out.println("O valor de imposto final é: " + valorImp);
	System.out.println("O preço final do seu carro será: " + precoFinal);
	
	sc.close();
	}

}
