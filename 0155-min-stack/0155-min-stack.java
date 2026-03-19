class MinStack {
    Stack<Long> st;
    long min;
    public MinStack() {
        st=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push((long)val);
            min=val;
        }else{
            if(val>min) st.push((long)val);
            else{
                st.push((2L*val-min));
                min=val;
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        long ele=st.peek();
        st.pop();
        if(ele<min){
            min=((int)(2L*min) - ele);
        }
    }
    
    public int top() {
        long ele=st.peek();
        if(ele>=min) return (int)ele;
        return (int)min;
    }
    
    public int getMin() {
        return (int)min;
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