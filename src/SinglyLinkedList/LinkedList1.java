package SinglyLinkedList;
class LinkList
{
    Node head;
class Node {
    int data;
    Node next = null;

    Node(int x) {
        this.data = x;
        next = null;
    }
}

    public Node insert(int data)
    {
        Node newnode=new Node(data);
         newnode.next=head;
         head=newnode;

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

    //Delete Node
    void Delete()
    {
        if(head==null)
        {
            System.out.println("Deletion is not posiable");


        }
        System.out.println("Deleted "+ head.data);
        head=head.next;

    }

}

public class LinkedList1 {

    public static void main(String args[])
    {
        LinkList lis=new LinkList();
        lis.insert(10);
        lis.insert(20);
        lis.insert(30);
        System.out.println("Before Deletion");
        lis.Display();
        System.out.println("After Deletion");
        lis.Delete();
        lis.Display();


    }
}
