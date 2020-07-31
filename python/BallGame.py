def calPoints(ops):
    stack = []
    
    for i in ops:
        if i == "C":
            stack.pop()
        elif i == "D":
            stack.append(stack[-1] + stack[-1])
        elif i == "+":
            stack.append(stack[-1] + stack[-2])
        else:
            stack.append(int(i))
            
    return sum(stack)


print(calPoints(["5","2","C","D","+"]))