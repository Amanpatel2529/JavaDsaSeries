# 🔹 Right-Aligned Inverted Half Pyramid of Stars

def inverted_half_pyramid(n: int) -> None:
    """
    Prints a right-aligned inverted half pyramid pattern using stars (*).
    The first row has 1 star at the rightmost position, and each subsequent row
    increases stars while maintaining right alignment.
    """
    for i in range(n):
        # Print leading spaces to align stars to the right
        for j in range(n - i):
            print(" ", end="") 

        # Print stars for current row
        for j in range(i + 1):
            print("*", end="")

        print()  # Move to next line after each row


def main():
    """
    Main function to take user input and print the right-aligned inverted half pyramid.
    """
    try:
        n = int(input("Enter a Number: ")) 
        inverted_half_pyramid(n)
    except ValueError:
        print("Please enter a valid integer.")


# Run program
main()


'''
Output->
Enter a Number: 5
     *
    **
   ***
  ****
 *****

#Cross check with invalid integer.

Enter a number: -
Please enter a valid Integer
'''