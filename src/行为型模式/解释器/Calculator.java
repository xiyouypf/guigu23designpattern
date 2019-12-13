package 行为型模式.解释器;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
    //定义表达式
    private Expression expression;
    //构造函数传参,并解析
    public Calculator(String expStr) {  // [a,+,b]
        //安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        char[] charArray=expStr.toCharArray();

        Expression left=null;
        Expression right=null;
        //便利我们的字符数组,即遍历[a,+,b]
        //针对不同的情况,做处理
        for (int i=0;i<charArray.length;i++){
            switch (charArray[i]){
                case '+':
                    left=stack.pop();
                    right=new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left=stack.pop();
                    right=new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    //如果是一个Var 就创建要给VarExpression 对象,并push到stack中
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        //当遍历完整个charArray 数组后,stack就得到最后的Expression
        this.expression=stack.pop();
    }
    public int run(HashMap<String,Integer> var){
        return this.expression.interpreter(var);
    }
}
