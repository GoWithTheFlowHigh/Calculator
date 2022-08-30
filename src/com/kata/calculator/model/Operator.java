package com.kata.calculator.model;

public enum Operator {

	MINUS("-"), PLUS("+"), MULTIPLY("*"), DIVISION("/");

	private final String operator;

	Operator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return operator;
	}

	public static Operator getOperatorByString(String operator) {
		for (Operator o : Operator.values()) {
			if (o.getOperator().equals(operator)) {
				return o;
			}
		}
		return null;
	}

}
