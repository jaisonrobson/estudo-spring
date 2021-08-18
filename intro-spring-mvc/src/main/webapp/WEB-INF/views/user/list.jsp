<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lista de Usuarios</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js" integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <h1>Lista de Usuários</h1>
    <hr>
    <div>
		<spring:url value="/usuario/cadastro" var="cadastro" />
        <a class="btn btn-default" href="${cadastro}">Novo Usuário</a>
    </div>
    <hr>

	<div class="${message == null ? 'panel-default' : 'panel-success'}">
        <div class="panel-heading">
            <span>${message == null ? '&nbsp;' : message}</span>
        </div>
	</div>
	
    <div class="panel-default">
        <table class="table table-striped table-condensed">
            <thead>
            <tr>
                <th>ID</th>
                <th>NOME</th>
                <th>NASCIMENTO</th>
                <th>GENERO</th>
                <th>AÇÃO</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="usuario" items="${usuarios }">
                <tr>
                    <td>${usuario.id }</td>
                    <td>${usuario.nome }&nbsp;${usuario.sobrenome }</td>
                    <td>
                    	<f:parseDate var="date" value="${usuario.nascimento}" pattern="yyyy-MM-dd" type="date" />
                    	<f:formatDate value="${date}" pattern="dd/MM/yyyy" type="date" />
                    </td>
                    <td>${usuario.sexo.desc }</td>
                    <td>
                    	<spring:url value="/usuario/update/${usuario.id}" var="update" />
                        <a class="btn btn-info" href="${update }" >Editar</a>
                        <spring:url value="/usuario/delete/${usuario.id }" var="delete" />
                        <a class="btn btn-danger" href="${delete }" >Excluir</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <hr>
    <footer class="footer">
        <p>&copy; 2017 DevMedia</p>
    </footer>
</div>
</body>
</html>