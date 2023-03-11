<!DOCTYPE html>
<html>
<head>
<title>NK event</title>
<!-- Bootstrap CSS CDN -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<style type="text/css">
body {
	background: #a0e9ff;
	background: -webkit-linear-gradient(0deg, #a0e9ff 0%, #a8f0ff 50%, #c6f5ff 100%);
	background: linear-gradient(0deg, #a0e9ff 0%, #a8f0ff 50%, #c6f5ff 100%);
}

.container {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

h1 {
	margin-bottom: 50px;
	font-size: 3rem;
	font-weight: bold;
	color: #333333;
}

h2 {
	margin-bottom: 20px;
	font-size: 2rem;
	font-weight: bold;
	color: #333333;
}

.btn {
	margin-top: 20px;
	margin-right: 10px;
	padding: 20px 50px;
	font-size: 2rem;
	font-weight: bold;
	color: #FFFFFF;
	background-color: #007BFF;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	transition: all 0.3s ease-in-out;
	box-shadow: -2px 3px 20.5px -22px #dddddd;
}

.btn:hover {
	background-color: #0062CC;
	transform: translateY(-5px);
}
</style>
</head>
<body>
	<div class="container">
		<h1>NK EVENT</h1>
		<h2>Se connecter en tant que :</h2>
		<div class="row justify-content-center">
			<button class="btn btn-primary" onclick="window.location.href='espace-user.jsp'">Utilisateur</button>
			<button class="btn btn-primary" onclick="window.location.href='organisateur/espace-organisateur.jsp'">Organisateur</button>
		</div>
		
	</div>

	<!-- Bootstrap JS CDN -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
