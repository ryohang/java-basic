# Leetcode challenge in python
 learn basic data structure and practice in python

## data structure
   * Queue [Link to python documentation](https://docs.python.org/3/library/queue.html)
   * Stack
   * List
   * Dict(Map)
   * Tree

## algrithm highlight
### binary tree dfs
```python
def preorder(root):
    if root:
        return [root.val] + preorder(root.left) + preorder(root.right) 
    else:
        return []
```

## Environment setup
### python installation
```bash
    pipenv install
    pipenv shell
```

