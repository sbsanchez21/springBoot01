<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h1>Datos de la Persona</h1>
        <form action="http://localhost:8080/addPersona" method="POST">
            <p><label>Nombre: </label><input type="text" name="nombre"></p>
            <p><label>Apellido: </label><input type="text" name="apellido"></p>
            <button type="submit">Enviar</button>     
        </form>
        
</body>	
</html>