// Swap the values in Pairs

package day8_dsa;

public class Prob3 {
        public static void main(String[] args){
        Ll obj=new Ll();
        obj.addatend(10);
        obj.addatend(20);
        obj.addatend(30);
        obj.addatend(40);
        obj.addatend(50);
        obj.addatend(60);
        obj.check();
        obj.display();

    }
}

class Ll{
    int data;
    int t;
    Ll next;
    Ll head;
    int count=0;
    void addatend(int data){
        Ll nnode=new Ll();
        if(head==null)
        {
            head=nnode;
            head.data=data;
            return;
        }
        Ll temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=nnode;
        temp.next.data=data;
    }
    void display(){
        Ll temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    void check()
    {
        Ll temp=head;
        while(temp!=null){
            if(count%2==0){
                t=temp.data;
                temp.data=temp.next.data;
                temp.next.data=t;
            }
            count+=1;
            temp=temp.next;
        }
        
    }

}

