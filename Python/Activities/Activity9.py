numlist1 = [1, 3, 4, 5]
numlist2 = [1, 3, 4, 5]

numlist3 = []

for number in numlist1:
    if number%2 != 0:
        numlist3.append(number)

for number in numlist2:
    if number%2 == 0:
        numlist3.append(number)
    
    
print(numlist3)