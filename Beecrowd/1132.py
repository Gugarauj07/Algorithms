X = int(input())
Y = int(input())
soma = 0
if X < Y:
    for number in range(X, Y + 1):
        if number % 13 != 0:
            soma += number
elif X > Y:
    for number in range(Y, X + 1):
        if number % 13 != 0:
            soma += number
print(soma)