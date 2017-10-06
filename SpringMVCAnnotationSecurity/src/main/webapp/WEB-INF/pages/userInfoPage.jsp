<%@page session="false"%>
<html>
<head>
<title>${title}</title>
</head>
<body>
    <jsp:include page="_menu.jsp" /> 
    <h1>Usted es el usuario : ${pageContext.request.userPrincipal.name}</h1>
    <h2>Mensaje : </h2>
	<h3></h3><c:out value="mensajewea"/></h3>
	
</body>
</html>