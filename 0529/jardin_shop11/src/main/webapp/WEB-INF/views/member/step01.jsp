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
			</div><script type="text/javascript">initSubmenu(2,0);</script>


			<!-- contents -->
			<div id="contents">
				<div id="member">
					<h2><strong>회원가입</strong><span>회원으로 가입하시면 보다 더 다양한 혜택을 누리실 수 있습니다.</span></h2>
					
					<!-- STEP -->
					<div class="stepWrap">
						<div class="step stepon">
							<p class="web">STEP 01</p>
							<p class="txt">실명확인</p>
							<p class="ck"><img src="../images/bg/bg_step.png" alt="현재위치" /></p>
						</div>

						<div class="step">
							<p class="web">STEP 02</p>
							<p class="txt">약관 동의</p>
						</div>

						<div class="step">
							<p class="web">STEP 03</p>
							<p class="txt"><span>회원정보</span> <span>입력</span></p>
						</div>

						<div class="step">
							<p class="web">STEP 04</p>
							<p class="txt"><span>회원가입</span> <span>완료</span></p>
						</div>
					</div>
					<!-- //STEP -->
						

					<div class="alertBox">
						<ul>
							<li>회원님의 실명확인 및 가입 여부를 확인하는 절차입니다.</li>
							<li>회원님의 개인 정보 보호를 위해 실명확인을 실시하고 있습니다.</li>
						</ul>
					</div>


					<!-- Btn Area -->
					<div class="btnAreaCenter">
						<a href="${pageContext.request.contextPath}/member/step02" class="gbtn">휴대폰인증</a></li>
					</div>
					<!-- //Btn Area -->


				</div>
			</div>
			<!-- //contents -->


		</div>
	</div>
	<!-- //container -->
	
<jsp:include page="../common/footer.jsp"/>