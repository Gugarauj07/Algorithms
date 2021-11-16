import string
a = list(string.ascii_uppercase)
quant = int(input())
for c in range(quant):
    frase = input()
    num = int(input())
    frase_decodificada = ""
    for letra in frase:
        pos = a.index(letra)
        frase_decodificada += a[pos-num]
    print(frase_decodificada)