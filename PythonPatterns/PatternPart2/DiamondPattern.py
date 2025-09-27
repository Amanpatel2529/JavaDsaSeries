# Diamond Pattern: Prints a symmetric diamond-shaped star pattern

def diamond_pattern(n):
    # Upper triangle of the diamond
    for i in range(1, n + 1):
        # Print leading spaces
        for j in range(1, n - i + 1):
            print(" ", end="")
        # Print stars
        for j in range(1, 2 * i):
            print("*", end="")
        print()  # Newline after each row
    
    # Lower triangle of the diamond
    for i in range(n, 0, -1):
        # Print leading spaces
        for j in range(1, n - i + 1):
            print(" ", end="")
        # Print stars
        for j in range(1, 2 * i):
            print("*", end="")
        print()  # Newline after each row


def main():
    """
    Main function to take user input and handle invalid cases.
    """
    try:
        n = int(input("Enter number of rows for diamond pattern: "))
        diamond_pattern(n)
    except ValueError:
        print("Please enter a valid integer.")


# Program execution starts here
main()


'''
Output-: 

    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
    
# Cross check with Invalid Input

Enter number of rows for diamond pattern: g
Please enter a valid integer.

'''