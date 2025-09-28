# Inverted Star Pattern: Prints a half pyramid of stars in inverted order

def inverted_star(n):
    """
    Prints an inverted star pattern.
    
    """
    
    # Outer loop for number of rows
    for i in range(1, n + 1):
        
        # Inner loop for printing stars in each row
        for j in range(1, n - i + 2):
            print("*", end="")  # Print star without newline
            
        print()                # Print newline after each row


def main():
    """
    Main function to take user input and handle invalid cases.
    """
    
    try:
        # Take integer input from user
        n = int(input("Enter number to print inverted star pattern: "))
        inverted_star(n)
        
    except ValueError:
        # Handle non-integer inputs gracefully
        print("Please enter a valid integer.")

main()


''' 

output-: 

Enter number to print inverted star pattern: 5
*****
****
***
**
*

#Cross check with Invalid Integer-: 
Enter number to print inverted star pattern: @
Please enter a valid integer.

'''