<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%-- 	<h1>Bienvenu ${organisateur.getNom()}</h1> --%>
<%-- 	<p>Votre description est : ${organisateur.getDescription()}</p> --%>
<%-- 	${organisateur.getEmail()} ${organisateur.getMotDePasse()} --%>
<%-- 	${organisateur.getAddresse()} ${organisateur.getNumTelephone()} --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Organisateur - Dashboard</title>

<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">

</head>
</head>
<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<jsp:include page="sidebar.jsp" />
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<jsp:include page="topbar.jsp" />
				<!-- End of Topbar -->

				<!-- -----------------Begin Page Content -------------------------->
				<div class="container-fluid">

					<!-- Page Heading -->
					<h1 class="h3 mb-4 text-gray-800">Tableau de bord</h1>

					<div class="container-fluid">

						<!-- Page Heading -->
						<div
							class="d-sm-flex align-items-center justify-content-between mb-4">
							<h1 class="h3 mb-0 text-gray-800">Detail de l'�venement</h1>
						</div>
						<!-- ------------DEBUT DETAIL------------------>
						<div class="row">
							<div class="col-md-4">
								<div class="card">
									<img src="https://picsum.photos/200/300" alt="Image al�atoire"
										class="card-img-top">
								</div>
							</div>
							<div class="col-md-8">
								<div class="card">
									<div class="card-body">
										<h2 class="card-title">
											Nom de l'�v�nement : <span class="text-muted">${nom}</span>
										</h2>
										<p class="card-text">
											Date : <span class="text-muted">${date}</span>
										</p>
										<p class="card-text">
											Heure : <span class="text-muted">${heure}</span>
										</p>
										<p class="card-text">
											Lieu : <span class="text-muted">${lieu}</span>
										</p>
										<p class="card-text">
											Description : <span class="text-muted">${description}</span>
										</p>
										<p class="card-text">
											Statut : <span class="text-muted">${estTermine ? "Termin�" : "En cours"}</span>
										</p>
										<p class="card-text">
											Nombre de places disponibles : <span class="text-muted">${nbPlaceDisponible}</span>
										</p>
										<p class="card-text">
											Capacit� maximale : <span class="text-muted">${capaciteMax}</span>
										</p>
									</div>
								</div>
							</div>
						</div>
						<!-- ------------FIN DETAIL------------------>
						<!-- /.container-fluid -->

					</div>
					<!-- End of Main Content -->

					<!-- Footer -->
					<jsp:include page="footer.jsp" />
					<!-- End of Footer -->

				</div>
				<!-- End of Content Wrapper -->

			</div>
			<!-- End of Page Wrapper -->

			<!-- Scroll to Top Button-->
			<a class="scroll-to-top rounded" href="#page-top"> <i
				class="fas fa-angle-up"></i>
			</a>

			<!-- Logout Modal-->
			<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
				aria-labelledby="exampleModalLabel" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title" id="exampleModalLabel">Voulez-vous
								vraiment vous deconnectez ??</h5>
							<button class="close" type="button" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">�</span>
							</button>
						</div>
						<div class="modal-body"></div>
						<div class="modal-footer">
							<button class="btn btn-secondary" type="button"
								data-dismiss="modal">Annuler</button>
							<a class="btn btn-primary" href="login.html">Deconnexion</a>
						</div>
					</div>
				</div>
			</div>

			<!-- Bootstrap core JavaScript-->
			<script src="vendor/jquery/jquery.min.js"></script>
			<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

			<!-- Core plugin JavaScript-->
			<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

			<!-- Custom scripts for all pages-->
			<script src="js/sb-admin-2.min.js"></script>

			<!-- Page level plugins -->
			<script src="vendor/chart.js/Chart.min.js"></script>

			<!-- Page level custom scripts -->
			<script src="js/demo/chart-area-demo.js"></script>
			<script src="js/demo/chart-pie-demo.js"></script>
</body>
</html>