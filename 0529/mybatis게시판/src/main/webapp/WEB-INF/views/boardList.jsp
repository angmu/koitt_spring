<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%> <%@ taglib prefix="fmt"
uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>게시글 목록</title>
    <link rel="stylesheet" href="static/css/style.css" />
  </head>
  <body>
    <section>
      <h3>게시글 목록</h3>
      <table class="table">
        <colgroup>
          <col width="10%" />
          <col />
          <col width="20%" />
          <col width="20%" />
          <col width="10%" />
        </colgroup>
        <tr>
          <th>글번호</th>
          <th>제목</th>
          <th>작성자</th>
          <th>작성일</th>
          <th>조회수</th>
        </tr>
        <c:forEach var="board" items="${list}">
          <c:set var="indent" value="${board.BIndent*20}" />
          <tr>
            <td>${board.BId}</td>
            <td>
              <a href="/board/${board.BId}" style="padding-left: ${indent}px">
                <c:if test="${indent != 0}">
                  ┖
                </c:if>
                ${board.BTitle}</a
              >
            </td>
            <td>${board.BName}</td>
            <td>
              <fmt:formatDate
                value="${board.BDate}"
                pattern="yyyy/MM/dd HH:mm:ss"
              />
            </td>
            <td>${board.BHit}</td>
          </tr>
        </c:forEach>
      </table>
      <button class="leafBtn" onclick="location.href='board/post.io'">
        글쓰기
      </button>

      <div class="arrowArea">
        <button onclick="location.href='board.io?page=1'">◀◀</button>
        <c:if test="${page <= 1}">
          <button style="background-color: gray;" disabled>◀</button>
        </c:if>
        <c:if test="${page > 1}">
          <button
            style="opacity: 90%;"
            onclick="location.href='board.io?page=${page -1}'"
          >
            ◀
          </button>
        </c:if>

        <!-- 순차 출력-->

        <c:forEach var="i" items="${pageList}">
          <span class="paging">
            <c:choose>
              <c:when test="${i == page}"
                ><b style="color: crimson;">${i}</b></c:when
              >
              <c:when test="${i != page}"
                ><a href="board.io?page=${i}">${i}</a></c:when
              >
            </c:choose>
          </span>
        </c:forEach>

        <c:if test="${page >= maxPage}">
          <button disabled style="background-color: gray;">▶</button>
        </c:if>
        <c:if test="${page< maxPage}">
          <button
            style="opacity: 90%;"
            onclick="location.href='board.io?page=${page+ 1}'"
          >
            ▶
          </button>
        </c:if>

        <button onclick="location.href='board.io?page=${maxPage}'">
          ▶▶
        </button>
      </div>
    </section>
  </body>
</html>
