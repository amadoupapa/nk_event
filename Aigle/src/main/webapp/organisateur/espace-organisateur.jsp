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
							<h1 class="h3 mb-0 text-gray-800">Evenements publiés</h1>
						</div>
						<!-- ------------DEBUT LISTS EVENTS------------------>
						<div class="row">
							<!-- Earnings (Monthly) Card Example -->
							<div class="col-xl-3 col-md-6 mb-4">

								<div class="card">
									<div class="bg-image hover-overlay ripple"
										data-mdb-ripple-color="light">
										<img
											src="https://cdn.pixabay.com/photo/2015/08/21/18/19/sparerips-899306_960_720.jpg"
											class="img-fluid" /> <a href="#!">
											<div class="mask"
												style="background-color: rgba(251, 251, 251, 0.15);">
											</div>
										</a>
									</div>
									<div class="card-body">
										<h5 class="card-title font-weight-bold">
											<a>Festival du Dibi</a>
										</h5>
										<ul class="list-unstyled list-inline mb-0">

											<li class="list-inline-item">
												<p class="text-muted">Statut : A venir</p>
											</li>
										</ul>
										<p class="mb-2">Description</p>
										<p class="card-text">Some quick example text to build on
											the card title and make up the bulk of the card's content.</p>
										<hr class="my-4" />
										<p class="lead">
											Date et heure : <strong>12/12/2024 23h00</strong>
										</p>
										<a href="detail.jsp?id=1" class="btn btn-success btn-icon-split"> <span
											class="icon text-white-50"> <i class="fas fa-eye"></i>
										</span> <span class="text">Voir details</span>
										</a>
									</div>
								</div>
							</div>
							<!-- Earnings (Monthly) Card Example -->
							<div class="col-xl-3 col-md-6 mb-4">

								<div class="card">
									<div class="bg-image hover-overlay ripple"
										data-mdb-ripple-color="light">
										<img
											src="https://cdn.pixabay.com/photo/2015/08/21/18/19/sparerips-899306_960_720.jpg"
											class="img-fluid" /> <a href="#!">
											<div class="mask"
												style="background-color: rgba(251, 251, 251, 0.15);">
											</div>
										</a>
									</div>
									<div class="card-body">
										<h5 class="card-title font-weight-bold">
											<a>Festival du Dibi</a>
										</h5>
										<ul class="list-unstyled list-inline mb-0">

											<li class="list-inline-item">
												<p class="text-muted">Statut : A venir</p>
											</li>
										</ul>
										<p class="mb-2">Description</p>
										<p class="card-text">Some quick example text to build on
											the card title and make up the bulk of the card's content.</p>
										<hr class="my-4" />
										<p class="lead">
											Date et heure : <strong>12/12/2024 23h00</strong>
										</p>
										<a href="detail.jsp?id=1" class="btn btn-success btn-icon-split"> <span
											class="icon text-white-50"> <i class="fas fa-eye"></i>
										</span> <span class="text">Voir details</span>
										</a>
									</div>
								</div>
							</div>
							<!-- Earnings (Monthly) Card Example -->
							<div class="col-xl-3 col-md-6 mb-4">

								<div class="card">
									<div class="bg-image hover-overlay ripple"
										data-mdb-ripple-color="light">
										<img
											src="https://cdn.pixabay.com/photo/2015/08/21/18/19/sparerips-899306_960_720.jpg"
											class="img-fluid" /> <a href="#!">
											<div class="mask"
												style="background-color: rgba(251, 251, 251, 0.15);">
											</div>
										</a>
									</div>
									<div class="card-body">
										<h5 class="card-title font-weight-bold">
											<a>Festival du Dibi</a>
										</h5>
										<ul class="list-unstyled list-inline mb-0">

											<li class="list-inline-item">
												<p class="text-muted">Statut : A venir</p>
											</li>
										</ul>
										<p class="mb-2">Description</p>
										<p class="card-text">Some quick example text to build on
											the card title and make up the bulk of the card's content.</p>
										<hr class="my-4" />
										<p class="lead">
											Date et heure : <strong>12/12/2024 23h00</strong>
										</p>
										<a href="detail.jsp?id=1" class="btn btn-success btn-icon-split"> <span
											class="icon text-white-50"> <i class="fas fa-eye"></i>
										</span> <span class="text">Voir details</span>
										</a>
									</div>
								</div>
							</div>
							<!-- Earnings (Monthly) Card Example -->
							<div class="col-xl-3 col-md-6 mb-4">

								<div class="card">
									<div class="bg-image hover-overlay ripple"
										data-mdb-ripple-color="light">
										<img
											src="https://cdn.pixabay.com/photo/2015/08/21/18/19/sparerips-899306_960_720.jpg"
											class="img-fluid" /> <a href="#!">
											<div class="mask"
												style="background-color: rgba(251, 251, 251, 0.15);">
											</div>
										</a>
									</div>
									<div class="card-body">
										<h5 class="card-title font-weight-bold">
											<a>Festival du Dibi</a>
										</h5>
										<ul class="list-unstyled list-inline mb-0">

											<li class="list-inline-item">
												<p class="text-muted">Statut : A venir</p>
											</li>
										</ul>
										<p class="mb-2">Description</p>
										<p class="card-text">Some quick example text to build on
											the card title and make up the bulk of the card's content.</p>
										<hr class="my-4" />
										<p class="lead">
											Date et heure : <strong>12/12/2024 23h00</strong>
										</p>
										<a href="#" class="btn btn-success btn-icon-split"> <span
											class="icon text-white-50"> <i class="fas fa-eye"></i>
										</span> <span class="text">Voir details</span>
										</a>
									</div>
								</div>
							</div>
						</div>
						<!-- ------------FIN LISTS EVENTS------------------>
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
								<span aria-hidden="true">×</span>
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