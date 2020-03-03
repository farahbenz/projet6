<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Les amis de l'escalade</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom fonts for this template -->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/grayscale.min.css" rel="stylesheet">

</head>
<body style="background-image: url('img/acceuil.jpg');">

<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">

  <a class="navbar-brand js-scroll-trigger" href="index.jsp">BIENVENUE</a>
  <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
    Menu
    <i class="fas fa-bars"></i>
  </button>

  <div class="button-signup">
    <a class="btn btn-primary" href="inscription/inscription.html" role="button">s'inscrire</a>
  </div>

  <div class="collapse navbar-collapse" id="navbarResponsive">
    <ul class="navbar-nav ml-auto">
      <li class="nav-item">
        <a class="nav-link js-scroll-trigger" href="acceuil.jsp">Acceuil</a>
      </li>
      <li class="nav-item">
        <a class="nav-link js-scroll-trigger" href="siteescalade.jsp">Site d'escalade</a>
      </li>
      <li class="nav-item">
        <a class="nav-link js-scroll-trigger" href="topo.jsp">Topo</a>
      </li>
      <li class="nav-item">
        <a class="nav-link js-scroll-trigger" href="contact.jsp">Contact</a>
      </li>
    </ul>
  </div>

</nav>

<div id="about" class="about-section text-center">


  <div class="row">
    <div class="container">

      <h2 class="text-white mb-4">Qui sommes-nous?</h2>
      <p class="text-black-50">Nous réunissons les passionnés d'escalade de la France entière dans le partage dans cette discipline. Vous recherchez un site de grimpe ? Vous êtes au bon endroit! Vous pouvez aussi partager vos expériences concernant un site ou mettre en ligne les topos que vous possèdez! N'attendez plus! <a href="#inscription">Inscrivez-vous</a>
      </p>

      <form>
        <div class="form-row">
          <div class="col-12 col-md-9 mb-2 mb-md-0">
            <input type="Rechercher" class="form-control form-control-lg" placeholder="Trouver un spot">
          </div>
          <div class="col-12 col-md-3">
            <button type="submit" class="btn btn-block btn-lg btn-primary">Rechercher</button>
          </div>
        </div>
      </form>


    </div>
  </div>
</div>


<!-- Bootstrap core JavaScript -->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Plugin JavaScript -->
<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for this template -->
<script src="js/grayscale.min.js"></script>

</body>

</html>


  