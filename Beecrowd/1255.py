import string
alfabeto = list(string.ascii_lowercase)
quant = int(input())
for c in range(quant):
    num_frequencia = 0
    maior_frequencia = ''
    frase = input().lower()
    for letra in frase:
        if letra in alfabeto:
            if letra not in maior_frequencia:
                contador = frase.count(letra)
                if contador > num_frequencia:
                    num_frequencia = contador
                    maior_frequencia = letra
                elif contador == num_frequencia:
                    maior_frequencia += letra
    ordem = sorted(maior_frequencia)
    print(''.join(ordem))