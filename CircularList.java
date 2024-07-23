Public class CircularList {

    // In this function I used 2 pointers approach to detect the cycle

    // If the linked list contains cycle the pointers will keep on iterating
    // inside the list and the fast pointer moves twice the speed of slow pointer
    // when we are moving in cycle if one person moves twice the speed of other they
    // will definitely meet at some point so if the pointers value is same that means
    // they met which means the linkedlist contains cycle
    // Else the linkedlist does not contain cycle...

    // the function is return boolean value
    // true = if linkedlist contains cycle
    // false = if it doesnot

    public static boolean IsCircular (ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
            return true;
        }

        return false;
    }
}