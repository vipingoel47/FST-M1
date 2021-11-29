numbers = list(input("Enter a sequence of comma separated values: ").split(", "))

def sum(numbers):
  total = 0
  for x in numbers:
    total += int(x)
  return total
      
print("Sum of numbers in the list is: ", sum(numbers))



