#Crie um programa que leia o preço de um produto, calcule e mostre o seu PREÇO PROMOCIONAL, com 5% de desconto.

item = float(input("qual o valor do item?"))  #exibe uma mensagem, entra com o dado e salva na variavel tipo float
desconto = item*5/100                         #chama a variavel desconto e multiplica por 5%, armazena na variavel tipo float
print(f"o valor do item fica em torno de: {item-desconto}") #chama a variavel desconto e item e subtrai elas, exibe a mensagem