package day9_dsa;

import java.util.Scanner;

public class Stackvalidparanthesis {
        public static void main(String[] args){
        Node obj=new Node();
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        obj.display();
        for(int i=0;i<a.length();i++){
            
            if(a.charAt(i)=='{' || a.charAt(i)=='(' || a.charAt(i)=='[')
            {
                obj.push(a.charAt(i));
            }
            else if((a.charAt(i)=='}' && obj.peek()=='{') || (a.charAt(i)==')' && obj.peek()=='(') || (a.charAt(i)==']' && obj.peek()=='['))
            {
                obj.pop();
            }
            else{
                System.out.println("False");
                break;
            }
        }
        if(obj.isEmpty()){
            System.out.println("True");
        }
        
        }
        
    }
class Node{
        Node next;
        Node pre;
        Node top;
        char data;
        int p1=0,p2=0,p3=0;
        void push(char a)
        {
            Node newnode=new Node();
            if(isEmpty()){
                newnode.data=a;
                top=newnode;
                return;
            }
            newnode.data=a;
            top.pre=newnode;
            newnode.next=top;
            top=newnode;
        }
        char peek()
        {
            return top.data;
        }
        boolean isEmpty(){
            return top==null;
        }

        void display()
        {
            Node temp=top;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        void pop()
        {
            if(isEmpty()){
                System.out.println("Stack is empty");
            }
            top=top.next;
        }
}