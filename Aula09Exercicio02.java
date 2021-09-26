package reset.exercicios;

import java.util.Scanner;

public class Aula09Exercicio02 
{

	public static void main(String[] args) 
	{
	//Faça um programa que leia dois números e imprima todos os valores 
	//presentes no intervalo entre eles, um abaixo do outro. 
	//Caso o segundo número seja menor ou igual ao primeiro, 
	//solicite um novo número até que o segundo número seja maior que o primeiro.

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um primeiro número inteiro: ");
		int primeiroNum = scan.nextInt();
		System.out.println("Digite um segundo número inteiro maior que o primeiro: ");
		int segundoNum = scan.nextInt();
		while (primeiroNum >= segundoNum)
		{
		System.out.println("Segundo número deve ser maior que " + primeiroNum);	
		Scanner nscan = new Scanner(System.in);
		System.out.println("Digite um segundo número inteiro maior que o primeiro: ");
		segundoNum = nscan.nextInt();
		}
		
		do
		{
		System.out.println(primeiroNum);
		primeiroNum++;
		}while(primeiroNum<=segundoNum);
	}

}
