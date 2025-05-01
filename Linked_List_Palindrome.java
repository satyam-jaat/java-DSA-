class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;

        while (temp != null) {
            sb.append(temp.val);
            temp = temp.next;
        }

        String original = sb.toString();
        String reversed = sb.reverse().toString();

        return original.equals(reversed);
    }
}

public class  Linked_List_Palindrome{
    public static void main(String[] args) {
        // Linked list: 1 -> 2 -> 2 -> 1
        ListNode n4 = new ListNode(1);
        ListNode n3 = new ListNode(2); n3.next = n4;
        ListNode n2 = new ListNode(2); n2.next = n3;
        ListNode n1 = new ListNode(1); n1.next = n2;

        Solution sol = new Solution();
        boolean result = sol.isPalindrome(n1);

        System.out.println("Is palindrome: " + result);
    }
}
