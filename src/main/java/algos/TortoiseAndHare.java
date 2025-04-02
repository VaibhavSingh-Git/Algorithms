package algos;

//Floyd's Linked List Cycle Finding Algorithm or Tortoise And Hare algorithm
//it involved two steps:
// 1. Figure out the presence of the cycle.
// 2. Find out the starting point of the cycle.

public class TortoiseAndHare {

    //Linked list Node
    public static class ListNode {
        int data;
        ListNode next;
        ListNode(int d)
        {
            data = d;
            next = null;
        }
    }

    // Presence of cycle
    static public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                ListNode startOfLoop = headOfLoop(head,fast);
                System.out.println(startOfLoop.data);
                return true;
            }
        }
        return false;
    }

    //start of the loop
    static public ListNode headOfLoop(ListNode head, ListNode tortoise)
    {
        ListNode hare=head;
        while(hare!=tortoise)
        {
            hare=hare.next;
            tortoise=tortoise.next;
        }
        return hare;
    }


    //Main method to test the algo
    public static void main(String[] args) {
        //creating 8 independent nodes
        ListNode nodeOne = new ListNode(1);
        ListNode nodeTwo = new ListNode(2);
        ListNode nodeThree = new ListNode(3);
        ListNode nodeFour = new ListNode(4);
        ListNode nodeFive = new ListNode(5);
        ListNode nodeSix = new ListNode(6);
        ListNode nodeSeven = new ListNode(7);
        ListNode nodeEight = new ListNode(8);

        //Head node pointing to first node of linked list
        ListNode head = nodeOne;

        //linking node to one another
        nodeOne.next = nodeTwo;
        nodeTwo.next = nodeThree;
        nodeThree.next = nodeFour;
        nodeFour.next = nodeFive;
        nodeFive.next = nodeSix;
        nodeSix.next = nodeSeven;
        nodeSeven.next = nodeEight;
        nodeEight.next = nodeThree; // this line creates the loop

        //calling method to evaluate
        System.out.println( hasCycle(head));
    }
}
