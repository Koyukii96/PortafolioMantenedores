<%@page session="false"%>
<html>
<head>
<title>${title}</title>
</head>
<body>
    <jsp:include page="_menu.jsp" /> 
    <h1>Usted es el usuario : ${pageContext.request.userPrincipal.name}</h1>
    <h2>Mensaje : ${message}</h2>
	
</body>
</html>