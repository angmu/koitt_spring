package com.javalec.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.javalec.ex.Dto.StudentDto;

public class StuValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return StudentDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		// TODO Auto-generated method stub
		StudentDto studentDto = (StudentDto) obj;

		if (studentDto.getStu_num() == null || studentDto.getStu_num().trim().isEmpty()) {
			errors.rejectValue("stu_num", "stunum공백");
		}

	}

}
