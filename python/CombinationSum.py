def combinationSum(can, target):
    def help(can,t):
        if t<0 or not can:
            return []
        re=[]
        for i in range(len(can)):
            if can[i]>t:
                continue
            if t==can[i]:
                re.append([can[i]])
            else:            
                tl=help(can[i:],t-can[i])
                for j in tl:
                    j.append(can[i])
                re+=tl
        return re
    return help(can,target)
    
    
    

print(combinationSum([2,3,6,7], 7))