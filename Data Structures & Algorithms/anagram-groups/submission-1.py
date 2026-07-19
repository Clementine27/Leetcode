class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashTable = defaultdict(list)
        for s in strs: 
            sdict = [0]*26 
            for c in s: 
                index = ord(c) - ord('a')
                sdict[index] +=1 
            hashTable[tuple(sdict)].append(s)

        return list(hashTable.values())