quant = int(input())
for c in range(quant):
    num_estudantes = int(input())
    nomes = input().split(' ')
    registro = input().split(' ')
    reprovados = []
    contador = 0
    for frequencia in registro:
        media = 0
        tam = len(frequencia)
        for letra in frequencia:
            if letra == "P":
                media += 1
            elif letra == "A":
                pass
            elif letra == "M":
                tam -= 1
        if media < (3 / 4) * tam:
            reprovados.append(nomes[contador])
        contador += 1
    print(' '.join(reprovados))
