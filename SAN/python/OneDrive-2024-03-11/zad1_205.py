import math
n = int(input('Podaj n : '))
if n != 0:
    wynik = 1.00
    for i in range(2, n+1):
        wynik = wynik + (1 / i)
    print('wynik działania to : ', wynik - math.log(n))
else:
    print('Podałeś 0.. nie mogę podzielić przez 0')
