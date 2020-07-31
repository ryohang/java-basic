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


def lowestCommonAncesstor(root, p, q):
    if root==None or root==p or root==q:
        return root
    l = lowestCommonAncesstor(root.left, p, q)
    r = lowestCommonAncesstor(root.right, p, q)
    
    if l==None:
        return r
    if r==None:
        return l
    return root
    
        
print(lowestCommonAncesstor(n1, 2, 3))