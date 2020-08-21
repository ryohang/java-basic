class Node:
    def __init__(self, val):
        self.val = val
        self.next = None


def len_linked_list(head):
    c = 0
    while head!=None:
        c+=1
        head = head.next
    return c
    
    
# 1 -> 2 -> 5 -> 4
n1 = Node(1)
n2 = Node(2)
n5 = Node(5)
n4 = Node(4)
n1.next = n2
n2.next = n5
n5.next = n4

print(len_linked_list(n1))