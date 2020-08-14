class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def findMaxIndex(nums):
    re = -1
    maxVal = float('-inf')
    for index, i  in enumerate(nums):
        if i > maxVal:
            maxVal = i
            re = index
    return re

def constructMaximumBinaryTree(nums):
    if nums == []:
        return None
    if len(nums) == 1:
        return TreeNode(nums[0])
    
    maxIndex = findMaxIndex(nums)
    root = TreeNode(nums[maxIndex])
    leftTree = constructMaximumBinaryTree(nums[:maxIndex])
    rightTree = constructMaximumBinaryTree(nums[maxIndex+1:])
    
    root.left = leftTree
    root.right = rightTree
    return root
    
    
def dfs(root):
    print(root.val)
    if root.left:
        dfs(root.left)
    if root.right:
        dfs(root.right)

dfs(constructMaximumBinaryTree([3,2,1,6,0,5]))
#https://leetcode.com/problems/maximum-binary-tree/
