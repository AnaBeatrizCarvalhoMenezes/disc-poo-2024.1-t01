package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    double salf,valorv,com,salfinal = 0 ;
    System.out.println("Quanto você recebe de salário fixo?");
    salf = sc.nextDouble();
    System.out.println("Qual o valor das suas vendas?");
    valorv = sc.nextDouble();
    com = (4*valorv)/100 ;
    salfinal = com + salf;
    System.out.println("Está é a sua comissão pelas vendas: "+com);
    System.out.println("Este é o seu salário final: "+ salfinal);
    sc.close();
    }
}