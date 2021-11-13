maior = contagem = 0
for c in range(1, 101):
    num = int(input())
    if c == 0:
        maior = num
        contagem = c
    else:
        if num > maior:
            maior = num
            contagem = c
print(maior)
print(contagem)