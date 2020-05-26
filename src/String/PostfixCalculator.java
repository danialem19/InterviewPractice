import java.util.Stack;

/**
 * Given a string of postfix mathematical expression return the result
 * "4.5 5.25 +" return 9.75
 * "4.5 5.25 -" return  -0.75
 * "3.5 2 + 4.25 4 * -" return -11.5
 *
 * Convert the given postfix mathematical expression to infix
 * "(3.5 + 2) - (4.25 * 4)" return "3.5 2 + 4.25 4 * -"
 */
public class PostfixCalculator {
    public double calculate(String expression){
        if(expression == null){
            return 0;
        }
        if(expression.isEmpty()){
            return 0;
        }
        String[] exp = expression.split(" ");
        String operator = exp[2];
        Stack<Double> operands = new Stack<>();

        for(int i = 0; i < exp.length;  i++){
            if(!isOperator(exp[i])){
                operands.push(Double.parseDouble(exp[i]));
            } else {
                operands.push(solve(operands.pop(), operands.pop(), exp[i]));
            }
        }
        return operands.pop();
    }

    public boolean isOperator(String operator){
        if (operator.equals("+")) {
            return true;
        }
        if (operator.equals("-")) {
            return true;
        }
        if (operator.equals("*")) {
            return true;
        }
        if (operator.equals("/")) {
            return true;
        }
        return false;
    }

    public double solve(double operand1, double operand2, String operator){
        if (operator.equals("+")) {
            return operand1 + operand2;
        }
        if (operator.equals("-")) {
            return operand2 - operand1;
        }
        if (operator.equals("*")) {
            return operand1 * operand2;
        }
        return operand2 / operand1;
    }

    public String convertIntoInfix (String expression){
        if(expression == null){
            return "";
        }
        if(expression.isEmpty()){
            return "";
        }
        String[] exp = expression.split(" ");
        String operator = exp[2];
        Stack<String> operands = new Stack<>();

        for(int i = 0; i < exp.length;  i++){
            if(!isOperator(exp[i])){
                operands.push(exp[i]);
            } else {
                String operand1 =  operands.pop();
                String operand2 = operands.pop();
                operands.push("("+ operand2 + " " + exp[i] + " " + operand1 +")");
            }
        }
        String infix = operands.pop();
        infix = infix.substring(1, infix.length() - 1);
        return infix;
    }

}
