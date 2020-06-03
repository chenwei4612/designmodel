package com.atguigu.interpreter;

import java.util.HashMap;

/**
 * @author ChenWei
 * @create 2020-06-02-20:51
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    //求出left 和 right 表达式相减后的结果
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}

