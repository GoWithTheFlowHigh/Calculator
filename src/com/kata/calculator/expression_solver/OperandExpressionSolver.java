package com.kata.calculator.expression_solver;

import com.kata.calculator.model.Expression;
import com.kata.calculator.model.Operator;

public class OperandExpressionSolver implements ExpressionSolver {

	@Override
	public void solve(Expression expression) {
		Integer res = null;
		int first = expression.getFirst(), second = expression.getSecond();
		Operator operator = expression.getOperator();
		if (operator.equals(Operator.PLUS)) {
			res = (first + second);
		} else if (operator.equals(Operator.MINUS)) {
			res = (first - second);
		} else if (operator.equals(Operator.MULTIPLY)) {
			res = (first * second);
		} else if (operator.equals(Operator.DIVISION)) {
			res = (first / second);
		}
		expression.setResult(res);

	}

}
