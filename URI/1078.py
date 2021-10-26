N = int(input())
if 1 < N < 1000:
    for number in range(1, 11):
        print(f"{number} x {N} = {number*N}")
