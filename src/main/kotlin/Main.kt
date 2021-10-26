fun main(args: Array<String>) {
   /*

Exercício 2

1 - Crie um projeto chamado Calculadora de Comissão
2 - O App deve calcular a comissão dos representantes de vendas com base neste gráfico usado pela loja de varejo:

Faixa de Vendas        Comissão
acima de R$10000    30%
R$5001 - R$9999        20%
R$1001 - R$4999        10%
abaixo de R$1000     N / D

    */

    var comissao = 0.0
    var nome = ""
    var total = 0.0

   print("Digite o nome do representante:")
   nome = readLine()!!
   print("Qual o valor de vendas do representante:")
   total = readLine()!!.toDouble()

   if(total >= 10000){
      comissao = total * 0.30
      println("A comissão desse representante é: $comissao")
   }else if(total >= 9999){
      println("A comissão desse representante é: $comissao")
      comissao = total * 0.20
   }else if(total >= 4999){
      println("A comissão desse representante é: $comissao")
      comissao = total * 0.10
   }else{
      println("Não teve comissão")
   }


}