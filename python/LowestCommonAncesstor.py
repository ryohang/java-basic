class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
        
n1 = TreeNode(1)
n2 = TreeNode(2)
n3 = TreeNode(3)
n1.left = n3
n1.right = n2
n3.left = TreeNode(5)
n3.right = TreeNode(6)
n2.right = TreeNode(9)


def lowestCommonAncestor(root, p, q):
    if root == p or root == q:
        return root
    
    left = right = None
    if root.left:
        left = lowestCommonAncestor(root.left, p, q)
    if root.right:
        right = lowestCommonAncestor(root.right, p, q)

    if left and right:
        return root
    else:
        return left or right

    
        
print(lowestCommonAncestor(n1, n2, n3).val)
