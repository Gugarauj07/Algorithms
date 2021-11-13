par = list()
impar = list()
for _ in range(15):
    num = int(input())
    if num % 2 == 0:
        par.append(num)
    else:
        impar.append(num)
    if len(par) == 5 :
        for i, v in enumerate(par):
            print(f"par[{i}] = {v}")
        par = []
    elif len(impar) == 5:
        for i, v in enumerate(impar):
            print(f"impar[{i}] = {v}")
        impar = []
for i, v in enumerate(impar):
    print(f"impar[{i}] = {v}")
for i, v in enumerate(par):
    print(f"par[{i}] = {v}")