
def largestValues(root):
    if(root==None):
        return []
    
    que = [root]
    re = []
    
    while len(que)!=0:
        size = len(que)
        tmax = float('-inf')

        for i in range(size):
            t = que.pop(0)
            tmax = max(tmax, t.val)
            
            if(t.left != None):
                que.append(t.left)
            if(t.right != None):
                que.append(t.right)
        
        re.append(tmax)
    return re
    
    
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
n3.right = TreeNode(3)
n2.right = TreeNode(9)

print(largestValues(n1))