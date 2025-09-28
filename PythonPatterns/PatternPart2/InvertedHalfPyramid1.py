# 🔹 Inverted Half Pyramid of Stars

def inverted_half_pyramid(n: int) -> None:
    """
    Prints an inverted half pyramid pattern using stars (*).
    The first row has n stars, decreasing by one star per row.
    """
    for i in range(n - 1, -1, -1):
        # Print stars for current row
        for j in range(i + 1):
            print("*", end=" ")  # Print star followed by a space
        print()  # Move to next line after each row


def main():
    """
    Main function to take user input and print the star pattern.
    """
    try:
        n = int(input("Enter a number: "))
        inverted_half_pyramid(n)
    except ValueError:
        print("Please enter a valid integer.")


# Run program
main()



'''
Output->
Enter a Number: 5
* * * * * 
* * * * 
* * * 
* * 
* 

#Cross check with invalid integer.

Enter a number: -
Please enter a valid Integer
'''