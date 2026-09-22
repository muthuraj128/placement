package day11_dsa;

public class Binaryautomatic {
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
    Node insert(Node node,int data){
        if(node==null){
            return new Node(data);
        }
        if(data<node.data){
            node.l=insert(node.l,data);
        }
        else if(data>node.data){
            node.r=insert(node.r,data);
        }
        return node;
    }
        public static void main(String[] args){
        Binaryautomatic obj=new Binaryautomatic();
        obj.root= obj.insert(obj.root,10);
        obj.root= obj.insert(obj.root,20);
        obj.root= obj.insert(obj.root,30);
        obj.root= obj.insert(obj.root,40);
        obj.root= obj.insert(obj.root,50);
        obj.root= obj.insert(obj.root,60);
        obj.root= obj.insert(obj.root,70);
    }
}
