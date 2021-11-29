numtuple = tuple(input("Enter the numbers separated by a comma and a space: ").split(", "))
print(numtuple, "\nnumbers divisible by 5 are:")

for number in numtuple:
    if int(number)%5 == 0:
        print(number)
