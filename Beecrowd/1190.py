m = []
O = input()
for linha in range(12):
    m.append([])
    for coluna in range(12):
        x = float(input())
        m[linha].append(x)
soma = count = 0
col = 11
for linha in range(1, 11):
    for coluna in range(col, 12):
        soma += m[linha][coluna]
        count += 1
    if linha < 5:
        col -= 1
    if linha > 5:
        col += 1

if O == "S":
    print(f"{soma:.1f}")
elif O == "M":
    media = soma / count
    print(f"{media:.1f}")