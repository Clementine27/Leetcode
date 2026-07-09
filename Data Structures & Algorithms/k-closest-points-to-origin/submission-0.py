class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        heap = []
        for p in points:
            d =  math.sqrt(p[0]**2 + p[1]**2)
            heap.append([-d, p])
        heapq.heapify(heap)
        while len(heap) > k: 
            heapq.heappop(heap)
        return [h[1] for h in heap]