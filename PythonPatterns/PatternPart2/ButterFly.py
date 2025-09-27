# Butterfly Pattern: Prints a symmetric butterfly-shaped star pattern

def butterfly_pattern(n):
    """ 
    Prints a butterfly pattern of stars.
    
    """
    # Upper half of the butterfly
    for i in range(1, n + 1):
        # Print stars on left wing
        for j in range(1, i + 1):
            print("*", end="")
        # Print spaces between wings
        for j in range(1, 2 * (n - i) + 1):
            print(" ", end="")
        # Print stars on right wing
        for j in range(1, i + 1):
            print("*", end="")
        print()  # Newline after each row
    
    # Lower half of the butterfly
    for i in range(n, 0, -1):
        # Print stars on left wing
        for j in range(1, i + 1):
            print("*", end="")
        # Print spaces between wings
        for j in range(1, 2 * (n - i) + 1):
            print(" ", end="")
        # Print stars on right wing
        for j in range(1, i + 1):
            print("*", end="")
        print()  # Newline after each row
        
def main():
    """
    Main function to take user input and handle invalid cases.
    """
    try:
        n = int(input("Enter number of rows for butterfly pattern: "))
        butterfly_pattern(n)
    except ValueError:
        print("Please enter a valid integer.")
        
# Program execution starts here
main()


'''
Output-:

Enter number of rows for butterfly pattern: 5
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *


# Cross check with Invalid Input

Enter number of rows for butterfly pattern: g
Please enter a valid integer.
'''