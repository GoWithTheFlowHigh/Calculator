package com.kata.calculator.number_handler;

import com.kata.calculator.exception.NumberSystemException;
import com.kata.calculator.model.Expression;

public interface NumberHandler {
	Integer handleNumber(String number);

	String getNumberInNumberSystem(Integer number) throws NumberSystemException;

	void setNumberSystem(Expression expression);
}
