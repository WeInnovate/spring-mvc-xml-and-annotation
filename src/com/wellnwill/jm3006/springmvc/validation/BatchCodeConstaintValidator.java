package com.wellnwill.jm3006.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BatchCodeConstaintValidator implements ConstraintValidator<BatchCode, String> {

	private String batchCodeReferenceValue;

	@Override
	public void initialize(BatchCode batchCodeAnnotaiton) {
		this.batchCodeReferenceValue = batchCodeAnnotaiton.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result = false;

		if (value != null) {
			result = value.startsWith(batchCodeReferenceValue);
		} else {
			result = true;
		}

		return result;
	}

}
