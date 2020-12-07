package com.kata.foobarquix.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kata.foobarquix.model.Result;

/**
 * Classe FooBarQuixService
 * 
 * @author AAITLAFKIH
 * @version 1.0
 */
@Service
public class FooBarQuixService {
	/**
	 * method convertNumber get int and return String If the number is divisible by
	 * 3 or contains 3, replace 3 by "Foo" if the number is divisible by 5 or
	 * contains 5, replace 5 by "Bar" if the number contains 7, replace 7 by "Quix"
	 * Divisors have high predecence, the content is analyzed in the order of
	 * appearance If no match, return the input number as a string.
	 * 
	 * @param value
	 *            type int
	 */
	public Result convertNumber(int value) {
		final String FOO = "Foo";
		final String BAR = "Bar";
		final String QUIX = "Quix";

		StringBuilder result = new StringBuilder();
		List<Integer> digits = new ArrayList<Integer>();
		int digitValue = value;
		while (digitValue > 0) {
			digits.add(digitValue % 10);
			digitValue /= 10;
		}
		Collections.reverse(digits);
		if (value % 3 == 0)
			result.append(FOO);
		if (value % 5 == 0)
			result.append(BAR);
		// with stream but need amelioration for order of appearance
		/*
		 * digits.stream().filter(digit -> digit == 3).forEach(digit ->
		 * result.append(FOO)); digits.stream().filter(digit -> digit ==
		 * 5).forEach(digit -> result.append(BAR)); digits.stream().filter(digit ->
		 * digit == 7).forEach(digit -> result.append(QUIX));
		 */
		for (int digit : digits) {
			if (digit == 3)
				result.append(FOO);
			else if (digit == 5)
				result.append(BAR);
			else if (digit == 7)
				result.append(QUIX);

		}
		if (result.length() == 0) {
			result.append(value);
		}
		return new Result(result.toString());
	}

}
