class Solution(object):
    def reorganizeString(self, s):
        """
        :type s: str
        :rtype: str
        """
        result = []
        adict = Counter(s)
        heap = [[-c, a] for a, c in adict.items()]
        heapq.heapify(heap)
        
        waitq = deque()
        while heap: 
            nc, a = heapq.heappop(heap)
            result.append(a)
            if nc +1 < 0: 
                waitq.append([nc +1,a])
            if waitq and a != waitq[0][1]: 
                # count, value = waitq.popleft()
                heapq.heappush(heap, waitq.popleft())
        if len(result) != len(s): 
            return ""
        else: 
            return "".join(result)