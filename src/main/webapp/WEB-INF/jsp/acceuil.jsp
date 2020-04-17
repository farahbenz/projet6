
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<!DOCTYPE html>
<html lang="en">

<head>

  <%@include file="_head.jsp" %>

</head>
<body style="background-image: url('img/acceuil.jpg');">

  <%@include file="_navbar.jsp" %>

<div id="about" class="about-section text-center">


  <div class="row">
    <div class="container">

      <h2 class="text-white mb-4">Qui sommes-nous?</h2>
      <p class="text-black-90 mb-2">Nous réunissons les passionnés d'escalade de la France entière dans le partage dans cette discipline.
          Vous recherchez un site de grimpe ? Vous êtes au bon endroit!
          Vous pouvez aussi partager vos expériences concernant un site ou mettre en ligne les topos que vous possèdez! N'attendez plus!
        <hr/>
        <a class = "btn-primary text-white-90" href="/inscription">Inscrivez-vous</a>
      </p>

      <form action="/search" method="get">
        <div class="form-row text-center">
         
            <input type="text" name="nom" class="form-control form-control-lg" placeholder="Entrer un lieux">
            <input type="text" name="type" class="form-control form-control-lg" placeholder="Entrer un type (Falaise...)">
           <hr>
            <button class="btn btn-primary container" value="Search" role="button" >Trouver un spot</button>
          </div>
      </form>

    </div>
  </div>
</div>

<%@include file="_js.jsp" %>

</body>

</html>


  