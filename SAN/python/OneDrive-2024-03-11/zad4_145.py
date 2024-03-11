x = int(input('Ile osób chcesz zaprosić : '))

if x <=10:
    names = []
    for i in range(0, x):
        print('Podaj imię ', i + 1 ,' zaproszonego :')
        new_name = str(input())
        names.append((new_name))
        print(names[i],' został zaproszony')
    print('Oto Twoja lista gości : ')
    for i in range(0, x):
        print(names[i])
else:
    print('Too many people')
