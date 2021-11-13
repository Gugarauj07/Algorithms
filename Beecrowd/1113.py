while True:
    X, Y = map(float, input().split())
    if X == Y:
        break
    elif X > Y:
        print('Decrescente')
    elif X < Y:
        print('Crescente')