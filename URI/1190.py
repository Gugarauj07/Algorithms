O = input()
for i in range(12):
    m.append([])
    for j in range(12):
        x = float(input())
        m[i].append(x)

s = 0
cont = 0
col = 11
for i in range(1, 11):
    for j in range(col, 12):
        s += m[i][j]

        cont += 1
    if i < 5:
        col -= 1
    if i > 5:
        col += 1



if O == "S":
    print('{:.1f}'.format(s))
elif O == "M":
    med = s / cont
    print(f"")