n= int(input("Please enter an integer: "))
a,b=0,1

while b < n:
    print(b, end=',')
    a,b = b, a+b
