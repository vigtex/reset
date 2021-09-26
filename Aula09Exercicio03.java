package reset.exercicios;

import java.util.Scanner;

public class Aula09Exercicio03 
{

	public static void main(String[] args) 
	{
	//Faça um programa que leia 5 números e informe o maior número.
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite um primeiro número inteiro: ");
	int primeiroNum = scan.nextInt();
	System.out.println("Digite um segundo número inteiro : ");
	int segundoNum = scan.nextInt();
	System.out.println("Digite um terceiro número inteiro : ");
	int terceiroNum = scan.nextInt();
	System.out.println("Digite um quarto número inteiro : ");
	int quartoNum = scan.nextInt();
	System.out.println("Digite um quinto número inteiro : ");
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
	System.out.println("Maior número: " + maior);
	}

}
