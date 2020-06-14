
package com.data.structures.stacks;

@SuppressWarnings("unchecked")

public class Stacks<T> {
   public int maxStkSize = 100;
   public int top = -1;
   public Object stk[];
   
   public Stacks(){
       stk = new Object[maxStkSize];
   }
   
   public Stacks(int size){
       if(size > 0){
           maxStkSize = size;
       }
       stk = new Object[maxStkSize];
   }
   
   public boolean isEmpty(){
       return top == -1;
   }
   
   public boolean isFull(){
       return top == maxStkSize-1;
   }
   
   public T pop(){
       if(!isEmpty()){
           T el = (T)stk[top--];
           return el;
       } else {
           return null;
       }
   }
   
   public int push(T el){
       if(!isFull()){
           top = top + 1;
           stk[top] = el;
           return top;
       } else {
           return 999;
       }
   }
   
   public T peek(){
       if(!isEmpty()){
           return (T)stk[top];
       } else {
           return null;
       }
   }

   public int priority(String oprt){
       if(oprt.equals("+") || oprt.equals("-")){
           return 1;
       } else if (oprt.equals("*") || oprt.equals("/")){
           return 2;
       } else if (oprt.equals("^")){
           return 3;
       } else {
           return -9999;
       }
   }

   public int evalExp(int A, String oprt, int B){
        int ans = -999; 
        if(oprt.equals("+")){
            ans = A + B;
       } else if (oprt.equals("-")){
           ans = A - B;
       } else if (oprt.equals("*")){
           ans = A * B;
       } else if (oprt.equals("/")){
           ans = A / B;
       } else if (oprt.equals("^")){
           ans = A ^ B;
       }
       return ans;
   }

   public String infixToPost(String expression){
       expression = expression.replaceAll("\\s", "");
       String[] exp = expression.split("");
       String pre = " ";
       for(int i = 0; i < exp.length; i++){
           int prio = priority(exp[i]);
           if(prio != -9999){
                while(!isEmpty() && priority((String)peek()) >= prio){
                    pre += (String)pop();
                }
                push((T)exp[i]);
           } else {
                pre += exp[i];
           }
       }
       while(!isEmpty()){
           pre += (String)pop();
       }
       return pre;
   }

   public int evalPost(String expression){
        expression = expression.replaceAll("\\s", "");
        String[] exp = expression.split("");
        Stacks<Integer> s = new Stacks<>(20);

        for(int i = 0; i < exp.length; i++){
            if(priority(exp[i]) == -9999){
                s.push((Integer.parseInt(exp[i])));
            } else {
                int B = s.pop();
                int A = s.pop(); 
                s.push(evalExp(A, exp[i], B));
            }
        }
        return s.pop();
   }

   public String infixToPre(String expression){
        expression = expression.replaceAll("\\s", "");
        String[] exp = expression.split("");
        Stacks<String> rev = new Stacks<>(20);
        String pre = " ";
        for(int i = exp.length-1; i >= 0; i--){
            int prio = priority(exp[i]);
            if(prio != -9999){
                while(!isEmpty() && priority((String)peek()) >= prio){
                    rev.push((String)pop());
                }
                push((T)exp[i]);
            } else {
                rev.push(exp[i]);
            }
        }
        while(!isEmpty()){
            rev.push((String)pop());
        }
        while(!rev.isEmpty()){
            pre += (String)rev.pop();
        }
        return pre;
   }

   public int evalPre(String expression){
    expression = expression.replaceAll("\\s", "");
    String[] exp = expression.split("");
    Stacks<Integer> s = new Stacks<>(20);

    for(int i = exp.length-1; i >= 0; i--){
        if(priority(exp[i]) == -9999){
            s.push((Integer.parseInt(exp[i])));
        } else {
            int A = s.pop();
            int B = s.pop(); 
            s.push(evalExp(A, exp[i], B));
        }
    }
    return s.pop();
    }

    public void infixConversion(String exp){
        System.out.println("Infix: " + exp.replaceAll("\\s", ""));
        System.out.println("Postfix: " + infixToPost(exp));
        System.out.println("Evaluation (Postfix): " + evalPost(infixToPost(exp)));
        System.out.println("Prefix: " + infixToPre(exp));
        System.out.println("Evaluation (Prefix): " + evalPre(infixToPre(exp)));
    }

   
}
