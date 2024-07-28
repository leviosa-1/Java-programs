import java.util.*;
interface Istack {
    void push (int ele);
    void pop ();
    void display();
}
class stack implements Istack{
    private int  st[], tos;
    stack(int size){
        st = new int[size];
        tos=-1;
    }
    public void push(int ele){
        if(tos==st.length-1)
            System.out.println("stack is overflow");
        else{
            tos++;
            st[tos]=ele;
            System.out.println("element pushed");
        }
    }
    public void pop(){
        if(tos==-1){
            System.out.println("Stack is underflow");
        }
        else{
            System.out.println("poped element = "+st[tos]);
            tos--;

        }
    }
    public void display(){
        if(tos==-1){
            System.out.println("Stack is underflow or stack is empty");
        }
        else{
            System.out.println("elements of stack are as follows");
            while( tos!=-1){
                System.out.println(st[tos]);
                tos--;
                
            }
        }
    }
}
public class ex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an stack");
        int size = sc.nextInt();
        stack s1 = new stack (size);
        int n;
        do{
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. display");
            System.out.println("4. exit");
            System.out.println("enter choice");
            n= sc.nextInt();
            switch(n){
                case 1: System.out.println("enter element to push in stack:");
                        int ele = sc.nextInt();
                        s1.push(ele);
                        break;
                case 2: s1.pop();
                        break;
                case 3: s1.display();
                        break;
                        
            }
        }
        while(n!=4);


    }
}
