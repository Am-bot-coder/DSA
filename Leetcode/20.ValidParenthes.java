class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character>stack   = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            Character temp = s.charAt(i);
            if(temp=='('){
                stack.push(temp);
            }
            else if(temp=='['){
                stack.push(temp);
            }
            else if(temp=='{'){
                stack.push(temp);
            }
            else if(temp==')'){
                if(stack.isEmpty() || stack.peek()!='('){
                    return false;
                }
                stack.pop();
            }
            else if(temp==']'){
                if(stack.isEmpty() || stack.peek()!='['){
                    return false;
                }
                stack.pop();
            }
            else if(temp=='}'){
                if(stack.isEmpty() || stack.peek()!='{'){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.size()==0;
    }
}


//Python:
class Solution(object):
    def isValid(self, s):

        if s == "":
            return True

        a = []
        n = len(s)

        for i in range(n):

            if s[i] == '(':
                a.append('(')

            elif s[i] == '[':
                a.append('[')

            elif s[i] == '{':
                a.append('{')

            elif s[i] == ')':
                if not a or a[-1] != '(':
                    return False
                a.pop()

            elif s[i] == ']':
                if not a or a[-1] != '[':
                    return False
                a.pop()

            elif s[i] == '}':
                if not a or a[-1] != '{':
                    return False
                a.pop()

        return len(a) == 0