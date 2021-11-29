import pandas
from pandas.core.frame import DataFrame
from pandas.core.indexes.base import Index

data = {
    "Username": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}

DataFrame = pandas.DataFrame(data)

DataFrame.to_csv(("resources/credentials.csv"), index = False)