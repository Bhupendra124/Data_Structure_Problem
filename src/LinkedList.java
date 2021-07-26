public class LinkedList
{
    Node head;
    // Create a node
    class Node
    {
        int item;
        Node next;
        Node(int d)
        {
            item = d;
            next = null;
        }
    }

    public void insertAtBeginning(int data)
    {
        // insert the item
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void insertAfter(Node prev_node, int data)
    {
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }


    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.item + " ");
            node = node.next;
        }
    }

}
