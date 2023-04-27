<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.time.ZoneId" %>
<fmt:setLocale value="ja_JP" />

<%!
    private static Map map = new HashMap();

	static {
	    map.put("20190101", "お正月");
	    map.put("20191225", "クリスマス");
	    map.put("20191231", "大晦日");
	}


%>

<%
	String year = (String)request.getParameter("year");
	String month = (String)request.getParameter("month");
	String day = (String)request.getParameter("day");


	LocalDate localDate = null;
	if (year == null || month == null || day == null) {
	    localDate = LocalDate.now();
	    year = String.valueOf(localDate.getYear());
	    month = String.valueOf(localDate.getMonthValue());
	    day = String.valueOf(localDate.getDayOfMonth());
	} else {
	    localDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
	}

	String[] dates = { year, month, day };
	
	session.setAttribute("dates", dates);  
	session.setAttribute("date", Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
	  
	String event = (String)map.get(year + month + day);
	session.setAttribute("event", event);


%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>calender</title>
	</head>
	<body>
	
		<form method="POST" action="/jsp/calender.jsp">
			<ul>
				<li>
					<label>year</label>
					<input type="text" name="year" value="${param['year']}"/>
				</li>
				<li>
					<label>month</label>
					<input type="text" name="month" value="${param['month']}"/>
				</li>
				<li>
					<label>day</label>
					<input type="text" name="day" value="${param['day']}"/>		
				</li>
				<li>
					<input type="submit" value="検索" />
				</li>
				<li>
					<c:out value="${fn:join(dates, '/')}" />
					<fmt:formatDate value="${date}" pattern="E" />
				</li>
				<li>
					<c:out value="${event}" />
				</li>
			</ul>			
		</form>
	</body>
</html>