class Solution {
    public boolean isValid(String s) {
        char[] lista = s.toCharArray();
        Stack<Character> pilha = new Stack<>();
        HashSet<Character> opens = new HashSet<>(Set.of('(', '{', '['));
        
        for(char c : lista){
            if(opens.contains(c)){
                pilha.push(c);
            }else if(c == ')'){
                if(pilha.isEmpty() || pilha.pop() != '('){
                    return false;
                }
            }else if(c == ']'){
                if(pilha.isEmpty() || pilha.pop() != '['){
                    return false;
                }
            }else if(c == '}'){
                if(pilha.isEmpty() || pilha.pop() != '{'){
                    return false;
                }
            }
        }
        if(pilha.isEmpty()){
            return true;
        }
        return false;

    }
}
