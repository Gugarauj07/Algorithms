quant = int(input())
for c in range(quant):
    frase = input().split()
    for x in range(len(frase) - 1, 0, -1):
        for i in range(x):
            if len(frase[i]) < len(frase[i+1]):
                temp = frase[i]
                frase[i] = frase[i+1]
                frase[i+1] = temp
    resultado = ' '.join(frase)
    print(resultado)