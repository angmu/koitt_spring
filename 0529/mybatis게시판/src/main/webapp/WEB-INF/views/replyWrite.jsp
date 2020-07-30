<%-- Created by IntelliJ IDEA. User: msuk Date: 2020-05-02 Time: 오후 3:39 To
change this template use File | Settings | File Templates. --%> <%@ page
contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>답글달기</title>
    <link rel="stylesheet" href="/static/css/style.css" />
    <script src="/static/js/inputCheck.js"></script>
  </head>
  <body>
    <section>
      <h2>답글 작성</h2>
      <form action="comment.io" method="post" id="form">
        <input type="hidden" name="bId" value="${bdto.BId}" />
        <input type="hidden" name="bGroup" value="${bdto.BGroup}" />
        <input type="hidden" name="bStep" value="${bdto.BStep}" />
        <input type="hidden" name="bIndent" value="${bdto.BIndent}" />
        <table>
          <colgroup>
            <col width="15%" />
            <col width="85%" />
          </colgroup>
          <tr>
            <th>작성자</th>
            <td>
              <input type="text" name="bName" id="bName" />
            </td>
          </tr>
          <tr>
            <th>제목</th>
            <td>
              <input
                type="text"
                name="bTitle"
                value="Re:${bdto.BTitle}"
                id="bTitle"
              />
            </td>
          </tr>
          <tr>
            <th>내용</th>
            <td>
              <textarea name="bContent" cols="50" rows="10" id="bContent">


-----------------------------------
[원글]
${bdto.BContent}
              </textarea>
            </td>
          </tr>
        </table>
        <button class="leafBtn" type="button" onclick="inputCheck()">
          작성완료
        </button>
        <button class="leafBtn" type="button" onclick="history.back()">
          취소
        </button>
      </form>
    </section>
  </body>
</html>
