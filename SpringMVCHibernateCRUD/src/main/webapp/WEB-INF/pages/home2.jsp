<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pantalla de Ejecutivos</title>
</head>
<body>
	<div align="center">
		<h1>Lista de Ejecutivos</h1>

		<table border="1">

			<th>Nombre</th>
			<th>Apellido</th>
			<th>Fecha Ingreso</th>
			<th>Accion</th>

			<c:forEach var="ejecutivo" items="${listEjecutivo}">
				<tr>

					<td>${ejecutivo.nombre}</td>
					<td>${ejecutivo.apellido}</td>
					<td>${ejecutivo.fechaIngreso}</td>
					<td><a href="editEjecutivo?id=${ejecutivo.id}">Editar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteEjecutivo?id=${ejecutivo.id}">Borrar</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			Registrar Nuevo Ejecutivo <a href="newEjecutivo"> Aqui</a>
		</h4>
	</div>
</body>
</html>