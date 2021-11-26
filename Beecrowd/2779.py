N = int(input())  # total de figurinhas no album
M = int(input())  # figurinhas compradas
lista = list()
for i in range(M):
    num = input()
    if num not in lista:
        lista.append(num)
resultado = N - len(lista)
print(resultado)