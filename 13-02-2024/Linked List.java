import java.util.Scanner;

public class MyClass {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head = null;

    public static boolean find(Node head, int ele) {
        if (head == null)
            return false;
        if (head.data == ele)
            return true;
        else {
            return find(head.next, ele);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l = new LinkedList();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            head = l.insert(sc.nextInt(), head);
        System.out.println("enter element");
        int ele = sc.nextInt();
        System.out.println(find(head, ele));
        while (true) {
            System.out.println("Select \n 1.Insertion\n 2.Deletion\n 3.Searching\n"
                    + " 4.Display\n 5.Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("select\n  1.Insert at first\n  2.Insert at end\n  3.Insert at middle");
                    int i = sc.nextInt();
                    System.out.println("Enter element to be inserted");
                    int ele1 = sc.nextInt();
                    if (i == 1) {
                        head = insertBegin(head, ele1);
                        display();
                    } else if (i == 2) {
                        head = insertLast(head, ele1);
                        display();
                    } else {
                        System.out.println("enter position");
                        int p = sc.nextInt();
                        head = insertMiddle(head, ele1, p);
                        display();
                    }
                    break;
                case 2:
                    System.out.println("select\n  1.Delete first\n  2.Delete end\n  3.Delete middle");
                    int i1 = sc.nextInt();
                    if (i1 == 1) {
                        head = deleteBegin(head);
                        System.out.println("---deleted---");
                        display();
                    } else if (i1 == 2) {
                        head = deleteLast(head);
                        System.out.println("---deleted---");
                        display();
                    } else {
                        System.out.println("enter position");
                        int p1 = sc.nextInt();
                        head = deleteMiddle(head, p1);
                        System.out.println("---deleted---");
                        display();
                    }
                    break;
                case 3:
                    System.out.println("enter element");
                    int k = sc.nextInt();
                    if (search(head, k))
                        System.out.println("element found");
                    else
                        System.out.println("element not found!!!");
                case 4:
                    display();
                    break;
                case 5:
                    System.exit(1);
            }

        }
    }

    private static boolean search(Node head, int k) {
        Node temp = head;
        while (temp.data != k && temp != null) {
            temp = temp.next;
        }
        if (temp == null)
            return false;
        else
            return true;
    }

    private static Node deleteMiddle(Node head, int p) {
        Node temp = head;
        for (int i = 1; i < p - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    private static Node deleteLast(Node head) {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node deleteBegin(Node head) {
        head = head.next;
        return head;
    }

    private static Node insertMiddle(Node head2, int ele, int p) {
        Node temp = new Node(ele);
        Node t = head;
        if (head == null) {
            head = temp;
        } else {
            for (int i = 1; i < p - 1; i++) {
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
        }
        return head;
    }

    private static Node insertLast(Node head, int ele) {
        Node temp = new Node(ele);
        Node p = head;
        if (head == null)
            head = temp;
        else {
            while (p.next != null) {
                p = p.next;
            }
            p.next = temp;
        }
        return head;
    }

    private static Node insertBegin(Node head, int ele) {
        Node temp = new Node(ele);
        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        return head;
    }

    private static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private Node insert(int n, Node head) {
        Node temp = new Node(n);
        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        return head;
    }
}
