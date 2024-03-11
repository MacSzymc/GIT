pr1 = 3091.00
pr2 = 85528.00
st1 = 0.18
st2 = 0.32
doch = float(input('Wprowadź swój dochód : '))
if doch < pr1:
        podatek = 0
else:
    if doch < pr2:
        podatek = st1*(doch - pr1)
    else:
        podatek = st1*(pr2-pr1)+st2*(doch-pr2)

print('Podatek = ', podatek)
