def eatvowels(slowo):
    vowels = 'aeiouy'
    nowe_slowo = ''
    for c in slowo:
        if c.lower() not in vowels:
            nowe_slowo = nowe_slowo + c
    return nowe_slowo

slowo = 'Apple Sauce'
print(eatvowels(slowo))
