package com.javalec.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.javalec.ex.dto.LoginDto;

public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return LoginDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		// TODO Auto-generated method stub
		LoginDto loginDto = (LoginDto) obj;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "id없음");
		System.out.println("id없음");
	}

}
