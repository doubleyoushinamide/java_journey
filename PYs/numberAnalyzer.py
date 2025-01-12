print("Welcome to the Number Analyzer and Manager!")
try:
    numbers = input("Enter a list of integers separated by spaces: ")
    number_arrays = [int(x) for x in numbers.split()]
except ValueError:
    print("Invalid input. Please enter only integers separated by spaces.")
    exit()

while True:
    print("Choose an option:")
    print("1. Display all numbers")
    print("2. Find and display the largest number")
    print("3. Find and display the smallest number")
    print("4. Calculate and display the sum of all numbers")
    print("5. Display all even numbers")
    print("6. Display all odd numbers")
    print("7. Exit")
    
    try:
        response = int(input("Please enter: "))
    except ValueError:
        print("Invalid input. Please enter a number between 1 and 7.")
        continue
    
    if response == 1:
        print(number_arrays)
        continue
    elif response == 2:
        print(f"Largest number is: {max(number_arrays)}")
        continue
    elif response == 3:
        print(f"Smallest Number: {min(number_arrays)}")
        continue
    elif response == 4:
        print(f"Sum of numbers: {sum(number_arrays)}")
        continue
    elif response == 5:
        even_numbers = [i for i in number_arrays if i % 2 == 0]
        print(f"Even numbers are: {even_numbers}")
        continue
    elif response == 6:
        odd_numbers = [i for i in number_arrays if i % 2 != 0]
        print(f"Odd numbers are: {odd_numbers}")
        continue
    elif response == 7:
        print("Exiting the program. Goodbye!")
        break
    else:
        print("Enter a valid input!")
        continue