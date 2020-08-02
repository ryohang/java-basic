class Node:
    def __init__(self, val, nextVal=None):
        self.val = val
        self.next = nextVal
        
def detectLoop(head):
    p1 = head
    p2 = head.next
    
    while p1!=None and p2!=None:
        if p1 == p2:
            return True
        else:
            p1 = p1.next
            p2 = p2.next
            if p2==None:
                return False
            p2 = p2.next
    return False

n1 = Node(1)
n2 = Node(2)
n3 = Node(3)

n1.next = n2
n2.next = n3
n3.next = n1
print(detectLoop(n1))