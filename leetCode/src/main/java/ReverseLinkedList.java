public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode reversed = reverseList(head.next);
//        System.out.println(head);
        reversed.next.next = head;
        reversed.next = null;
        return reversed;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(reverseList(head));
//        reverseList(head);
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        ListNode current = this;
        StringBuilder str = new StringBuilder();
        while (current != null) {
            str.append(current.val).append(", ");
            current = current.next;
        }
        return str.toString();
    }
}
