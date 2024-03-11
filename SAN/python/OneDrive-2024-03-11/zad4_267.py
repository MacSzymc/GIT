tekst = input('Wprowadź wyraz : ')
duplikaty = []
for i in range (0, len(tekst)):
    for j in range (i+1, len(tekst)):
            if tekst[i] == tekst[j]:
                a = tekst[j]
                if duplikaty.count(a) == 0:
                       duplikaty.append(tekst[j])
print(duplikaty)
