num = 0

for _ in range(0, 6):
    valor = float(input())
    if valor > 0:
        num += 1
print(f"{num} valores positivos")