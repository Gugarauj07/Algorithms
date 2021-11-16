quant = int(input())
for c in range(quant):
    resultado = ''
    frase = input().split()
    for palavra in frase:
        resultado += palavra[0]
    print(resultado)