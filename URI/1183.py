O = input()
soma = count = 0
for linha in range(12):
    for coluna in range(12):
        num = float(input())
        if coluna > linha:
            soma += num
            count += 1
if O == "S":
    print(f"{soma:.1f}")
elif O == "M":
    media = soma / count
    print(f"{media:.1f}")
