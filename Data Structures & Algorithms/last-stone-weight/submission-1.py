class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        heap = [-s for s in stones]
        heapq.heapify(heap)

        while len(heap)>1: 
            diff = heapq.heappop(heap) - heapq.heappop(heap) 
            if diff < 0: 
                heapq.heappush(heap, diff)
        if len(heap) ==1: 
            return -heap[0] 
        else: 
            return 0