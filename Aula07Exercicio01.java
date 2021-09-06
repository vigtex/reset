package reset.exercicios;

import java.util.Scanner;

public class Aula07Exercicio01 
{

	public static void main(String[] args) 
	{
		//Faça um programa que tenha como entradas dois números e imprima a soma de ambos. 
		//Utilize a classe Scanner para obter as entradas.
		Scanner numeros = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		double primeiroNumero = numeros.nextDouble();
		System.out.println("Digite o segundo número: ");
		double segundoNumero = numeros.nextDouble();
		double resultado = primeiroNumero + segundoNumero; 
		System.out.println("Resultado da soma dos números: " + resultado);

	}

}
