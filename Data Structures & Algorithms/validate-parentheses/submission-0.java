class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }else{
                char top=st.peek();
                if((ch==')'&&top!='('||ch=='}'&&top!='{'||ch==']'&&top!='[')){
                    return False;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
