def search(nums, target):
    if len(nums)==1:
        return 0
    l,r = 0, len(nums)-1
    while l<=r:
        mid = (l+r)//2
        if target < nums[mid]:
            r = mid-1
        elif target > nums[mid]:
            l = mid + 1
        else:
            return mid

def searchRange(nums, target):
    if len(nums)==0:
        return [-1,-1]
    
    r = search(nums, target)
    if r>=0 and r<len(nums) and nums[r]==target:
        i = r
        while i>=0 and nums[i]==target:
            i-=1
        j = r;
        while j<len(nums) and nums[j]==nums[r]:
            j+=1
        i+=1
        j-=1
        return [i,j]
    else:
        return [-1,-1]
        



print(searchRange([5,7,7,8,8,10], 8))

