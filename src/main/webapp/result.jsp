<%@ page import="com.kiran.Counter" %>

<%
String message = request.getParameter("numberToCount");
int numberToCount = (int)message;
%>

<html>
<body>
The message  is <%= Counter.countString(numberToCount) %>
</body>
</html>
