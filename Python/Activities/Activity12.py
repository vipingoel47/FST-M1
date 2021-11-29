x = int(input("Enter a number: "))
def sum(x):
    if x<=1:
        return x
    else:
        return x + sum(x-1)

print("Sum of numbers from 0 to", x, " is: ", sum(x))

"""
# Define function to calculate sum
def calculateSum(num):
  if num:
    # Recursive function call
    return num + calculateSum(num-1)
  else:
    return 0

# Call calculateSum() function
res = calculateSum()

# Print result
print(res)
"""

