X = list()
for _ in range(0, 10):
    num = int(input())
    if num <= 0:
        num = 1
    X.append(num)
for i, v in enumerate(X):
    print(f"X[{i}] = {v}")
