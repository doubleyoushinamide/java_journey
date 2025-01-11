print("Welcome to the Number Analyzer and Manager!")
numbers = input("Enter a list of integers separated by spaces: ")
number_arrays = [int(x) for x in numbers.split()]

while True:
    print("Choose an option:")
    print("1. Display all numbers")
    print("2. Find and display the largest number")
    print("3. Find and display the smallest number")
    print("4. Calculate and display the sum of all numbers")
    print("5. Display all even numbers")
    print("6. Display all odd numbers")
    print("7. Exit")
    response = int(input("Please enter: "))
    
    if response == 1:
        print(number_arrays)
        continue
    elif response == 2:
        number_arrays.sort()
        print(f"Largest number is: {number_arrays[-1]}")
        continue
    elif response == 3:
        number_arrays.sort()
        print(f"Smallest Number: {number_arrays[0]}")
        continue
    elif response == 4:
        sum_of_numbers = 0
        for i in number_arrays:
            sum_of_numbers += i
        print(f"Sum of numbers: {sum_of_numbers}")
        continue
    elif response == 5:
        even_numbers = []
        for i in number_arrays:
            if i%2 == 0:
                even_numbers.append(i)
        print(f"Even numbers are: {even_numbers}")
        continue
    elif response == 6:
        odd_numbers = []
        for i in number_arrays:
            if i%2 != 0:
                odd_numbers.append(i)
        print(f"Odd numbers are: {odd_numbers}")
        continue
    elif response == 7:
        print("Thank you for playing the Number Analyzer game!")
        break
    else:
        print("Enter a valid input!")
        continue