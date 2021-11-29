#Import Pandas
import pandas as pd

data = {
    "X":[1, 2, 3, 4, 5],
    "Y":[1, 2, 13, 44, 5],
    "Z":[1, 21, 23, 4, 55],
}

# To create a DataFrame

df = pd.DataFrame(data)

print(df)
