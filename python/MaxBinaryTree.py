class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def treePrint(root):
    if root!=None:
        print(root.val)
        treePrint(root.left)
        treePrint(root.right)

def constructMaximumBinaryTree(nums):
    stack = []
    for i in range(len(nums)):
        cur = TreeNode(nums[i])
        while len(stack)>0 and stack[-1].val < nums[i]:
            cur.left = stack.pop()
        if(len(stack)>0):
            stack[-1].right = cur
        stack.append(cur)
    return None if len(stack) == 0 else stack[0]
    
    
nums = [3,2,1,6,0,5]
tree = constructMaximumBinaryTree(nums)
treePrint(tree)