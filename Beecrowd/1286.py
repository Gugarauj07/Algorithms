
numero_pedidos = int(input())
roberto = int(input())

Tempo = Quantid = []
for c in range(numero_pedidos):
    Tempo, Quantid = input().split()

print(Tempo, Quantid)