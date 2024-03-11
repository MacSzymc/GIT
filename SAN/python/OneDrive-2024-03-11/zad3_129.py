n = int(input('ile rzędów wysokości ma mieć podstawa diamentu ? : ')) 

j = n; 

for i in range ((2 * n) + 1): 

    if i < n: 

        print (' ' * (n - i - 1), '*' * ((2 * i) + 1)) 

    else: 

        print (' ' * ((n - j) + 1), '*' * (2 * j - 3)) 

        j = j - 1; 
