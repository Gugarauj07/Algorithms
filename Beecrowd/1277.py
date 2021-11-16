quant = int(input())
for c in range(quant):
    num_estudantes = int(input())
    nomes = input().split(' ')
    registro = input().split(' ')
    reprovados = ''
    for frequencia in registro:
        media = contador = 0
        tam = len(frequencia)
        for letra in frequencia:
            if letra == "P":
                media += 1
            elif letra == "A":
                pass
            elif letra == "M":
                tam -= 1
        if media <= 3/4 * tam:
            reprovados = ' '.join(nomes[contador])
        contador += 1
    print(reprovados)