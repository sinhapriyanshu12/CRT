class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack();
        ListNode temp = head;
        while(temp != null) {
            stack.push(temp.val);
            temp =temp.next;
        }
        temp = head;
        while(temp != null && temp.val == stack.pop()) {
            temp = temp.next;
        }
        return temp == null;
    }
}