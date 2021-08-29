//1.Crie um array de 5 posições com quaisquer valores. 
//Utilize qualquer estrutura de repetição apresentada no vídeo para exibir todos os valores do array;
let capitaoPlaneta = ["água","terra","ar","fogo","coração"];
for(contador = 0; contador < capitaoPlaneta.length; contador++ )
{
let elemento = capitaoPlaneta[contador];
console.log (elemento);
}

//2.Crie um algoritmo capaz de calcular a média aritmética de um array com qualquer quantidade de elementos numéricos. 
//Para fins de exemplo, o resultado do algoritmo com um array de valores 1, 2, 3, 5, 8, 13, 21, 23, 34, 55 deve ser 16.5. 
//Procure usar uma estrutura de repetição diferente da que você usou para fazer o exercício anterior;
let qualquerQuantidade=[];
let media = 0;
let parada = "";
let contador2 = 0
do
{
	qualquerQuantidade[contador2] = parseFloat(prompt("Qualquer número."));
	media = media + qualquerQuantidade[contador2];
	parada = prompt("Parar S/N")
	contador2++
	
}while (parada != "S");
media = media/contador2;
alert("Média:" + media);

//3.Considerando a lista dos 60 nomes mais comuns no Brasil nos últimos 10 anos, crie um algoritmo para verificar se seu nome está lá. 
//Se sim, exiba a mensagem: É, nome comum :P. Se não, exiba a mensagem: Diferentão, hein? XD.

nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia", 
"Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia", 
"Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina", 
"Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia", 
"Vinícius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda", 
"Leonardo", "Isadora", "Noah", "Lorena", "Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória"]

meuNome = prompt("Escreva seu nome.");
contador3 = 0;
do
{
if (meuNome == nomesComuns[contador3])
	{
	alert("É, nome comum :P.");
	contador3 = nomesComuns.length;
	}
else if (contador3 == nomesComuns.length)
	{
	alert("Diferentão, hein? XD.");
	}
	contador3++;
}while(contador3<=nomesComuns.length);