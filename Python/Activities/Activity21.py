import pytest

# Additon test
def test_addition():
	
    # Initialize two numbers
	num1 = 100
	num2 = 150
    
	sum = num1 + num2

	# Assertion
	assert sum == 250

# Subtraction test
def test_subtraction():
  
	# Initialize two numbers
	num1 = 500
	num2 = 350
    
	# Subtract them
	diff = num1 - num2

	# Assertion
	assert diff == 150

# Multiplication test
def test_multiplication():
  
	# Initialize two numbers
	num1 = 50
	num2 = 200
    
	# Multiply them
	prod = num1 * num2

	# Assertion
	assert prod == 10000

# Division test
def test_division():
  
	# Initialize two numbers
	num1 = 10
	num2 = 2
    
	# Divide them
	quot = num1 / num2

	# Assertion
	assert quot == 5