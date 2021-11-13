quant = int(input())
for c in range(quant):
    frase = input()
    meio = len(frase) // 2
    esquerda = frase[:meio-1:-1]
    direita = frase[meio-1::-1]
    print(direita + esquerda)
