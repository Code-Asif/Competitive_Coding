class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        next = null;
    }
}
public class ArrayToLL{
    private static Node convertToLL(int [] arr){
        Node head = new Node(arr[0]);
        Node move = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            move.next = temp;
            move = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{12,2,3,4,5};
        Node head = convertToLL(arr);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}