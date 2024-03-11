def bisection(funkcja, a, b, dokladnosc):
    min = a
    max = b
    
    if funkcja(min)*funkcja(max) > 0:
        print("błędny przedział")
        return
    while abs(min-max)>dokladnosc:
        punkt_srodkowy = (min + max)/2
        if abs(funkcja(punkt_srodkowy)) < dokladnosc:
            return punkt_srodkowy
        if funkcja(min)*funkcja(punkt_srodkowy)>0:
            min = punkt_srodkowy
        else:
            max = punkt_srodkowy
    return punkt_srodkowy
def funkcja(x):
    return x**10 - 2

wynik = bisection(funkcja, 1, 2, 10e-6)
print(wynik)
