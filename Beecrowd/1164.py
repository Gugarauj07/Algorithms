N = int(input())
if 1 <= N <= 100:
    for _ in range(0, N):
        soma = 0
        X = int(input())
        for value in range(1, X):
            if X % value == 0:
                soma += value
        if soma == X:
            print(f"{X} eh perfeito")
        else:
            print(f"{X} nao eh perfeito")