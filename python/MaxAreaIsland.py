def maxAreaOfIsland(grid):
    c=[0]   
    def dfs(arr, i, j):
        if i>=0 and i<len(arr) and j>=0 and j<len(arr[0]) and arr[i][j]==1:
            c[0]+=1
            arr[i][j]=0
        else:
            return
        dfs(arr,i-1,j);
        dfs(arr,i+1,j);
        dfs(arr,i,j-1);
        dfs(arr,i,j+1);


    if len(grid)==0:
        return 0
    maxRe = 0
    for i in range(len(grid)):
        for j in range(len(grid[0])):
            c = [0]
            dfs(grid, i, j)
            maxRe = max(maxRe, c[0])
    return maxRe
    
    
grid = [[1,1,0,0,0],[1,1,0,0,0],[0,0,0,1,1],[0,0,0,1,1]]
print(maxAreaOfIsland(grid))