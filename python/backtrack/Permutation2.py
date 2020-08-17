def permuteUnique(nums):
    res = []
    if nums == None or len(nums) == 0:
        return res
    helper(nums, res, 0)
    return res

def helper(nums, res, index):
    if index == len(nums):
        res.append([*nums]);
        return
        
    for i in range(index, len(nums)):
        check = requireSwap(nums, index, i)
        if not check:
            continue;
        nums = swap(nums, index, i)
        helper(nums, res, index + 1)
        nums = swap(nums, index, i)
        
def swap(nums, i, j):
    nums[i], nums[j] = nums[j], nums[i]
    return nums

def requireSwap(nums, start, curr):
    for i in range(start, curr):
        if nums[i] == nums[curr]:
            return False
    return True


print(permuteUnique([1, 1, 2]))

