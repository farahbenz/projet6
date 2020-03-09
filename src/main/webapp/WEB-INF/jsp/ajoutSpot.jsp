<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>AjoutSpot</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/grayscale.min.css" rel="stylesheet">

</head>

<body class="inscription-section bg-dark-3-light">

<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
    <div class="container">
        <a class="navbar-brand js-scroll-trigger" href="/index">BIENVENUE</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            Menu
            <i class="fas fa-bars"></i>
        </button>


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

<div class="container">
    <div class="row">
        <div class="col-lg-10 col-xl-9 mx-auto">
            <div class="card card-signin flex-row my-5">

                <div class="card-body">
                    <h5 class="card-title text-center">Ajouter un spot</h5>

                    <th:form modelAttribute="spot" action="/ajoutSpot" class="form-signin"  method="post">


                        <div class="form-label-group">
                            <label>Nom</label>
                            <th:input path="nom" type="text" class="form-control"/>
                        </div>

                        <div class="form-label-group">
                            <label>Coordonnée Geograpique</label>
                            <th:input path="coordoneeGeo" type="text" class="form-control"/>
                        </div>

                        <div class="form-label-group">
                            <label>Cotation</label>
                            <th:input path="cotation" type="text" class="form-control"/>
                        </div>

                        <div class="form-label-group">
                            <label>Hauteur</label>
                            <th:input path="hauteur" type="text" class="form-control"/>
                        </div>

                        <div class="form-label-group">
                            <label>Nombre de voies</label>
                            <th:input path="nombreDeVoies" type="text" class="form-control"/>
                        </div>

                        <div class="form-label-group">
                            <label>Orientation</label>
                            <th:input path="orientation" type="text" class="form-control"/>
                        </div>

                        <div class="form-label-group">
                            <label>Secteur</label>
                            <th:input path="secteur" type="text" class="form-control"/>
                        </div>

                        <div class="form-label-group">
                            <label>Type</label>
                            <th:input path="type" type="text" class="form-control"/>
                        </div>

                        <hr>

                        <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Soumettre ce spot</button>
                        <hr class="my-4">

                    </th:form>
                </div>
            </div>
        </div>
    </div>
</div>




<footer class="bg-dark small text-center text-black-50">
    <div class="container">
        Copyright &copy; Les amis de l'escalade 2019
    </div>
</footer>



<!-- Bootstrap core JavaScript -->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Plugin JavaScript -->
<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for this template -->
<script src="js/grayscale.min.js"></script>

</body>

</html>