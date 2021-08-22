//1) Crie uma variável mesmoNome que verifica se nomeDoFulano é igual a nomeDoBeltrano;
let nomeDoFulano = prompt("Entre com o nome do Fulano:");
let nomeDoBeltrano = prompt("Entre com o nome do Beltrano:");
let mesmoNome = nomeDoFulano == nomeDoBeltrano;
alert("Nomes são iguais? " + mesmoNome);

//2) Crie uma variável maiorDeIdade que verifica se idade é de um adulto;
let idade = prompt("Entre com a idade:");
let maiorDeIdade = (idade >= 18);
alert("É a idade de um adulto? " + maiorDeIdade);

//3) Crie uma variável valorComJuros que calcula o valor de um boleto acrescido de 10% de juros por atraso;
let boleto = prompt("Entre com o valor do boleto:");
let valorComJuros = boleto * 1.1;
alert("Valor do boleto com juros de 10% é: "+ valorComJuros);

//4) Faça a representação da fórmula de média aritmética, considerando um conjunto de elementos com 5 elementos nomeados como item1, item2, item3, item4 e item5;
let item1 = parseFloat(prompt("Entre com o 1º valor:"));
let item2 = parseFloat(prompt("Entre com o 2º valor:"));
let item3 = parseFloat(prompt("Entre com o 3º valor:"));
let item4 = parseFloat(prompt("Entre com o 4º valor:"));
let item5 = parseFloat(prompt("Entre com o 5º valor:"));
let media = (item5 + item4 + item3 + item2 + item1)/5;
alert("Média dos 5 valores: " + media);

//5) O lucro bruto de uma empresa é representado pela receita líquida de vendas menos o custo dos produtos vendidos. 
//A margem bruta de uma empresa é calculada pela divisão do lucro bruto pela receita líquida de vendas. 
//Faça a representação da fórmula da margem bruta, multiplicando o resultado final por 100 para obter o valor percentual;
let receitaLiqVendas = parseFloat(prompt("Entre com a receita líquida de vendas:"));
let custoProdVendidos = parseFloat(prompt("Entre com o custo dos produtos vendidos:"))
let lucroBruto = receitaLiqVendas - custoProdVendidos;
let margemBruta = lucroBruto / receitaLiqVendas * 100;
alert("Margem bruta: " + margemBruta + "%");

//6) Usando qualquer ferramenta de codificação, crie um algoritmo seguindo os passos abaixo para encontrar 
//o valor do saldo ao final do processo (atente-se para utilizar . como separador decimal):
//O saldo da sua conta é R$ 1000,00
//Você decide comprar uma calça por R$ 99,90
//Você recebe o seu salário de R$ 2500,00
//Você está caminhando na rua e decide dar R$ 0,10 para um morador de rua
//Você compra um ar condicionado cujo valor é 25% do seu saldo atual
//Você decide antecipar o pagamento de uma dívida usando metade do seu saldo
//Qual o valor do seu saldo?
let saldo = 1000.0
let calca = 99.90
let salario = 2500.0
let esmola = 0.1
saldo = (((saldo - calca + salario - esmola) * 0.75) * 0.5);
console.log("Saldo atual é de R$ " + saldo);