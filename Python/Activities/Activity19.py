# Import pandas
import pandas
from pandas import ExcelWriter

#Dictionary is created
data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

#  DataFrame created
dataframe = pandas.DataFrame(data)

# Writing  to a Excel file
writer = ExcelWriter('sampledata.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)

# saving in the file
writer.save()