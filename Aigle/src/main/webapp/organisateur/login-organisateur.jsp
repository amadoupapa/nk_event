<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Se connecter en tant qu'utilisateur</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}
</style>
</head>
<body>
	<div class="container">
		<%-- Récupérer le message d'alerte --%>
		<c:if test="${not empty message}">
			<div class="alert alert-success alert-dismissible fade show"
				role="alert">
				${message}
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
	<%-- Récupérer le message d'alerte de connexion --%>		
		</c:if>
		<% if (request.getParameter("erreur") != null) { %>
    <div class="alert alert-danger" role="alert">
      Votre nom d'utilisateur ou votre mot de passe est incorrect.
    </div>
<% } %>

		<div class="row">
			<div class="col-md-6 mx-auto">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title text-center">Se connecter en tant
							que Organisateur</h5>
						<form method="POST" action="login">
							<div class="form-group">
								<label for="email">Email :</label> <input type="email"
									class="form-control" id="email" name="email"
									placeholder="Entrez votre email" required>
							</div>
							<div class="form-group">
								<label for="password">Mot de passe :</label> <input
									type="password" class="form-control" id="password" name="motDePasse"
									placeholder="Entrez votre mot de passe" required>
							</div>
							<button type="submit" class="btn btn-primary btn-block">Se
								connecter</button>
						</form>
						<div class="text-center mt-3">
							<a href="inscription-user.jsp">Créer un compte</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
