# Half Pyramid with Row Numbers: Prints a half pyramid where each row shows numbers from 1 to row number

def half_pyramid(n):
    """
    Prints a half pyramid with numbers from 1 to the current row number in each row.
    """
    
    # Outer loop for rows
    for i in range(1, n + 1):
        # Inner loop for printing numbers in each row
        
        for j in range(1, i + 1):
            print(j, end="")  # Print numbers in the same line without space
            
        print()  # Print newline after each row


def main():
    """
    Main function to take user input and handle invalid cases.
    """
    try:
        # Take integer input from user
        n = int(input("Enter number : "))
        half_pyramid(n)
    except ValueError:
        # Handle non-integer inputs gracefully
        print("Please enter a valid integer.")


# Program execution starts here
main()

'''

Output -: 
Enter number : 5
1
12
123
1234
12345

#Cross check with Invalid Value

Enter number : #
Please enter a valid integer.

'''