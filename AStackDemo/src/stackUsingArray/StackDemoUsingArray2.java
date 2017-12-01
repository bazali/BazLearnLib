package stackUsingArray;

public class StackDemoUsingArray2{
    public static final int maxSize=3;
	   private Object[] stackArray=new Object[maxSize];
	   public int size=0;
	   
	   
	   //pushing operation
	   public Boolean push(Object j) {
		   if(size<maxSize) {		   
			   stackArray[size] = j;
			   size++;
			   return true;
		   }
		   else
			   return false;
	   }
	   
	   //pop operation
	   public Object pop() {
		   if(size==0)
			   return null;
		   else
			   size--;
			   return stackArray[size];
		   		
	   }
	   
	 /*  
	   public boolean isEmpty() {
	      return (size == 0);
	   }
	   public boolean isFull() {
	      return (size == maxSize - 1);
	   }
	   
	  
	   
	   public void EvenOdd()
	   {
		   int i=pop();
		   
		   if(i % 2==0)
			   System.out.println("The value:"+i+" is Even");
		   else
			   System.out.println("The value:"+i+" is odd");
	   }
	   */
	   
	   
	   public static void main(String[] args) {
		  StackDemoUsingArray2 theStack = new StackDemoUsingArray2(); 

		  //	      theStack.push(40);
//	      theStack.push(5);
	      
	      System.out.println(theStack.push(1));
	      System.out.println(theStack.push(2));
	      System.out.println(theStack.push(3));
	      System.out.println(theStack.push(3));
	      
	      
	      System.out.println(theStack.pop());
	      System.out.println(theStack.pop());
	      System.out.println(theStack.pop());
	      System.out.println(theStack.pop());
	      System.out.println(theStack.pop());
	      
	     /* 
	      theStack.EvenOdd();
	      theStack.EvenOdd();
	      theStack.EvenOdd();
	      */

	   }
	}