<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>S'inscrire</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
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
        <div class="row">
            <div class="col-md-6 mx-auto">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title text-center">S'inscrire</h5>
                        <form method="POST" action="inscription">
                            <div class="form-group">
                                <label for="nom">Nom :</label>
                                <input type="text" class="form-control" id="nom" name="nom" placeholder="Entrez votre nom" required>
                            </div>
                            <div class="form-group">
                                <label for="prenom">Prénom :</label>
                                <input type="text" class="form-control" id="prenom" name="prenom" placeholder="Entrez votre prénom" required>
                            </div>
                            <div class="form-group">
                                <label for="email">Email :</label>
                                <input type="email" class="form-control" id="email" name="email" placeholder="Entrez votre email" required>
                            </div>
                            <div class="form-group">
                                <label for="motDePasse">Mot de passe :</label>
                                <input type="password" class="form-control" id="motDePasse" name="motDePasse" placeholder="Entrez votre mot de passe" required>
                            </div>
                            <div class="form-group">
                                <label for="profil">Profil :</label>
                                <input type="text" class="form-control" id="profil" name="profil" placeholder="utilisateur" value="utilisateur" readonly required>
                            </div>
                            <div class="form-group">
                                <label for="addresse">Adresse :</label>
                                <input type="text" class="form-control" id="addresse" name="addresse" placeholder="Entrez votre adresse" required>
                            </div>
                            <div class="form-group">
                                <label for="numTelephone">Numéro de téléphone :</label>
                                <input type="text" class="form-control" id="numTelephone" name="numTelephone" placeholder="Entrez votre numéro de téléphone" required>
                            </div>
                            <button type="submit" class="btn btn-primary btn-block">S'inscrire</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
