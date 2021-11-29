fruitDict = {"apple": 1, "banana": 0.5, "cherry": 3}

fruitCheck = input("Enter the name of the fruit to be checked in the dictionary: ")

if (fruitCheck in fruitDict):
    print(fruitCheck, "is available in the fruit dictionary")
else:
    print(fruitCheck, "is not available in the fruit dictionary")