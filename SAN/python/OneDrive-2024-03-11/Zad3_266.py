def generuj_liczby(liczby):
    i = 0
    while i < 10:
        a = (liczby[i+1]**2 - liczby[i])
        liczby.append(a)
        i = i + 1
    return liczby

liczby = [0, 1]
liczby = generuj_liczby(liczby)
for i in range(0, 12):
    print('X[',i+1,'] = ', liczby[i])

