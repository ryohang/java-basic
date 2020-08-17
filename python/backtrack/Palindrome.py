

def partition(s):
    def isPalindrome(str, l, r):
        if l == r: return True
        while l < r:
            if str[l] != str[r]:
                 return False;
            l+=1
            r-=1
        return True
    
    def isPalindrom(str):
        return isPalindrome(str, 0, len(str)-1)
        
    def backtrack(s, l):
        if len(curLst) > 0 and l >= len(s):
            r = [*curLst]
            resultLst.append(r)
        
        for i in range(l, len(s)):
            if isPalindrome(s, l, i):
                curLst.append(s[l: i + 1]);
                backtrack(s, i+1)
                del curLst[-1]

    def findPalindromComb(s):
        if len(temResult) > 0 and len(s) == 0:
            resultLst.append([*temResult])
            return
        
        for i in range(1, len(s)+1):
            curString = s[:i]
            if isPalindrom(curString):
                temResult.append(curString)
                findPalindromComb(s[i:])
                del temResult[-1]
        
        
    curLst = []
    resultLst = []
    temResult = []
    backtrack(s,0);
    # findPalindromComb(s);
    return resultLst;

    
print(partition("aba"))

