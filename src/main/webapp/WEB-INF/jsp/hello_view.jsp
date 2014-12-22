<html>
  <body bgcolor="white">
    <div style="font-size: 150%; color: #850F0F">
      <span>Enter your name: </span><br />
      <form method="post" action="hello">
        Enter coeficients of root:
        <label for="a">a:</label>
        <input type=text size="10" name="a" id="a">*x*x + 
        
        <label for="b">b:</label>
        <input type=text size="10" name="b" id="b">*x + 
        
        <label for="c">c:</label>
        <input type=text size="10" name="c" id="c">
        <input type=submit name="submit" value="Solve">
      </form>
    </div>
    <div>
      <%
          {
            java.lang.String answer = (java.lang.String)request.getAttribute("result"); 
            java.lang.String error = (java.lang.String)request.getAttribute("error");
      %>
      <span><%=answer%></span>
      <div><%=error%></div>
      <%
          }
      %>
    </div>
  </body>
</html>