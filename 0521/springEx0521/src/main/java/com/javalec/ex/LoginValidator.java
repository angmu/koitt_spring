package com.javalec.ex;

//springframework 의 것으로
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.javalec.ex.dto.LoginDto;

public class LoginValidator implements Validator {
	// 검색할 객체
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return LoginDto.class.isAssignableFrom(clazz);
	}

	// 검증할 방법 구현 Error 없으면 null
	@Override
	public void validate(Object obj, Errors errors) {
		// TODO Auto-generated method stub
		LoginDto loginDto = (LoginDto) obj;

		if (loginDto.getId() == null || loginDto.getId().trim().isEmpty()) {
			errors.rejectValue("id", "아이디 공백에러");
		}
		// 위를 아래처럼 수정가능
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "아이디공백에러");

////		if (loginDto.getId().length() <= 3) {
//	//		errors.reject("idlength", "3자리 이하");
//		//}
		if (loginDto.getPw() == null || loginDto.getPw().trim().isEmpty()) {
			errors.reject("pw", "패스워드 공백에러");
		}

	}

}
