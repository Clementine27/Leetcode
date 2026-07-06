class Solution:
    def isPalindrome(self, s: str) -> bool:
        normalised = re.sub(r'[^a-z0-9]', '', s.lower())
        l = 0
        r = len(normalised)-1
        while l<r: 
            if normalised[l] != normalised[r]: 
                return False
            l+=1
            r-=1
        return True