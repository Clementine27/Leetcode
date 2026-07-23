# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reorderList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: None Do not return anything, modify head in-place instead.
        """
        # part 1: 
        if not head: 
            return []
        slow, fast = head, head 
        while fast.next and fast.next.next: 
            slow = slow.next
            fast = fast.next.next
        
        prev, curr = None, slow.next 
        while curr: 
            nxt = curr.next 
            curr.next = prev 
            prev = curr
            curr = nxt 
        slow.next = None 
        
        h1, h2 = head, prev 
        while h2: 
            nxt = h1.next 
            h1.next = h2
            h1 = h2 
            h2 = nxt
        
