<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css"
	integrity="sha512-Fo3rlrZj/k7ujTnHg4CGR2D7kSs0v4LLanw2qksYuRlEzO+tcaEPQogQ0KaoGN26/zrn20ImR1DfuLWnOo7aBA=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
<link rel="icon" href="/assets/img/favicon.ico" type="image/x-ico" />
<style>
body {
	margin: 0;
	font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto,
		"Helvetica Neue", Arial, "Noto Sans", sans-serif, "Apple Color Emoji",
		"Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";
	font-size: .88rem;
	font-weight: 400;
	line-height: 1.5;
	color: #495057;
	background-color: #eef1f3;
}

.mt-100 {
	margin-top: 80px;
}

.card {
	box-shadow: 0 0.46875rem 2.1875rem rgba(4, 9, 20, 0.03), 0 0.9375rem
		1.40625rem rgba(4, 9, 20, 0.03), 0 0.25rem 0.53125rem
		rgba(4, 9, 20, 0.05), 0 0.125rem 0.1875rem rgba(4, 9, 20, 0.03);
	border-width: 0;
	transition: all .2s;
	margin: auto;
}

.card-header:first-child {
	border-radius: calc(.25rem - 1px) calc(.25rem - 1px) 0 0
}

.card-header {
	display: flex;
	align-items: center;
	border-bottom-width: 1px;
	padding-top: 0;
	padding-bottom: 0;
	padding-right: .625rem;
	height: 3.5rem;
	background-color: #fff;
	border-bottom: 1px solid rgba(26, 54, 126, 0.125);
}

.btn-primary.btn-shadow {
	box-shadow: 0 0.125rem 0.625rem rgba(63, 106, 216, 0.4), 0 0.0625rem
		0.125rem rgba(63, 106, 216, 0.5);
}

.btn.btn-wide {
	padding: .375rem 1.5rem;
	font-size: .8rem;
	line-height: 1.5;
	border-radius: .25rem;
}

.btn-primary {
	color: #fff;
	background-color: #3f6ad8;
	border-color: #3f6ad8;
}

.form-control {
	display: block;
	width: 100%;
	height: calc(2.25rem + 2px);
	padding: .375rem .75rem;
	font-size: 1rem;
	font-weight: 400;
	line-height: 1.5;
	color: #495057;
	background-color: #fff;
	background-clip: padding-box;
	border: 1px solid #ced4da;
	border-radius: .25rem;
	transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
}

.card-body {
	flex: 1 1 auto;
	padding: 1.25rem
}

.flex-truncate {
	min-width: 0 !important
}

.d-block {
	display: block !important
}

a {
	color: #E91E63;
	text-decoration: none !important;
	background-color: transparent
}

.media img {
	width: 40px;
	height: auto
}

#board-title {
	text-align: center;
	height: 100px;
	line-height: 100px;
	padding: 100px 0;
}

#title {
	width: 50px;
	height: 50px;
}

.search-bar {
	margin: auto;
}

* {
	box-sizing: border-box;
}

.container {
	width: 1000px;
}

textarea {
	resize: none;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
	width: 100%;
}

body {
	margin: 0;
	line-height: 1.5;
	color: #495057;
	text-align: left;
	background-color: #eef1f3
}

.profile-box {
	display: flex;
}

.img-profile {
	border-radius: 70%;
	width: 100%;
	height: 100%;
}

.profile-detail {
	text-align: center;
}

.name {
	font-weight: bold;
}

.list li {
	margin-top: 5px;
}

.label {
	font-size: 12px;
}

.profile-detail {
	justify-content: flex-start;
	flex-direction: column;
}

/* 리뷰 css */
body {
	background: #eee
}

.date {
	font-size: 11px
}

.comment-text {
	font-size: 12px
}

.fs-12 {
	font-size: 12px
}

.shadow-none {
	box-shadow: none
}

.name {
	color: #007bff
}

.cursor:hover {
	color: blue
}

.cursor {
	cursor: pointer
}

button:hover {
	background-color: black;
	color: white;
	border: 1px solid black;
	border-radius: 3px;
}

@font-face {
	font-family: 'yg-jalnan';
	src:
		url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_four@1.2/JalnanOTF00.woff')
		format('woff');
	font-weight: normal;
	font-style: normal;
}
</style>
</head>
<body>
	<!-- 헤더 -->
	<jsp:include page="/WEB-INF/views/header.jsp" flush="false" />

	<!-- 타이틀  -->
	<div class="container-fluid mt-100">
		<div id="board-title"
			style="font-family: 'yg-jalnan', verdana, tahoma;">
			<img id="title" src="/assets/img/board.jpg">&ensp;<span>자유
				게시판</span>
		</div>
		<br>

		<!-- 자유게시판 박스 -->
		<div class="card mb-3 col-xl-6 col-md-12">

			<form action="" method="post">
				<div class="container mb-4">
					<div class="row" style="padding-bottom: 5px;">
						<div class="col-sm-12">
							<div class="row profile-detail">
								<div class="col profile-box mt-4 mb-2 ">
									<div class="img-box"
										style="height: 100%; display: inline-block">
										<img id="profile" class="img-profile"
											style="width: 50px; height: 50px;" src="" alt="">
									</div>
									<ul
										class="meta list list-unstyled profile-detail d-flex mb-0 ml-2">
										<li class="name mt-0"
											style="color: black; font-family: 'yg-jalnan', verdana, tahoma;">닉네임</li>
										<li class="label" style="margin: 0; padding: 0">작성일</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<div class="row" style="padding-bottom: 5px;">
						<div class="col-sm-12">
							<input type=text id=input-title name=title style="width: 100%;"
								readonly>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-12">
							<textarea id="contents" name="contents" readonly
								style="min-height: 200px; overflow: hidden"></textarea>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-12" style="text-align: right">
							<c:if test="${loginID==writer}">
								<button type="button"
									style="background-color: background-color: transparent; border: 1px solid black; border-radius: 3px;">수정하기</button>
								<button type="button"
									style="background-color: background-color: transparent; border: 1px solid black; border-radius: 3px;">삭제하기</button>
								<button type="button" class="btn btn-dark"
									style="background-color: background-color: transparent; border: 1px solid black; border-radius: 3px; display: none;">수정완료</button>
								<button type="button" class="btn btn-dark"
									style="background-color:; display: none;">취소</button>
							</c:if>
							<c:if test="${loginID=='admin'}">
								<button type="button"
									style="background-color: background-color: transparent; border: 1px solid black; border-radius: 3px;">삭제하기</button>
							</c:if>
							<button type="button" id="boardList"
								style="background-color: background-color: transparent; border: 1px solid black; border-radius: 3px;">목록으로</button>
						</div>
					</div>
				</div>
			</form>
			<hr>
			<!-- 댓글 보여주기 -->
			<c:if test="">
				<c:forEach var="#" items="">
					<form action="" method="post">
						<div class="container mb-4">
							<div class="row" style="padding-bottom: 5px;">
								<div class="col-sm-12">
									<div class="row profile-detail">
										<div class="col profile-box">
											<div class="img-box"
												style="height: 100%; display: inline-block">
												<img id="profile" class="img-profile"
													style="width: 50px; height: 50px;" src="" alt="">
											</div>
											<ul
												class="meta list list-unstyled profile-detail d-flex mb-0 ml-2">
												<li class="name mt-0"
													style="color: black; font-family: 'yg-jalnan', verdana, tahoma;">닉네임</li>
												<li class="label" style="margin: 0; padding: 0">작성일</li>
											</ul>
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-12">
									<textarea class="contents" name="" readonly
										style="height: auto;">제목</textarea>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-12" style="text-align: right">
									<c:if test="${loginID==writer}">
										<button type="button" class="btn btn-dark"
											style="background-color:;">수정</button>
										<button class="btn btn-dark"
											style="background-color:; display: none;">완료</button>
										<button type="button" class="btn btn-dark"
											style="background-color:; display: none;">취소</button>
										<button type="button" class="btn btn-dark"
											style="background-color:;">삭제</button>
										<input id=hidden-cseq type=hidden value="">
									</c:if>
									<c:if test="${loginID=='admin'}">
										<button type="button" class="btn btn-dark"
											style="background-color:;">삭제</button>
									</c:if>
								</div>
							</div>
						</div>
					</form>
				</c:forEach>
			</c:if>

			<!-- 댓글 작성 칸 -->
			<hr>
			<form action="" method="post">
				<div class="container mb-4">
					<div class="row" style="padding-bottom: 5px;">
						<div class="col-sm-12">
							<div class="row profile-detail">
								<div class="col profile-box mb-2 ">
									<div class="img-box"
										style="height: 100%; display: inline-block">
										<img id="profile" class="img-profile"
											style="width: 50px; height: 50px;" src="" alt="">
									</div>
									<ul
										class="meta list list-unstyled profile-detail d-flex mb-0 ml-2">
										<li class="name mt-0"
											style="color: black; font-family: 'yg-jalnan', verdana, tahoma;">닉네임</li>
										<li class="label" style="margin: 0; padding: 0">작성일</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-12">
							<textarea id="" cols=170 rows=4 name=""></textarea>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-12" style="text-align: right">
							<button type="button" id=""
								style="background-color: background-color: transparent; border: 1px solid black; border-radius: 3px;">등록</button>
						</div>
					</div>
				</div>
			</form>
		</div>
		<br>
	</div>
	<!-- 푸터 -->
	<jsp:include page="/WEB-INF/views/footer.jsp" flush="false" />
	<script type="text/javascript">
		$("#boardList").on("click", function() {
			location.href = "/board/main";
		});
	</script>
</body>
</html>