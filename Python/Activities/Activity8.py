numbers = list(input("Enter a sequence of comma separated values: ").split(", "))

if numbers[0] == numbers[-1]:
    print("True - first and last numbers are same")
else:
    print("False - first and last numbers are not same")
