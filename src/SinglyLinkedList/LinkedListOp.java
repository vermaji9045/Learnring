package SinglyLinkedList;


class LinkList2
{
    Node head;

    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            next=null;
        }

    }

    public Node insertF(int data)
    {
        Node newnode=new Node(data);

        newnode.next=head;
        head=newnode;
        return head;

    }

    public Node InsertEnd(int data)
    {
        Node node=new Node(data);
        Node temp = head;

        if(head==null)
        {
            head=node;
        }

        else {
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;

        }
        head.next=temp;
        return head;

    }

public Node InsertNth(int data,int item) {
    Node node = new Node(data);
    Node temp = head;

    if (head == null) {
        head = node;
    } else {
        while (temp.next != null) {

            if (temp.data == item) {
                temp.next = node;

            }
            temp = temp.next;
        }
    }
    head.next=temp;
    return head;
    }

    void Display()
    {
        Node node=head;
        while(node!=null)
        {

            System.out.println(node.data+" ");
            node=node.next;


        }
    }

}
public class LinkedListOp {

    public static void main(String args[])
    {
        LinkList2 op=new LinkList2();
        op.insertF(10);
        op.insertF(20);

        System.out.println("Before Ending elements inserted ");
        op.Display();
        op.InsertEnd(30);
        System.out.println("After Ending elements inserted ");
        op.Display();
        op.InsertNth(40,10);
        System.out.println("Adding elements inserted ");
        op.Display();
    }
}
