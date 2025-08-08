
class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        
        ListNode current = head;
        while (current != null) {
            // If we have already seen this node, it's the start of cycle
            if (visited.contains(current)) {
                return current;
            }
            visited.add(current);
            current = current.next;
        }
        
        return null; // No cycle found
    }
}