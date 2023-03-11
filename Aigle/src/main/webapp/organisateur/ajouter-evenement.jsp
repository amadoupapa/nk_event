<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Ajouter un événement</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
 <header>
      <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
          <a class="navbar-brand" href="#">Mon site d'événements</a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
              <li class="nav-item active">
                <a class="nav-link" href="#">Accueil</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Événements</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">À propos</a>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    </header>

<div class="container">
  <div class="row">
    <div class="col-md-6 offset-md-3">
      <div class="card mt-5">
        <div class="card-header bg-dark text-white">
          <h3 class="text-center">Ajouter un événement</h3>
        </div>
        <div class="card-body">
          <form method="post" action="ajouter-evenement">
            <div class="form-group">
              <label for="idEvenement">Identifiant de l'événement</label>
              <input type="number" name="idEvenement" id="idEvenement" class="form-control">
            </div>
            <div class="form-group">
              <label for="nom">Nom de l'événement</label>
              <input type="text" name="nom" id="nom" class="form-control">
            </div>
            <div class="form-group">
              <label for="date">Date de l'événement</label>
              <input type="date" name="date" id="date" class="form-control">
            </div>
            <div class="form-group">
              <label for="heure">Heure de l'événement</label>
              <input type="time" name="heure" id="heure" class="form-control">
            </div>
            <div class="form-group">
              <label for="lieu">Lieu de l'événement</label>
              <input type="text" name="lieu" id="lieu" class="form-control">
            </div>
            <div class="form-group">
              <label for="description">Description de l'événement</label>
              <input type="text" name="description" id="description" class="form-control">
            </div>
            <div class="form-group">
              <label for="estTermine">Est terminé </label>
              <input type="checkbox" name="estTermine" id="estTermine" class="form-check-input" disabled>
            </div>
            
            <div class="form-group">
              <label for="capaciteMax">Capacité maximale(Nombre de places)</label>
              <input type="number" name="capaciteMax" id="capaciteMax" class="form-control">
            </div>
            <div class="form-group">
              <button type="submit" class="btn btn-primary btn-block">Ajouter l'événement</button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>
   
<!-- Footer fictif -->
<footer class="bg-dark text-white p-4">
  <div class="container text-center">
    <p>Copyright © 2023 
      <a href="#">Nom de l'entreprise</a>
    </p>
  </div>
</footer>

<!-- Scripts Bootstrap -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-9Dyr1vzZU6J8RrLrKH+D41B/ax0BzC8Ng+/lNcEFL0+0sGJtvW8ziAyhS1aDfV61" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-bYAPLzxoCnAMe9B44J5fp5+5lDfB5wYPdXdOgYzhYmI0R/aM0ZxPT9VP5q5f5WzH" crossorigin="anonymous"></script>

</body>
</html>