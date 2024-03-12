class MinStack {
    Stack<Integer> st = new Stack<>();
     Stack<Integer> temp = new Stack<>();
     int min=0;
    public MinStack() {
        //constructor 
    }
    
    public void push(int val) {
       if(st.size()==0){
            st.push(val);
            min = val;
            temp.push(val);
       }else{
           st.push(val);
           if(temp.peek()<val){
               temp.push(temp.peek());
           }else{
               temp.push(val);
           }
       }
    }
    
    public void pop() {
        st.pop();
        temp.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return temp.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */