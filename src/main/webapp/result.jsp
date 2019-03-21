<%@ page import="com.kiran.Counter" %>

<%
String message = request.getParameter("numberToCount");
String iAmRossString = request.getParameter("iAmRoss");

int numberToCount = Integer.parseInt(message);
boolean iAmRoss = false;

if(iAmRossString != null){
    iAmRoss = true;
}
%>

<html>
<body>

The message  is <%= Counter.countString(numberToCount,iAmRoss) %>
</body>
</html>
