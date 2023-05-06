Q- Stack implementation from Array.

public class Main
{
	public static void main(String[] args) {
		ImplementedStack st = new ImplementedStack(5);
		st.Push(20);
		st.Push(30);
		st.Push(30);
		st.Push(30);
		st.Push(30);
		st.Push(30);
		System.out.println(st.size());
		st.pop();
		System.out.println(st.isEmpty());
		while(st.size() > 0) System.out.println(st.pop());
		System.out.println(st.pop());
	}
	
	public static class ImplementedStack{
	    int[] arr;
	    int top;
	    ImplementedStack(int cap){
	        this.arr = new int[cap];
	        this.top = -1;
	    }
	    
	    public void Push(int val){
	        if(size() == arr.length){
	            System.out.println("Stack Overflow!");
	            return;
	        }
	        top++;
	        arr[top] = val;
	    }
	    public int pop(){
	        if(!isEmpty()){
	            int val = arr[top];
	            top--;
	            return val;
	        }
	        System.out.println("Stack Underflow!");
	        return -1;
	    }
	    public int peek(){
	        if(!isEmpty()){
	            return arr[top];
	        }
	        return -1;
	    }
	    public int size(){
	        return top + 1;
	    }
	    public boolean isEmpty(){
	        return size() == 0;
	    }
	}
}
