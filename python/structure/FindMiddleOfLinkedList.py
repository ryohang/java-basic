class Node:
    def __init__(self, val):
        self.val = val
        self.next = None


def find_middle(head):
    slow = fast = head
    while fast != None and fast.next != None:
        slow = slow.next
        fast = fast.next.next
    return slow

    
# 1 -> 2 -> 5 -> 4
n1 = Node(1)
n2 = Node(2)
n5 = Node(5)
n4 = Node(4)
n1.next = n2
n2.next = n5
n5.next = n4

print(find_middle(n1).val)



