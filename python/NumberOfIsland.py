def numIslands(grid):
    def fill(grid, i, j):
        r = len(grid)
        c = len(grid[0])
        if i<0 or i>=r or j<0 or j>=c:
            return
        if grid[i][j]=='1':
            grid[i][j]='0'
        else:
            return
        
        fill(grid,i-1,j)
        fill(grid,i,j+1)
        fill(grid,i,j-1)
        fill(grid,i+1,j)
    
    r = len(grid)
    if r==0:
        return r
    c = len(grid[0])
    rsum=0
    for i in range(r):
        for j in range(c):
            if grid[i][j] == '1':
                rsum+=1
                fill(grid, i, j)
    return rsum
    
    
grid = [["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]]
print(numIslands(grid))