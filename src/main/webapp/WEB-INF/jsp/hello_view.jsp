<html>
  <body bgcolor="white">
    <div style="font-size: 150%; color: #850F0F">
      <span>Enter your name: </span><br />
      <form method="post" action="hello">
        Enter coeficients of root:
        <label for="a">a:</label>
        <input type=text size="10" name="a" >*x*x + 
        
        <label for="b">b:</label>
        <input type=text size="10" name="b" >*x + 
        
        <label for="c">c:</label>
        <input type=text size="10" name="c" >
        <input type=submit name="submit" value="Solve">
      </form>
    </div>
    <div>
      <%
          {
            java.lang.String answer = "result " + (java.lang.String)request.getAttribute("result");   
      %>
      <span><%=answer%></span>
      <%
          }
      %>
    </div>
  </body>
</html>
