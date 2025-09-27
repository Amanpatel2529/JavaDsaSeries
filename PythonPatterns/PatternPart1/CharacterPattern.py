# Character Pyramid: Prints a half pyramid of consecutive letters starting from 'A'

def character_pattern(n):
    
    """
    Prints a character pattern in the form of a half pyramid.
    
    """
    ch = ord('A')  # get ASCII code of 'A' 
    
    # Outer loop for number of rows
    for i in range(1, n + 1):
        
        # Inner loop for printing characters in each row
        for j in range(1, i + 1): 
            
            print(chr(ch), end="")  # Convert ASCII to character and print
            ch += 1                 # Move to the next character in sequence
            
        print()                 # Print a newline after each row

def main():
    """
    Main function to take user input and handle errors.
    """
    
    try:
        # Take input from user
        n = int(input("Enter Number : "))
        character_pattern(n)
        
    except ValueError:
        # Handle non-integer inputs gracefully
        print("Please enter a valid integer.")

main() 


'''
Output-: 

Enter Number : 4 
A
BC
DEF
GHIJ

#Cross Check with Invalid Integer-:  

Enter Number : g
Please enter a valid integer.

'''
