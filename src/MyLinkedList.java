

public class MyLinkedList {
    Node head;
       void  add( int data){
    Node toAdd=new Node(data);

    if (isEmpty()){
        head=toAdd;
        return;
    }
    Node temp=head;
    while (temp.next !=null){
        temp=temp.next;
    }
    temp.next=toAdd;
}


    public void addRear( int data) {
        Node node = new Node(data);
        Node temp = head;
        if (head == null) {
            head = node;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node = temp;
        }
    }


    void print(){
    Node temp=head;
    while (temp !=null){
        System.out.println(temp.data+" ");
        temp=temp.next;
    }
}
boolean isEmpty(){
    return  head==null;
}


    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next=null;
        }
    }

}
