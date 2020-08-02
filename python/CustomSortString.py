def customSortString(S, T):
    l = []
    for i in S:
            l.append(i*T.count(i))
    for i in T:
        if i not in S:
            l.append(i)
    return ''.join(l)
    
    
print(customSortString("cba", "abcd"))