n = int(input("how many Fibonnaci numbers to generate? "))
fibList = [] 

def fibSum(n):   
    if n <= 2:
        return 1
    else:
        return fibSum(n-1) + fibSum(n-2)
 
for x in range(n):
    fibList.append(fibSum(x+1))

print("Fibonnaci series with",n, "numbers =", fibList)

