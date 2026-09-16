
package day8_dsa;

public class Prob2 {
        public static void main(String[] args){
        Ll obj=new Ll();
        obj.add1(1);
        obj.add1(8);
        obj.add1(3);
        obj.add2(4);
        obj.add2(3);
        obj.add2(4);
        obj.check();
        obj.display();
    }
    
    
}

class Ll{
    Ll head1;
    Ll head2;
    Ll head3;
    Ll next;
    int data;
    int k;
    void add1(int a){
        Ll nnode=new Ll();
        if(head1==null){
            head1=nnode;
            nnode.data=a;
            this.add3(a);
            return;
        }
        Ll temp=head1;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=nnode;
        temp.next.data=a;
        this.add3(a);
    }
    void add2(int a){
        Ll nnode=new Ll();
        if(head2==null){
            head2=nnode;
            nnode.data=a;
            this.add3(a);
            return;
        }
        Ll temp=head2;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=nnode;
        temp.next.data=a;
        this.add3(a);
    }
    void add3(int a){
        Ll nnode=new Ll();
        if(head3==null){
            head3=nnode;
            nnode.data=a;
            return;
        }
        Ll temp=head3;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=nnode;
        temp.next.data=a;
    }
    void check(){
        Ll temp3=head3;
        while(temp3!=null)
        {    
            Ll temp=head3;
            while(temp!=null){
                if(temp3.data>=temp.data)
                {
                    temp=temp.next;
                    continue;
                }
                else{
                    k=temp3.data;
                    temp3.data=temp.data;
                    temp.data=k;
                }
                temp=temp.next;
            }
            temp3=temp3.next;
        }
    }
    void display()
    {
        Ll temp=head3;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
