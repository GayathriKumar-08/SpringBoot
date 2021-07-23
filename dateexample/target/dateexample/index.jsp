<html>
<body>
<p id="demo"></p>
<script>
document.getElementById("demo").innerHTML = "Hello this paragraph tag!";
function login()
{
    let unmae=document.getElementById("demo").value;
   let upass=document.getElementById("pass").value;
   alert("successfully logined!!!!");
}
</script>
<h2>Hello World!</h2>
<% 
out.println("Today's date is:" + (new java.util.Date()).toString());
%>

<form>
<table>
<tr>
<td>username:</td>
<td><input type="text" id="user"></td>
</tr>
<tr>
<td>password:</td>
<td><input type="password" id="pass"></td>
</tr>
<tr><input type="button" onclick="login()" value="login"></tr>
</table>
</form>
</body>
</html>
