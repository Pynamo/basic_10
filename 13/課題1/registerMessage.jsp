<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.net.URLEncoder" %>

<%
session.setMaxInactiveInterval(180);

String logout = (String)request.getParameter("logout");
String message = null;

if (logout != null && logout.equals("true")) {
    session.invalidate();
    
} else {
    message = (String)request.getParameter("message");
    
    if (message != null) {
        session.setAttribute("message", message);
    } else {
        message = (String)session.getAttribute("message");
    }
}

if (message == null) {
    message = "";
}

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>registerMessage</title>
	</head>
	<body>
		<form method="GET" action="/jsp/registerMessage.jsp">
			<label for="message">一言</label>
			<input type="text" name="message" value="<%= message %>"/>
			<input type="submit" value="申し上げる" />
			<a href="/jsp/registerMessage.jsp?logout=<%= URLEncoder.encode("true", "UTF-8") %>">ひっこめる</a>
		</form>
	</body>
</html>