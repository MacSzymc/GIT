arr = []
end = 'T'
a = 0
while end == 'T':
    print('Podaj ', a+1 ,' element tablicy : ')
    b = int(input())
    arr.append(b)
    end = input('Aby podać kolejną liczbę wprowadź T, jeżeli skończyłeś, wprowadź N : ')
    end = end.upper()
    a = a+1
end = 'T'
while end == 'T':
    x = int(input('Podaj jaką liczbę chcesz znaleźć  : '))
    if x in arr:
        print('Wskazana liczba : ', x ,'ma indeks ', arr.index(x))
    else:
        print('Wyraz nie znajduje się w tablicy')
    end = input('Aby wyszukać jeszcze raz wprowadź T, aby zakończyć wprowadź N : ')
    end = end.upper()
