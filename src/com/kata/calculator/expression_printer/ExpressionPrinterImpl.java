package com.kata.calculator.expression_printer;

import com.kata.calculator.exception.ResultException;
import com.kata.calculator.model.Expression;
import com.kata.calculator.model.NumberSystem;
import com.kata.calculator.number_handler.NumberHandler;

public class ExpressionPrinterImpl implements ExpressionPrinter {
	private final NumberHandler handler;

	public ExpressionPrinterImpl(NumberHandler handler) {
		this.handler = handler;
	}

	@Override
	public void print(Expression expression) {
		if (isValidResult(expression)) {
			if (expression.getSystem().equals(NumberSystem.ARABIC)) {
				System.out.println(expression);
			} else if (expression.getSystem().equals(NumberSystem.ROMAN)) {
				System.out.println(handler.getNumberInNumberSystem(expression.getFirst()) + " "
						+ expression.getOperator().getOperator() + " "
						+ handler.getNumberInNumberSystem(expression.getSecond()) + " = "
						+ handler.getNumberInNumberSystem(expression.getResult()));
			}
		} else {
			throw new ResultException("Incorrect result");
		}
	}

	private boolean isValidResult(Expression expression) {
		if (expression.getResult() != null) {
			if (expression.getSystem().equals(NumberSystem.ROMAN)) {
				return expression.getResult() > 0;
			} else
				return true;
		} else
			return false;
	}

}
