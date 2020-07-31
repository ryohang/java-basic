class DateKey:
    def __init__(self, name, id):
        self.__name = name
        self.__id = id
    
    def __hash__(self):
        prime = 31;
        result = 1;
        result = prime * result + self.__id;
        result = prime * result + 0 if self.__name == None else id(self.__name);
        return result;
    
    def __eq__(self, other):
        if id(self) == id(other):
            return True
        if other==None:
            return False
        if not isinstance(other, DateKey):
            return False
        if self.__id != other.__id:
            return False
        return self.__name == other.__name
        
        
        
        
a = DateKey("Tom1", 123)
dic = {}
dic[a] = 10

b = DateKey("Tom1", 123)
print(b in dic)


