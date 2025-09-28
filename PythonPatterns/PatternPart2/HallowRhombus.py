# 🔹 Hollow Rhombus Pattern

def hollow_rhombus(n: int) -> None:
    """
    Prints a hollow rhombus pattern of size n.
    The rhombus is hollow, with stars (*) only on the borders and spaces inside.
    """
    for i in range(n + 1):
        # Print leading spaces to form rhombus shape
        for j in range(n - i):
            print(" ", end="")

        # Print stars and spaces inside the rhombus
        for j in range(n + 1):
            if i == 0 or i == n or j == 0 or j == n:
                print("*", end="")  # Print border stars
            else:
                print(" ", end="")  # Print spaces inside
        print()  # Move to next line after each row


def main():
    """
    Main function to take user input and print the hollow rhombus pattern.
    """
    try:
        n = int(input("Enter a number: "))
        hollow_rhombus(n)
    except ValueError:
        print("Please enter a valid integer.")


# Run program
main()


'''
Output->
Enter a Number: 5
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