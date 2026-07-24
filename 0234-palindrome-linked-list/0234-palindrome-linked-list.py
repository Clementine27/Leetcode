# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: bool
        """
        if not head: return True
        slow, fast = head, head 
        while fast.next and fast.next.next: 
            slow = slow.next
            fast = fast.next.next 

        prev, curr = slow, slow.next 
        prev.next = None 
        while curr: 
            nxt = curr.next 
            curr.next = prev 
            prev = curr 
            curr = nxt 
        
        l1, l2 = head, prev 
        while l1: 
            if l1.val != l2.val: 
                return False 
            l1 = l1.next 
            l2 = l2.next 
        return True