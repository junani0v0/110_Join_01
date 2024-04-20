<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>CodePen - Flat HTML5/CSS3 Login Form</title>
  <link rel="stylesheet" href="/110_Join_01/resources/css/style.css">

</head>
<body>
<!-- partial:index.partial.html -->
<div class="login-page">
  <div class="form">
    <form class="register-form" action = "/110_Join_01/join.do">
      <input type="text" placeholder="name" name="userId"/>
      <input type="password" placeholder="password" name="passwd"/>
      <input type="text" placeholder="email address" name ="email"/>
      <button onClick = "submit();">create</button>
      <p class="message">Already registered? <a href="#">Sign In</a></p>
    </form>
    <form class="login-form">
      <input type="text" placeholder="username"/>
      <input type="password" placeholder="password"/>
      <button>login</button>
      <p class="message">Not registered? <a href="#">Create an account</a></p>
    </form>
  </div>
</div>
<!-- partial -->
<script src='//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script  src="/110_Join_01/resources/js/script.js"></script>
<script type="text/javascript" charset="utf-8">
window.onload = function(){
	var result = '${result}';
	var msg = '${msg}';
	if(result != ''){
		alert(msg);
		window.location.href = '/110_Join_01/loginPage.do';
	}
}
</script>

</body>
</html>