# 🔹 Hollow Rectangle Pattern

def hollow_rectangle(n: int) -> None:
    """
    Prints a hollow rectangle pattern of size n.
    The rectangle has stars (*) on the borders and spaces inside.
    """
    for i in range(n + 1):
        # Loop through columns
        for j in range(n + 1):
            if i == 0 or i == n or j == 0 or j == n:
                print("*", end="")  # Print border stars
            else:
                print(" ", end="")  # Print spaces inside
        print()  # Move to next line after each row


def main():
    """
    Main function to take user input and print the hollow rectangle pattern.
    """
    try:
        n = int(input("Enter a number: "))
        hollow_rectangle(n)
    except ValueError:
        print("Please enter a valid integer.")


# Run program
main()


'''
Output-> 

Enter a number: 5
******
*    *
*    *
*    *
*    *
******

#Cross check with invalid integer.

Enter a number: -
Please enter a valid Integer

'''