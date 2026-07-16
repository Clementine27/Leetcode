class Solution(object):
    def maxSlidingWindow(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        result = []
        rnums = [[-n, i] for i, n in enumerate(nums)]
        heap = []
        heapq.heapify(heap)
        for i in range(k): 
            heapq.heappush(heap, rnums[i])
        result.append(-heap[0][0])
        for l in range(1, len(nums)-k+1): 
            r = l + k -1
            heapq.heappush(heap, rnums[r])
            while heap[0][1] < l: 
                heapq.heappop(heap)
            result.append(-heap[0][0])

        return result