def fibonacci(t):
    if t==0 or t==1:
        return 1
    else:
        num=fibonacci(t-2)+fibonacci(t-1)
        return num

print(fibonacci(10))
   
