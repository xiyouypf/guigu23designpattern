package 行为型模式.解释器;

import java.util.HashMap;

/**
 * 抽象运算符解析器,每个运算符号,都之和自己左右两个数字有关系,
 * 但左右两个数字有可能也是解析出来的结果,无论何种类型,都是Expression类的实现类
 */
public class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    //因为SymbolExpression 是让其子类来实现,因此interpreter是一个空实现
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
