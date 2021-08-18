<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cadastro de Usuário</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js" integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <h1>Cadastro de Usuários</h1>
    <hr>
    <div>

		<spring:url value="/usuario/todos" var="home" />
		<a class="btn btn-default" href="${home}">Home</a>
    </div>
    <hr>
    <div>
    	<spring:url value="${ usuario.id == null ? '/usuario/save' : '/usuario/update'}" var="save" />
        <form:form modelAttribute="usuario" action="${save}" method="post">
        	<form:hidden path="id" />
            <div class="form-group">
                <label for="nome">Nome: </label>
                <form:input path="nome" class="form-control"/>
                <form:errors path="nome" cssClass="label label-danger" />
            </div>
            <div class="form-group">
                <label for="sobrenome">Sobrenome: </label>
                <form:input path="sobrenome"  class="form-control"/>
                <form:errors path="sobrenome" cssClass="label label-danger" />              
            </div>
            <div class="form-group">
                <label for="nascimento">Nascimento: </label>
                <form:input path="nascimento"  class="form-control" type="date"/>
                <form:errors path="nascimento" cssClass="label label-danger" />
            </div>
            <div class="form-group">
                <label for="sexo">Genero: </label>
                <form:select path="sexo" class="form-control">
                	<form:options items="${sexos }" itemLabel="desc" />
                </form:select>              
            </div>
             
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Confirmar</button>
            </div>
        </form:form>
    </div>
    <hr>
    <footer class="footer">
        <p>&copy; 2017 DevMedia</p> 
    </footer>
</div>
</body>
</html>