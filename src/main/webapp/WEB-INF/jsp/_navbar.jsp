<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">

    <a class="navbar-brand js-scroll-trigger" href="/index">BIENVENUE</a>
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        Menu
        <i class="fas fa-bars"></i>
    </button>

    <div class="btn-group" >
        <button type="button"  class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <c:choose>
                <c:when test="${pageContext.request.userPrincipal.name == null}">
                    Se connecter
                </c:when>
                <c:otherwise>
                    ${pageContext.request.userPrincipal.name}
                </c:otherwise>
            </c:choose>
        </button>
        <div class="dropdown-menu">
            <c:choose>
                <c:when test="${pageContext.request.userPrincipal.name == null}">
                    <li>
                        <a class="dropdown-item" href="/inscription">S'inscrire</a>
                    </li>
                    <li>
                        <a class="dropdown-item" href="/login">Se connecter</a>
                    </li>
                </c:when>
                <c:otherwise>
                    <li>
                        <a class="dropdown-item" href="/dashboard">Tableau de bord</a>
                    </li>
                    <li>
                        <a class="dropdown-item" href="/logout">Logout</a>
                    </li>
                </c:otherwise>
            </c:choose>
        </div>
    </div>


    <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link js-scroll-trigger" href="/acceuil">Acceuil</a>
            </li>
            <li class="nav-item">
                <a class="nav-link js-scroll-trigger"  href="/spots">Spot</a>
            </li>
            <li class="nav-item">
                <a class="nav-link js-scroll-trigger" onclick="alert('Accès réservé aux membres')" href="/topos">Topo</a>
            </li>
            <li class="nav-item">
                <a class="nav-link js-scroll-trigger" href="/contact">Contact</a>
            </li>
        </ul>
    </div>

</nav>