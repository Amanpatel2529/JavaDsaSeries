## Floyd's Triangle: Prints a triangle where numbers continue across rows sequentially

def Floyd_Trianngle(n):
    
    """
    Prints Floyd's Triangle: a half pyramid with numbers continuing sequentially across rows.
    """
    
    num = 1  # Initialize starting number
    
    # Outer loop for rows
    for i in range(1, n + 1):
        
        # Inner loop for printing numbers in each row
        for j in range(1, i + 1):
            
            print(num, end=" ")   # Print number followed by a space
            num+=1                # Increment number for next print
            
        print()                  # Print newline after each row


"""
Main function to take user input and handle invalid input gracefully.
"""
def main():
    try:
        n = int(input("Enter number : "))
        Floyd_Trianngle(n)
    except ValueError:
        print("Please enter a valid integer.")

# Program execution starts here
main()


'''

Output -: 
Enter number : 5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

#Cross check with Invalid Value

Enter number : #
Please enter a valid integer.


'''