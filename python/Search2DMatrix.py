def searchMatrix(matrix, target):
    if not matrix or target is None:
        return False

    rows, cols = len(matrix), len(matrix[0])
    low, high = 0, rows * cols - 1
    
    while low <= high:
        mid = (low + high) // 2
        num = matrix[mid // cols][mid % cols]

        if num == target:
            return True
        elif num < target:
            low = mid + 1
        else:
            high = mid - 1
    
    return False
    
    

matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 3


print(searchMatrix(matrix, target))