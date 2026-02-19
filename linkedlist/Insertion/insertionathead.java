package Insertion;
class Node{
    int data;
    Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class insertionathead{
    private static Node convertArrtoLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1; i<arr.length  ; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node insertathead(Node head, int data){
        // Node temp = head;
        // Node newNode = new Node(data);
        // newNode.next = temp;
        // head = newNode;
        Node temp = new Node(data,head);
        head = temp;
        return head;
        // while(temp.next!=null){

        // }
    }

    public static Node insertAtTail(Node head,int data){
        Node newnode = new Node(data);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;
        return head; 
    }

    public static Node insertAtKthElement(Node head, int k, int data){
        Node temp = head;
        Node newnode = new Node(data);
        if(head==null){
            return newnode;
        }
        if(k==1){
            newnode.next = head;
            head = newnode;
            return head;
        }
        else{
            int count = 0;
            Node prev = null;
            while(temp.next!=null){
                
                count++;
                if(count==k){
                    prev.next = newnode;
                    newnode.next = temp;
                    return head;
                }
                prev = temp;
                temp = temp.next;
            }
            return head;
        }

    }
    public static void main(String[] args){
        int[] arr = {2,3,4,56,7};
        Node head = convertArrtoLL(arr);
        head = insertathead(head, 100);
        System.out.println(head.data);
        Node temp = head;
        //System.out.println(insertAtTail(head, 200));
        System.out.println(insertAtKthElement(head, 4, 92));
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        
    }
}