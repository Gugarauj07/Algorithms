N = int(input())

for x in range(0, N):
    frase = input()
    fraseSep = frase.split()
    fraseOrd = ""
    tam = len(fraseSep)
    for x in range(tam - 1):
        trocar = False
        for i in range(tam - (1 + x)):
            if len(fraseSep[i + 1]) > len(fraseSep[i]):
                trocar = True
                fraseSep[i + 1], fraseSep[i] = fraseSep[i], fraseSep[i + 1]
        if not trocar:
            break
    for palavra in fraseSep:
        fraseOrd += palavra + " "
    print(fraseOrd)