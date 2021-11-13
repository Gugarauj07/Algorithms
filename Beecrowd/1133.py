X = int(input())
Y = int(input())
crescente = []
if X < Y:
    for number in range(X+1, Y):
        if number % 5 == 2 or number % 5 == 3:
            crescente.append(number)
elif X > Y:
    for number in range(Y+1, X):
        if number % 5 == 2 or number % 5 == 3:
            crescente.append(number)
crescente.sort()
for num in crescente:
    print(num)