def arrayDeclare(n): 
    arr = [0] * n 
    for i in range(n):
        num = int(input('Enter array element : ')) 
        arr[i] = num 
    print(arr[0])
    print(arr[1])
    print(arr[2])
        
def main():
    n = 3
    arrayDeclare(n) 
main()