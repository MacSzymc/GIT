import random
x = random.choice(["t", "h"])
y = input('Wprowadź h - orzeł, lub t - reszka : ')
if x == y:
        print('You win')
else:
        print('Bad Luck')
        if x == 'h':
            print('Wylosowano orła')
        else:
            print('Wylosowano reszkę')
