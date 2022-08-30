package com.kata.calculator.number_handler;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.kata.calculator.exception.NumberSystemException;
import com.kata.calculator.model.Expression;
import com.kata.calculator.model.NumberSystem;

public class RomanNumberHandler implements NumberHandler {
	private final Map<String, Integer> romanNumber;
	private final TreeMap<Integer, String> arabicNumber;
	private final NumberSystem system = NumberSystem.ROMAN;

	public RomanNumberHandler() {
		romanNumber = new HashMap<>();
		arabicNumber = new TreeMap<>();
		initRomanNumber();
		initArabicNumber();
	}

	@Override
	public Integer handleNumber(String number) {
		return romanNumber.getOrDefault(number, null);
	}

	@Override
	public String getNumberInNumberSystem(Integer number) throws NumberSystemException {
		int found = arabicNumber.floorKey(number);
		if (number == found) {
			return arabicNumber.get(number);
		}
		return arabicNumber.get(found) + getNumberInNumberSystem(number - found);
	}

	@Override
	public void setNumberSystem(Expression expression) {
		expression.setSystem(system);

	}

	private void initRomanNumber() {
		romanNumber.put("I", 1);
		romanNumber.put("II", 2);
		romanNumber.put("III", 3);
		romanNumber.put("IV", 4);
		romanNumber.put("V", 5);
		romanNumber.put("VI", 6);
		romanNumber.put("VII", 7);
		romanNumber.put("VIII", 8);
		romanNumber.put("IX", 9);
		romanNumber.put("X", 10);
	}

	private void initArabicNumber() {
		arabicNumber.put(1, "I");
		arabicNumber.put(4, "IV");
		arabicNumber.put(5, "V");
		arabicNumber.put(9, "IX");
		arabicNumber.put(10, "X");
		arabicNumber.put(40, "XL");
		arabicNumber.put(50, "L");
		arabicNumber.put(90, "XC");
		arabicNumber.put(100, "C");
	}
}
