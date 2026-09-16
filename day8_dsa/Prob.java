// Given the head of a linked list, remove the nth node from the end of the list and return its head.
// Example 1:
// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]

// Example 2:

// Input: head = [1], n = 1
// Output: []

// Example 3:

// Input: head = [1,2], n = 1
// Output: [1]
 

// Constraints:
// The number of nodes in the list is sz.
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
package day8_dsa;

public class Prob {
        public static void main(String[] args){
        Ll obj=new Ll();
        obj.addatend(10);
        obj.addatend(20);
        obj.addatend(30);
        obj.addatend(40);
        obj.addatend(50);
        obj.addatend(60);
        obj.display();
        obj.remove(2);
    }
    
}

class Ll{
    int data;
    Ll next;
    Ll head;
    int count=1;
    int match=1;
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
    void deleteatbegin()
    {
        head=head.next;
    }
    void remove(int a)
    {

        System.out.println();
        Ll temp=head;
        while(temp.next!=null){
            temp=temp.next;
            count+=1;
        }
        count=count-a;
        if(count==0){
            this.deleteatbegin();
            this.display();
            return;
        }
        temp=head;
        while(match!=count){
            temp=temp.next;
            match+=1;
        }
        temp.next=temp.next.next;
        this.display();
    }
}


