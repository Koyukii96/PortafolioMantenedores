<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<html>
<head><title>Login</title></head>
<body>
   <jsp:include page="_menu.jsp" />
    
    
   <h1>Login</h1>
     
     <!-- /login?error=true -->
     <c:if test="${param.error == 'true'}">
         <div style="color:red;margin:10px 0px;">
          
                Error de Inicio de Sesion!!!<br />
                Reason :  ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
                 
         </div>
    </c:if>
       
   <h3>Ingrese su Usuario y Contraseña:</h3>  
     
   <form name='f' action="${pageContext.request.contextPath}/j_spring_security_check" method='POST'>
      <table>
         <tr>
            <td>Usuario:</td>
            <td><input type='text' name='username' value=''></td>
         </tr>
         <tr>
            <td>Contraseña:</td>
            <td><input type='password' name='password' /></td>
         </tr>
         <tr>
            <td><input name="submit" type="submit" value="Ingresar" /></td>
         </tr>
      </table>
  </form>
</body>
</html>