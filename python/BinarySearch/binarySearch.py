
def binary_search(arr, l, r, target):
    if l > r: 
        return -1
    mid = (l+r)//2
    if arr[mid] == target:
        return mid
    elif arr[mid] < target:
        return binary_search(arr, mid+1, r, target)
    else:
        return binary_search(arr, l, mid-1, target)
    
def search(arr, target):
    return binary_search(arr, 0, len(arr)-1, target)
    
print(search([1,2,3,4,5], 100))