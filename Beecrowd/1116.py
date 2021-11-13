N = int(input())
for _ in range(1, N+1):
    X, Y = map(int, input().split())
    if Y == 0:
        print('divisao impossivel')
    else:
        print(f'{X/Y}')