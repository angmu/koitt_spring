package com.javalec.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.javalec.ex.dto.BoardDto;

public class BoardValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return BoardDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		// TODO Auto-generated method stub

		BoardDto boardDto = (BoardDto) obj;

		if (boardDto.getB_title() == null || boardDto.getB_title().trim().isEmpty()) {
			errors.rejectValue("b_title", "제목공백");
		}

	}

}
