<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Agregar/Editar Contactos</title>
</head>
<body>
	<div align="center">
		<h1>Nuevo/Editar Ejecutivo</h1>
		<form:form action="saveEjecutivo" method="post"
			modelAttribute="ejecutivo">
			<table>
				<form:hidden path="id" />
				<tr>
					<td>Nombre:</td>
					<td><form:input path="nombre" /></td>
				</tr>
				<tr>
					<td>Apellido:</td>
					<td><form:input path="apellido" /></td>
				</tr>
				<tr>
					<td>Fecha Ingreso:</td>
					<td><form:input path="fechaIngreso" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>