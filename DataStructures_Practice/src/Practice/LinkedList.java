package Practice;

public class LinkedList{
    Node head;

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "__");
            currNode = currNode.next;
        }
        System.out.println("---END---");
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }

        head = head.next;
    }

    public void deleteLast(){
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }

//        if(head.next == null){
//            head = null;
//            return;
//        }

        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }

    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        //list.printList();

        list.addLast("Linked");
        list.addLast("List");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
    }

}
