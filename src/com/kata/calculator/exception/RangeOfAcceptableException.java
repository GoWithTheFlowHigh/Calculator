package com.kata.calculator.exception;

public class RangeOfAcceptableException extends RuntimeException {

	public RangeOfAcceptableException() {
		super("Number doesn't fit range of acceptable: [1; 10]");
	}
}
