import pandas

inputData = pandas.read_csv("resources/credentials.csv")

print(inputData["Username"])

print(inputData["Username"][1], inputData["Passwords"][1])

print(inputData.sort_values('Username'))

print(inputData.sort_values('Passwords',ascending=False))

