// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy head to help easily return the result list
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        
        int carry = 0; // Initialize carry to 0
        
        // Traverse both lists until you reach the end of both
        while (l1 != null || l2 != null) {
            // Get values from the current nodes or 0 if we've reached the end of a list
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            // Sum the values and the carry from the previous step
            int sum = carry + x + y;
            
            // Update the carry for the next iteration
            carry = sum / 10;
            
            // Create a new node with the digit value of the current sum
            current.next = new ListNode(sum % 10);
            
            // Move to the next node in the result list
            current = current.next;
            
            // Move to the next nodes in the input lists if available
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        // If there's a carry left after the last iteration, add a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        // Return the next of dummy head which is the actual result list
        return dummyHead.next;
    }
}

public class Driver {
    public static void main(String[] args) {
        // Test case 1
        int[] num1 = {2, 4, 3};
        int[] num2 = {5, 6, 4};
        ListNode l1 = createLinkedList(num1);
        ListNode l2 = createLinkedList(num2);
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(l1, l2);
        printLinkedList(result);  // Expected output: 7 -> 0 -> 8

        // Test case 2
        int[] num3 = {0};
        int[] num4 = {0};
        l1 = createLinkedList(num3);
        l2 = createLinkedList(num4);
        result = solution.addTwoNumbers(l1, l2);
        printLinkedList(result);  // Expected output: 0

        // Test case 3
        int[] num5 = {9, 9, 9, 9, 9, 9, 9};
        int[] num6 = {9, 9, 9, 9};
        l1 = createLinkedList(num5);
        l2 = createLinkedList(num6);
        result = solution.addTwoNumbers(l1, l2);
        printLinkedList(result);  // Expected output: 8 -> 9 -> 9 -> 9 -> 0 -> 0 -> 0 -> 1
    }

    // Utility method to create a linked list from an array
    public static ListNode createLinkedList(int[] nums) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummyHead.next;
    }

    // Utility method to print a linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
