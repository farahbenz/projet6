<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en" >

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Les amis de l'escalade</title>

  <!-- Bootstrap core CSS -->
  <link href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.css/" rel="stylesheet">

  <!-- Custom fonts for this template -->
  <link href="${pageContext.request.contextPath}/vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="${pageContext.request.contextPath}/css/grayscale.css/" rel="stylesheet">

</head>

<body style="background-image: url('img/bg-masthead.jpg');">

  <!-- Header -->
  <header class="masthead">
    <div class="container d-flex h-100 align-items-center">
      <div class="mx-auto text-center">
        <h1 class="mx-auto my-0 text-uppercase">Les amis de l'escalade</h1>
        <h2 class="text-white-50 mx-auto mt-2 mb-5">Vous êtes passionnés ? C'est par ici...</h2>
        <a href="acceuil.jsp" class="btn btn-primary js-scroll-trigger">Entrée</a>
      </div>
    </div>
  </header>



  
  <!-- Footer -->
  <footer class="bg-black small text-center text-white-50">
    <div class="container">
      Copyright &copy; Les amis de l'escalade 2019
    </div>
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="${pageContext.request.contextPath}/vendor/jquery/jquery.js/"></script>
  <script src="${pageContext.request.contextPath}/vendor/bootstrap/js/bootstrap.bundle.min.js/"></script>

  <!-- Plugin JavaScript -->
  <script src="${pageContext.request.contextPath}/vendor/jquery-easing/jquery.easing.js/"></script>

  <!-- Custom scripts for this template -->
  <script src="${pageContext.request.contextPath}/js/grayscale.js/"></script>

</body>

</html>
