# Enter players names
firstPlayer = input("What is 1st Player name? ")
secondPlayer = input("What is 2nd Player name? ")

# Get the users choices
firstPlayer_answer = input(firstPlayer + ", do you want to choose rock, paper or scissors? ").lower()
secondPlayer_answer = input(secondPlayer + ", do you want to choose rock, paper or scissors? ").lower()

# Run the algorithm to see who wins
if firstPlayer_answer == secondPlayer_answer:
    print("It's a tie!")
elif firstPlayer_answer == 'rock':
    if secondPlayer_answer == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif firstPlayer_answer == 'scissors':
    if secondPlayer_answer == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif firstPlayer_answer == 'paper':
    if secondPlayer_answer == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")