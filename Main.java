import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	   Stack <Integer> s=new Stack<Integer>(); 
           s.push(30);                           
           s.push(9);
           s.push(2000);
           s.push(8);
           s.push(10);
           s.push(2006);
           System.out.println(s);
           System.out.println(s.peek());
           s.pop();
           System.out.println(s.peek());
           s.pop();
           System.out.println(s);
	}   
}
