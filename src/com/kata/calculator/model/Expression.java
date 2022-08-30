package com.kata.calculator.model;

public class Expression {
	private final Integer first;
	private final Operator operator;
	private final Integer second;
	private Integer result;
	private NumberSystem system = NumberSystem.ARABIC;

	public Expression(Integer first, Operator operator, Integer second) {
		this.first = first;
		this.operator = operator;
		this.second = second;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

	public NumberSystem getSystem() {
		return system;
	}

	public void setSystem(NumberSystem system) {
		this.system = system;
	}

	public Integer getFirst() {
		return first;
	}

	public Operator getOperator() {
		return operator;
	}

	public Integer getSecond() {
		return second;
	}

	@Override
	public String toString() {
		return first + " " + operator.getOperator() + " " + second + " " + " = " + result;
	}

}
