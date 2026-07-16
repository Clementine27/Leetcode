class Twitter:

    def __init__(self):
        # userid: [tweets]
        self.order = 0 
        self.tweets = defaultdict(list)
        self.followee = defaultdict(set)

    def postTweet(self, userId: int, tweetId: int) -> None:
        self.tweets[userId].append([self.order, tweetId])
        self.order -=1 

    def getNewsFeed(self, userId: int) -> List[int]:
        result = []
        heap = []
        heapq.heapify(heap)

        self.followee[userId].add(userId)
        for followee in self.followee[userId]: 
            index = len(self.tweets[followee]) -1 
            if index >=0: 
                order, tweetId = self.tweets[followee][index]
                heapq.heappush(heap, [order, tweetId, followee, index])
        while heap and len(result) < 10: 
            order, tweetId, followee, index = heapq.heappop(heap)
            result.append(tweetId)
            if index-1 >= 0: 
                newOrder, newTweetId = self.tweets[followee][index-1]
                heapq.heappush(heap, [newOrder, newTweetId, followee, index-1])
        return result   

    def follow(self, followerId: int, followeeId: int) -> None:
        self.followee[followerId].add(followeeId)

    def unfollow(self, followerId: int, followeeId: int) -> None:
        if followeeId in self.followee[followerId]: 
            self.followee[followerId].remove(followeeId)

