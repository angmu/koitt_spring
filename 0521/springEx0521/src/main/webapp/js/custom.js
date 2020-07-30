/**
 * 
 */

function check(){
	
	var id_ch=/^[a-zA-Z0-9_]{4,16}$/;
	var pw_ch1=/^(?=.[a-zA-Z])$/;
	var pw_ch2=/^(?=.[0-9])$/;
	
	if(agree.name.value==""){
		alert('이름을 입력하세오');
		agree.name.focus();
		return false;
	}
	if(agree.id.value==""){
		alert('아이디를 입력하세오');
		agree.id.focus();
		return false;
	}
	if(agree.pw1.value==""){
		alert('비밀번호를 입력하세오');
		agree.pw1.focus();
		return false;
	}
	
	if(agree.pw2.value==""){
		alert('비밀번호확인을 입력하세오');
		agree.pw2.focus();
		return false;
	}
	return agree.submit();
}