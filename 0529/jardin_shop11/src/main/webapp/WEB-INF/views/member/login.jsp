<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../common/link.jsp"/>
<jsp:include page="../common/header.jsp"/>
	<!-- container -->
	<div id="container">

		<div id="location">
			<ol>
				<li><a href="${pageContext.request.contextPath}/home">HOME</a></li>
				<li><a href="${pageContext.request.contextPath}/member/login_view">MEMBERSHIP</a></li>
				<li class="last">로그인</li>
			</ol>
		</div>
		
		<div id="outbox">		
			<div id="left">
				<div id="title2">MEMBERSHIP<span>멤버쉽</span></div>
				<ul>	
					<li><a href="${pageContext.request.contextPath}/member/login_view" id="leftNavi1">로그인</a></li>
					<li><a href="${pageContext.request.contextPath}/member/join_view" id="leftNavi2">회원가입</a></li>
					<li><a href="#" id="leftNavi3">아이디/<span>비밀번호 찾기</span></a></li>
					<li><a href="#" id="leftNavi4">회원약관</a></li>
					<li><a href="#" id="leftNavi5">개인정보<span>취급방침</span></a></li>
					<li class="last"><a href="#" id="leftNavi6">이메일무단<span>수집거부</span></a></li>
				</ul>			
			</div><script type="text/javascript">initSubmenu(1,0);</script>


			<!-- contents -->
			<div id="contents">
				<div id="member">
					<h2><strong>로그인</strong><span>로그인 후 주문하시면 다양한 혜택을 받으실 수 있습니다.</span></h2>
					<h3>회원 로그인</h3>
					<div class="informbox">
						<form class="inform" name="login_form">
							<ul>
								<li><input type="text" id="f_id" name="id" class="loginType tt" onfocus="this.className='mfocus'" onblur="if (this.value.length==0) {this.className='loginType'}else {this.className='mfocusnot'}" style="ime-mode:inactive;" /></li>
								<li><input type="password" id="f_pw" name="pw" class="passType tt" onfocus="this.className='mfocus'" onblur="if (this.value.length==0) {this.className='passType'}else {this.className='mfocusnot'}" style="ime-mode:inactive;" /></li>
							</ul>

							<div class="btn"><a href="javascript:;" class="sbtn" id="loginBtn">로그인</a>
							</div>
							<div><p id="logAlert" style="color: red"></p></div>
							<div class="chk"><input type="checkbox" id="idsave"/><label for="idsave">아이디 저장</label></div>							

							<div class="point">
								<p>아이디와 비밀번호를 잊으셨나요?</p>
								<a href="#" class="nbtn">아이디/비밀번호 찾기</a>
							</div>
						</form>
					</div>
				</div>
			</div>
			<!-- //contents -->
			<script type="text/javascript">
				$(function(){
					$(".tt").keyup(function(){
						$("#logAlert").text('');
					})
				})
			
				$("#loginBtn").click(function(){
					
					if(login_form.id.value==''){
						alert('아이디를 입력하세요');
						login_form.id.focus();
						return false;
					}
					if(login_form.pw.value==''){
						alert('비밀번호를 입력하세요');
						login_form.pw.focus();
						return false;
					}
					var id=$("#f_id").val();
					var pw=$("#f_pw").val();
					 
					$.ajax({
			    		type:'post',
			    		url:"id_check",
			    		data:JSON.stringify({id:id,pw:pw}),//$(#toptable.serialize)
			    		contentType:"application/json; charset=utf-8",
			    		success:function(data){
			    			if(data==1){
			    				location.href="/shop/main";
			    			}else if(data==0){
			    				$("#logAlert").text('id가 존재하지 않습니다.');
			    			}else if(data==-1){
			    				$("#logAlert").text('비밀번호가 일치하지 않습니다.');
			    			}else{
			    				alert("알수 없는 에러발생, 잠시 후 다시 시도하세오");
			    			}
			    		},
			    		error:function(request,status,error){
			    			alert("실패"+error);
			    		}
			    	})
				})
			
			</script>

		</div>
	</div>
	<!-- //container -->
	
<jsp:include page="../common/footer.jsp"/>
