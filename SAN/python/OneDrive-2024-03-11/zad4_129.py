n = int(input('jaką chcesz dużą literę A (podaj wartość większą niż 2 ! ? : ')) 

for i in range (n): 

    if i < n: 

        if ( n // 2 ) == i: 

            print (' ' * (n - i - 1), '*' * ((2 * i) + 1)) 

        else: 

            if i == 0: 

                print (' ' * (n - i - 1), '*') 

            if i == 1: 

                print (' ' * (n - i - 1), '* *') 

            if i > 1: 

                print (' ' * (n - i - 1), '*', ' ' * (((2 * i)-3)), '*') 
