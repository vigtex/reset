package reset.exercicios;

import java.util.Scanner;

public class Aula07Exercicio03 
{

	public static void main(String[] args) 
	{
		// Faça um programa que solicite quanto você ganha por hora e o número de horas trabalhadas no mês. 
		//Calcule e mostre o total do seu salário no referido mês.

		Scanner horasValorHora = new Scanner(System.in);

		System.out.println("Quantas horas você trabalha por mês? ");
		double horas = horasValorHora.nextDouble();
		System.out.println("Qual o valor da sua hora? ");
		double valorHora = horasValorHora.nextDouble();
		double mes = horas * valorHora; 
		System.out.println("Salário mensal: R$" + mes);
		
	}

}
