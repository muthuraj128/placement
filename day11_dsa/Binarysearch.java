package day11_dsa;

public class Binarysearch {
    class Node{
        int data;
        Node r;
        Node l;
        Node(int data)
        {
            this.data=data;
            this.r=null;
            this.l=null;
        }
        
    }
    Node root;
    public static void main(String args[]){
        Binarysearch obj=new Binarysearch();
        obj.root =obj.new Node(30);
        obj.root.l =obj.new Node(20);
        obj.root.r =obj.new Node(40);
        obj.root.l.l =obj.new Node(10);
        obj.root.l.r =obj.new Node(25);
        obj.root.r.l =obj.new Node(35);
        obj.root.r.r =obj.new Node(50);

    }
}
