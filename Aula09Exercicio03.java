package reset.exercicios;

import java.util.Scanner;

public class Aula09Exercicio03 
{

	public static void main(String[] args) 
	{
	//Fa�a um programa que leia 5 n�meros e informe o maior n�mero.
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite um primeiro n�mero inteiro: ");
	int primeiroNum = scan.nextInt();
	System.out.println("Digite um segundo n�mero inteiro : ");
	int segundoNum = scan.nextInt();
	System.out.println("Digite um terceiro n�mero inteiro : ");
	int terceiroNum = scan.nextInt();
	System.out.println("Digite um quarto n�mero inteiro : ");
	int quartoNum = scan.nextInt();
	System.out.println("Digite um quinto n�mero inteiro : ");
	int quintoNum = scan.nextInt();
	
	int maior = primeiroNum;
	if (segundoNum > maior)
	{
		maior = segundoNum;
	}
	if (terceiroNum > maior)
	{
		maior = terceiroNum;;
	}
	if (quartoNum > maior)
	{
		maior = quartoNum;
	}
	if (quintoNum > maior)
	{
		maior = quintoNum;;
	}
	System.out.println("Maior n�mero: " + maior);
	}

}
