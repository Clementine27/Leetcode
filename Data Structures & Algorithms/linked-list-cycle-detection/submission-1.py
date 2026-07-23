# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if not head: return False
        slow, fast = head, head 
        while fast.next != slow and fast.next and fast.next.next: 
            slow = slow.next 
            fast = fast.next.next 
        
        if fast.next == None or fast.next.next ==None: 
            return False 
        return True