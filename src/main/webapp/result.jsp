<%@ page import="com.kiran.Counter" %>

<%
String message = request.getParameter("numberToCount");
%>

<html>
<body>
The message  is <%= message %>
</body>
</html>
