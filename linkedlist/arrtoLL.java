class Node{
    int data;
    Node next; 

    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class arrtoLL {
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

    public static int lengthofLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,56,7};
        Node head = convertArrtoLL(arr);
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("Length of linked list is: " + lengthofLL(head));
    }
}
