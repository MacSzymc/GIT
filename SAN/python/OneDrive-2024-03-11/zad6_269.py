def wyszukaj_binarnie(tablica, x):
    r = len(tablica)
    l = 0
    i = 0
    while l < r:
        i = (l + r) // 2
        if x == tablica[i]:
            return i
        else:
            if x < tablica[i]:
                r = i
            else:
                l = i + 1

    return -1
tablica = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
x = 9

i = wyszukaj_binarnie(tablica, x)

if i != -1:
    print('liczba ', x ,'znajduje się na pozycji = ', i)
else:
    print('brak liczby w przeszukiwanym zbiorze')
