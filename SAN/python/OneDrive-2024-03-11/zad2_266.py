def sum():
    n = int(input('podaj n : '))
    suma = 0
    for i in range(1, n+1):
            suma = suma + i**3
    return suma
print(sum())
