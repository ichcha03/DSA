package Deletion;
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

public class deletehead {
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

    public static Node deleteHead(Node head){
        if(head==null){
            return head;
        }
        else{
            head = head.next;
            return head;
        }
    }

    public static int removeTail(Node head){
        Node temp = head;
        while(temp.next.next!= null){
            temp = temp.next;
        }
        temp.next = null;
        return temp.data;
    }

    public static Node removeKthElement(Node head, int k){
        Node temp = head;
        if(head==null){
            return head;
        }
        if(k==1){
            head = head.next;
            return head;
        }
        else{
            int count = 0;
            Node prev = null;
            while(temp!=null){
                count++;
                if(count==k){
                    prev.next = temp.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }

        public static void main(String[] args){
        int[] arr = {2,3,4,56,7};
        Node head = convertArrtoLL(arr);
        Node temp = head;
        //System.out.println("Length of linked list is: " + lengthofLL(head));
        //System.out.println(deleteHead(head).data);
        System.out.println(removeTail(head));
        System.out.println(removeKthElement(head, 8).data);
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}
