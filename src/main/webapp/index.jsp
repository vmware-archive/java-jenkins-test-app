<%@ page isELIgnored ="false" %>
<html>
<body>
  <h2>Hello from JSP!</h2>
  <p>JRE v<%= System.getProperty("java.version") %></p>
  <p><a href="${pageContext.request.contextPath}/test-servlet">TestServlet</a></p>
</body>
</html>
