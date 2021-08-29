//1.Crie uma função chamada imprimir que recebe um argumento e simplesmente imprime ele na tela;
/*function imprimir(x)
{
	alert(x);
}

let variavel = prompt("Mensagem:");

imprimir(variavel);*/

//2.Lembra dos exercícios que propusemos na Aula 05 - Variáveis? Com base neles, faça o seguinte:
//*Crie uma função para cada algoritmo proposto lá, exceto o número 6;
//*Todas as funções devem retornar o valor final;
//*Procure dar nomes que façam sentido às funções. Ex.: a função para o item 4 poderia se chamar mediaAritmetica ou calcularMediaAritmetica;
//*Procure utilizar comentários para documentar cada método;
//*Na função da média aritmética, evite colocar todos os itens como argumentos do método, pois isso limitaria sua utilização a um número fixo de elementos. 
//Tente implementar uma lógica para receber um array e calcular a média em cima dele, tornando a função mais reaproveitável em diferentes situações.

//1º Exercício
function nomesIguais(fulano, beltrano)
{
mesmoNome = fulano == beltrano; //verificação se os nomes são iguais
alert("Nomes são iguais? " + mesmoNome); 
}

nomesIguais(prompt("Nome do Fulano"), prompt("Nome do Beltrano")); //define as variáveis para a função

//2º Exercício
function maiorDeIdade (idade)
{
verificarIdade = (idade >= 18); //verificação da idade
alert("É a idade de um adulto? " + verificarIdade);
}

maiorDeIdade(prompt("Qual a sua idade?")); //define a variável para a função

//3º Exercício
function jurosDezPorCento(valor)
{
valor = valor*1.1; //cálculo da função
alert("Valor com 10% de juros: " + valor);
}

jurosDezPorCento(prompt("Qual o valor a ser acrescido de juros?")); //define a variável para a função

//4º Exercício
function mediaDeValores(valores)
{
	let media = 0;
	let contador = prompt("Quantos valores serão definidos?");
	let contador2 = 1;
	while (contador != 0)
	{
		media = media + parseFloat(prompt("Entre com o " + contador2 + "º valor:"));
		contador2++
		contador--
	}
	media = media/(contador2-1);
	alert("Média dos valores: " + media);
}

mediaDeValores();
/*
Não fiz a função como um array neste caso, por se tratar de uma média, fiz somente
como uma variável e dois contadores para tornar "elegante" a entrada de dados.
*/

//5º Exercício
function funcaoMargemBruta(receitaLiqVendas, custoProdVendidos)
{
receitaLiqVendas = parseFloat(prompt("Entre com a receita líquida de vendas:"));
custoProdVendidos = parseFloat(prompt("Entre com o custo dos produtos vendidos:"))
lucroBruto = receitaLiqVendas - custoProdVendidos;
margemBruta = lucroBruto / receitaLiqVendas * 100;
alert("Margem bruta: " + margemBruta + "%");
}
funcaoMargemBruta();