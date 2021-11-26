J, R = map(int, input().split())
lista = input().split()
maior = num_jogador = 0
for jogador in range(J):
    soma = 0
    for num in range(jogador, len(lista), J):
        soma += int(lista[num])
        if soma >= maior:
            maior = soma
            num_jogador = jogador + 1
print(num_jogador)