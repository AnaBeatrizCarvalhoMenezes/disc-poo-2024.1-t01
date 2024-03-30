package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double horasTrab,salMin,horasEx,salTo,valHo,valHoEx,salBru,quantReceb = 0;
    System.out.println("Quantas horas de trabalho foram realizadas?");
    horasTrab = sc.nextDouble();
    System.out.println("Qual o valor do salário mínimo");
    salMin = sc.nextDouble();
    System.out.println("Qual a quantidade de horas extras trabalhadas?");
    horasEx = sc.nextDouble();
    valHo = salMin/8;
    valHoEx = salMin/4;
    salBru = horasTrab * valHo;
    System.out.println("O valor do seu salário bruto é: "+ salBru);
    quantReceb = horasEx * valHoEx;
    System.out.println("A quantia a receber pelas horas extras trabalhadas é: " + quantReceb);
    salTo = salBru + quantReceb;
    System.out.println("O valor do seu salário total é: " + salTo);
    sc.close();
    }

}
