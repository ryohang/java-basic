def findDuplicates(nums):
    re = []
    for i in range(len(nums)):
        index = abs(nums[i])
        if nums[index-1] < 0:
            re.append(index)
        else:
            nums[index-1] = -nums[index-1]
    return re
    
    
print(findDuplicates([4,3,2,7,8,2,3,1]))