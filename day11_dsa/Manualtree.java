package day11_dsa;

public class Manualtree {
    class Tree{
    Tree r;
    Tree l;
    int data;
        Tree(int data){
            this.data=data;
        }
    }
    Tree root;
    void pre(Tree node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        pre(node.l);
        pre(node.r);
        
    }
    void post(Tree node){
        if(node==null){
            return;
        }
        
        post(node.l);
        post(node.r);
        System.out.print(node.data+" ");
        
    }
    void inorder(Tree node){
        if(node==null){
            return;
        }
        inorder(node.l);
        System.out.print(node.data+" ");
        inorder(node.r);
        
    }
    public static void main(String[] args){
        Manualtree obj=new Manualtree();
        obj.root= obj.new Tree(10);
        obj.root.l= obj.new Tree(20);
        obj.root.r= obj.new Tree(30);
        obj.root.l.l= obj.new Tree(40);
        obj.root.l.r= obj.new Tree(50);
        obj.root.r.l= obj.new Tree(60);
        obj.root.r.r= obj.new Tree(70);
        obj.inorder(obj.root);
        System.out.println();
        obj.post(obj.root);
        System.out.println();
        obj.pre(obj.root);
        System.out.println();
    }
    
}
