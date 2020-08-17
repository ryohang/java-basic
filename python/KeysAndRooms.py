def do(rooms, index, visited):
    for i in rooms[index]:
        if(not visited[i]):
            visited[i] = True
            do(rooms, i, visited)
    

def canVisitAllRooms(rooms):
    visited = [False] * len(rooms)
    visited[0] = True
    do(rooms, 0, visited)
    
    for i in visited:
        if not i:
            return False
    return True


print(canVisitAllRooms([[1],[2],[3],[]]))
