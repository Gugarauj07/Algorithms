N = int(input())

for count in range(1, N + 1):
    X, Y = map(int, input().split())
    soma = 0
    if Y > X:
        for number in range(X+1, Y):
            if number % 2 != 0:
                soma += number
    else:
        for number in range(Y+1, X):
            if number % 2 != 0:
                soma += number
    print(soma)
