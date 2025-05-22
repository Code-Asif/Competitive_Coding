public class LinkedListQuestions {
    public static void main(String[] args) {
        LinkedList l = new LinkedList(10);
        LinkedList l2 = new LinkedList(20);
        LinkedList l3 = new LinkedList(30);
        LinkedList l4 = new LinkedList(40);
        LinkedList l5 = new LinkedList(50);
        LinkedList l6 = new LinkedList(60);
        LinkedList l7 = new LinkedList(70);
        LinkedList l8 = new LinkedList(80);
        LinkedList l9 = new LinkedList(90);
        
        LinkedList head = l;
        head.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = l9;
        l9.next = null;
        LinkedList nn = new LinkedList(88);
        LinkedList nn2 = new LinkedList(30);

        printLL(head);
        insertIntoLL(head, 3, nn);
        printLL(head);
        insertIntoLL(head, 3, nn2);
        printLL(head);

        printLL(reverseLL(head));
    }

    public static void RemoveDups(LinkedList list){
         
    }

    public static void insertIntoLL(LinkedList list, int pos, LinkedList newNode){
        if(pos == 0){
            newNode.next = list;
            list = newNode;
            return;
        }

        LinkedList temp = list;
        int i=0;
        while(i<pos-1 && temp != null){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void deleteFromLL(LinkedList list, int pos){

    }

    public static LinkedList reverseLL(LinkedList list){
        LinkedList cur = list;
        LinkedList prev = null;

        while(cur != null){
            LinkedList temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public static void printLL(LinkedList list){
        System.out.println();
        LinkedList temp = list;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }
}

class LinkedList{
    int value;
    LinkedList next;
    LinkedList(int value){
        this.value = value;
    }
}
