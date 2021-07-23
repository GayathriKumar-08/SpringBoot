<html>
<body>
<h2>Hello World!</h2>
<h3>String functions!!!!</h3>
<%=com.stringfunctions.StringUtils.sampleString("sample","sample1")%><br/>
<%=com.stringfunctions.StringUtils.sampleContains("apple")%> <br/>
<h3>Date functions!!!!</h3>
  <%
   out.print(datefunctions.DateFunctions.todayDate().toString());
  %>
  <br/>
  <%
   out.print(datefunctions.DateFunctions.afterDate());
  %><br/>
  <%
   out.print(datefunctions.DateFunctions.beforeDate());
  %> 
</body>
</html>
