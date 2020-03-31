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

  <title>Contact</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom fonts for this template -->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/grayscale.min.css" rel="stylesheet">

</head>

<body class="bg-dark-3-light">

 <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
    <div class="container">
      <a class="navbar-brand js-scroll-trigger" href="/index">BIENVENUE</a>
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        Menu
        <i class="fas fa-bars"></i>
      </button>

      <div class="button-signup">
        <a class="btn btn-primary" href="/inscription" role="button">S'inscrire</a>
      </div>

          
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="/acceuil">Acceuil</a>
          </li>
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="/spots">Spot</a>
          </li>
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="/topo">Topo</a>
          </li>
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="/contact">Contact</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <div id="contact" class="contact-section">
    <div class="container">

      <div class="row">

        <div class="col-md-4 mb-3 mb-md-0">
          <div class="card py-4 h-100 bg-secondary">
            <div class="card-body text-center">
              <i class="fas fa-map-marked-alt text-primary mb-2"></i>
              <h4 class="text-uppercase m-0">Addrese</h4>
              <hr class="my-4">
              <div class="small text-black-50">34 rue Jean Jaures, Aubervilliers 93300</div>
            </div>
          </div>
        </div>

        <div class="col-md-4 mb-3 mb-md-0">
          <div class="card py-4 h-100 bg-secondary">
            <div class="card-body text-center">
              <i class="fas fa-envelope text-primary mb-2"></i>
              <h4 class="text-uppercase m-0">Email</h4>
              <hr class="my-4">
              <div class="small text-black-50">
                <a href="#">Contact.amis@free.fr</a>
              </div>
            </div>
          </div>
        </div>

        <div class="col-md-4 mb-3 mb-md-0">
          <div class="card py-4 h-100 bg-secondary">
            <div class="card-body text-center">
              <i class="fas fa-mobile-alt text-primary mb-2"></i>
              <h4 class="text-uppercase m-0">Telephone</h4>
              <hr class="my-4">
              <div class="small text-black-50">06.56.45.34.56</div>
            </div>
          </div>
        </div>

      </div>

  

    </div>

  </div>

  <div class="map-responsive">
    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2622.613437307189!2d2.3864256156746224!3d48.903703805469135!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47e66c3725421db7%3A0xeb2c5cd8883d3989!2s34%20Rue%20Auvry%2C%2093300%20Aubervilliers!5e0!3m2!1sfr!2sfr!4v1575390782620!5m2!1sfr!2sfr" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
  </div>

   <footer class="bg-dark small text-center text-black-50">
    <div class="container">
      Copyright &copy; Les amis de l'escalade 2019
    </div>
  </footer> 


  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js" ></script>
  <script src="node_modules/bootstrap/scss/bootstrap" ></script>


  <!-- Plugin JavaScript -->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for this template -->
  <script src="js/grayscale.min.js"></script>
  </body>
  </html>