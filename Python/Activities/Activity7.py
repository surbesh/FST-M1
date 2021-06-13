numList = input("Enter a sequence of comma separated values: ")
	
def calculate_sum(numbers):
	sum = 0
	for number in numbers:
          print(number)
          print(numbers)
  	  sum += number
	return sum
result = calculate_sum(numList)

# Print result with message
print("The sum of all the elements is: " + str(result))




