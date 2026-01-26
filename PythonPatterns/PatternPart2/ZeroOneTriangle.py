# 🔹 Inverted Half Pyramid Number Pattern (Binary: 1s and 0s)

def inverted_half_pyramid_num(n: int) -> None:
    """
    Prints an inverted half pyramid number pattern using 1s and 0s.
    The value at each position is determined by (row_index + col_index) % 2.
    """
    for i in range(n + 1):  
        for j in range(i + 1):
            sum1 = i + j  # sum of row and column indices

            # Print '1' if sum is even, else '0'
            if sum1 % 2 == 0:
                print("1 ", end="")
            else:
                print("0 ", end="")

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
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1 

#Cross check with invalid integer.

Enter a number: -
Please enter a valid Integer
'''