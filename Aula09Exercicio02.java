package reset.exercicios;

import java.util.Scanner;

public class Aula09Exercicio02 
{

	public static void main(String[] args) 
	{
	//Fa�a um programa que leia dois n�meros e imprima todos os valores 
	//presentes no intervalo entre eles, um abaixo do outro. 
	//Caso o segundo n�mero seja menor ou igual ao primeiro, 
	//solicite um novo n�mero at� que o segundo n�mero seja maior que o primeiro.

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um primeiro n�mero inteiro: ");
		int primeiroNum = scan.nextInt();
		System.out.println("Digite um segundo n�mero inteiro maior que o primeiro: ");
		int segundoNum = scan.nextInt();
		while (primeiroNum >= segundoNum)
		{
		System.out.println("Segundo n�mero deve ser maior que " + primeiroNum);	
		Scanner nscan = new Scanner(System.in);
		System.out.println("Digite um segundo n�mero inteiro maior que o primeiro: ");
		segundoNum = nscan.nextInt();
		}
		
		do
		{
		System.out.println(primeiroNum);
		primeiroNum++;
		}while(primeiroNum<=segundoNum);
	}

}
