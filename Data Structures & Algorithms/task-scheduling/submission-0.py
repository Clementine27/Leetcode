class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        counts = Counter(tasks)
        maxHeap = [-c for c in counts.values()]
        heapq.heapify(maxHeap) 
        q = deque() 
        time = 0 
        while maxHeap or q: 
            time +=1 
            if maxHeap: 
                # because heap is negative
                 newCount = 1 + heapq.heappop(maxHeap)
                 if newCount < 0: 
                    q.append([newCount, time+n])
            if q and q[0][1] == time: 
                heapq.heappush(maxHeap, q.popleft()[0])
        return time 