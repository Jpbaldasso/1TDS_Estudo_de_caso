<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Cadastro de games</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./resources/css/bootstrap.css">
</head>
<body>
<%@include file="header.jsp" %>
<div class="container">
  <div class="mt-5 ms-5 me-5">
    <div class="card mb-3">
      <div class="card-header">
        CADASTRO DE PRODUTO
      </div>
      <div class="card-body">
        <form action="game" method="post">
          <div class="form-group">
            <label for="id-titulo">Título</label>
            <input type="text" name="titulo" id="id-titulo" class="form-control">
          </div>
          <div class="form-group mt-3">
            <label for="id-estudio">Estúdio</label>
            <input type="text" name="estudio" id="id-estudio" class="form-control">
          </div>
          <div class="form-group mt-3">
            <label for="id-lancamento">Ano de lançamento</label>
            <input type="number" value="2024" name="lancamento" id="id-lancamento" class="form-control">
          </div>
          <div class="form-group mt-3">
            <label for="id-finalizado">Finalizado</label>
            <input type="text" name="finalizado" id="id-finalizado" class="form-control">
          </div>
          <input type="submit" value="Salvar" class="btn btn-primary mt-3">
        </form>
      </div>
    </div>
  </div>
</div>
<%@include file="footer.jsp" %>
<script src="resources/js/bootstrap.bundle.js"></script>
</body>
</html>
