def singleNonDuplicate(nums):
    lo, hi = 0, len(nums) - 1
    while lo < hi:
        mid = 2 * ((lo + hi) // 4)
        if nums[mid] == nums[mid+1]:
            lo = mid+2
        else:
            hi = mid
    return nums[lo]
    
    
print(singleNonDuplicate([1,1,2,3,3,4,4,8,8]))