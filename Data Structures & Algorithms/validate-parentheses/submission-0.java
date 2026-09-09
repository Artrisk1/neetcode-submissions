class Solution {
    public boolean isValid(String s) {
        Stack<Character> check=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                check.push(')');
            }
            else if(c=='{'){
                check.push('}');
            }
            else if(c=='['){
                check.push(']');
            }
            else if(check.isEmpty() || check.pop()!=c ){
                return false;
            }
            }
            return check.isEmpty();
        }    }

