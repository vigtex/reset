package reset.exercicios;

import java.util.Scanner;

public class Aula07Exercicio03 
{

	public static void main(String[] args) 
	{
		// Fa�a um programa que solicite quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
		//Calcule e mostre o total do seu sal�rio no referido m�s.

		Scanner horasValorHora = new Scanner(System.in);

		System.out.println("Quantas horas voc� trabalha por m�s? ");
		double horas = horasValorHora.nextDouble();
		System.out.println("Qual o valor da sua hora? ");
		double valorHora = horasValorHora.nextDouble();
		double mes = horas * valorHora; 
		System.out.println("Sal�rio mensal: R$" + mes);
		
	}

}
