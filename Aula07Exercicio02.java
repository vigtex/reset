package reset.exercicios;

import java.util.Scanner;

public class Aula07Exercicio02 
{

	public static void main(String[] args) 
	{
		//Faça um programa que tenha como entradas 4 notas e imprima a média. 
		//Utilize a classe Scanner para obter as entradas.
		
		Scanner notas = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		double primeiraNota = notas.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double segundaNota = notas.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double terceiraNota = notas.nextDouble();
		System.out.println("Digite a quarta nota: ");
		double quartaNota = notas.nextDouble();
		double media = (primeiraNota + segundaNota + terceiraNota + quartaNota)/4; 
		System.out.println("Média: " + media);

	}

}
