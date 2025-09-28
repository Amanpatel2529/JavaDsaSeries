# 🔹 Inverted Half Pyramid of Numbers

def inverted_half_pyramid_num(n: int) -> None:
    """
    Prints an inverted half pyramid pattern of numbers.
    Each row starts from 1 and decreases the number of elements as rows increase.
    """
    for i in range(n + 1):
        # Print numbers in decreasing length per row
        for j in range(n - i + 1):
            print(j + 1, end=" ")  # Print number with space
        print()  # Move to next line after each row


def main():
    """
    Main function to take user input and print the pattern.
    """
    try:
        n = int(input("Enter a number: "))
        inverted_half_pyramid_num(n)
    except ValueError:
        print("Please enter a valid integer.")


# Run program
main()


'''
Output->
Enter a Number: 5
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

#Cross check with invalid integer.

Enter a number: -
Please enter a valid Integer
'''