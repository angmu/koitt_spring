<%-- Created by IntelliJ IDEA. User: msuk Date: 2020-05-02 Time: 오후 5:28 To
change this template use File | Settings | File Templates. --%> <%@ page
contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%> <%@ taglib prefix="fmt"
uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
  <head>
    <title>글 상세보기</title>
    <link rel="stylesheet" href="/static/css/style.css" />
  </head>
  <body>
    <section>
      <h1>NOTICE</h1>

      <table>
        <colgroup>
          <col width=15%" />
          <col width="30%" />
          <col width="40%" />
          <col width="15%" />
        </colgroup>

        <tr>
          <td
            colspan="4"
            class="btitle"
            style="font-weight: 700; font-size: large;"
          >
            ${bdto.BTitle}
          </td>
        </tr>
        <tr>
          <td>글번호: ${bdto.BId}</td>
          <td style="text-align: center;">글쓴이: ${bdto.BName}</td>
          <td style="font-size: 15px;">
            작성일:
            <fmt:formatDate
              value="${bdto.BDate}"
              pattern="yyyy년MM월dd일 HH시mm분ss초"
            />
          </td>
          <td>조회수: ${bdto.BHit}</td>
        </tr>
        <tr>
          <th colspan="4" style="padding: 0.5px;"></th>
        </tr>
        <tr>
          <td class="article" colspan="4">
            <div class="content">
              <pre
                style="font-size: 15px;"
              ><c:out value="${bdto.BContent}" /></pre>
            </div>
          </td>
        </tr>
      </table>

      <button class="leafBtn" onclick="location.href='/board.io'">목록</button>
      <button class="leafBtn" onclick="location.href='/board/post/${bdto.BId}'">
        수정
      </button>
      <form style="display: inline;" action="${bdto.BId}" method="post">
        <input type="hidden" name="_method" value="delete" />
        <button class="leafBtn">삭제</button>
      </form>
      <button
        class="leafBtn"
        onclick="location.href='comment.io?bid=${bdto.BId}'"
      >
        답글
      </button>
    </section>
  </body>
</html>
