def partition(nums, start, end, k):
    p = start + 1
    for i in range(start+1, end+1):
        if nums[i] > nums[start]:
            nums[i], nums[p] = nums[p], nums[i]
            p+=1

    nums[start], nums[p-1] = nums[p-1], nums[start]
    return p-1

def quick(nums, start, end, k):
    if start>=end:
        return ;
    p = partition(nums, start, end, k)
    if p>k-1:
        quick(nums, start, p-1, k)
    else:
        quick(nums, p+1, end, k)

def findKthLargest(nums, k):
    quick(nums, 0, len(nums)-1, k)
    return nums[k-1]
    
    
print(findKthLargest([3,2,1,5,6,4], 2))