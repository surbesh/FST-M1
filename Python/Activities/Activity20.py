# Import pandas
import pandas

# Reading from Excel sheet
dataframe = pandas.read_excel('sampledata.xlsx')

# Printing rows and columns
print("Number of rows and columns:", dataframe.shape)

# Printing emails column only
print(dataframe['Email'])

# Sorting the data based on FirstName in ascending order

print(dataframe.sort_values('FirstName'))