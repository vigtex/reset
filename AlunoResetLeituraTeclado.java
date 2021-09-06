package reset.exercicios;

//necessário para fazer funcionar o "Scanner"
import java.util.Scanner;

public class AlunoResetLeituraTeclado 
{

	public static void main(String[] args) 
	{
		Scanner nome = new Scanner(System.in);

		System.out.println("Digite seu nome completo: ");
		String nomeAluno = nome.nextLine();
		System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo " + nomeAluno + ".");
	}

}
