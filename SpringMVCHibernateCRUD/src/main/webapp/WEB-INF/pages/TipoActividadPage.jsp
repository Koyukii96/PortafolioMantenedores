<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pantalla de Tipo de Actividades</title>
</head>
<body>
	<div align="center">
		<h1>Lista de Tipos de Actividades</h1>

		<table border="1">

			<th>Tipo de Actividad</th>
			<th>Descripcion</th>
			<th>Accion</th>

			<c:forEach var="tipoActividad" items="${listTipoActividad}">
				<tr>
					<td>${tipoActividad.nombreTipo}</td>
					<td>${tipoActividad.descripcion}</td>
					<td><a href="editarTipoActividad?id=${tipoActividad.id}">Editar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="borrarTipoActividad?id=${tipoActividad.id}">Borrar</a></td>
				</tr>
			</c:forEach>
		</table>
		<h4>
			Registrar Un Nuevo Tipo de Actividad <a href="nuevoTipoActividad"> Aqui</a>
		</h4>
	</div>
</body>
</html>