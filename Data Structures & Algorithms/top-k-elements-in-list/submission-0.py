class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        stuff = Counter(nums)
        nlist = [[i, n] for n, i in stuff.items()]
        nlist.sort(reverse=True)
        return [pair[1] for pair in nlist][:k]