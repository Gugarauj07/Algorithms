N = int(input())
IN = OUT = 0
for _ in range(0, N):
    X = int(input())
    if 10 <= X <= 20:
        IN += 1
    else:
        OUT += 1
print(f"{IN} in")
print(f"{OUT} out")
