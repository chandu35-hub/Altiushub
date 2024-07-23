Public class ReverseList {
    public static ListNode reverse (ListNode head) {
        // Ans variable is to store the reversed list
        ListNode ans = null;
        // To store the previous node temporarily while iterating
        ListNode prev = head;
        // To store the current node after every iteration
        ListNode curr = head;

        // Iterates the loop from head to tail
        while (curr != null) {
            // Updates previous node with current
            prev = curr;
            // Updates current node with the next
            curr = curr.next;
            // Sets already reversed linked list to previous node
            prev.next = ans;
            // Updates the ans with previous node
            ans = prev;
        }

        // Returns the reversed linkedlist
        return ans;
    }
}