<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>

<%@include file="_head.jsp" %>

</head>

<body class="inscription-section bg-dark-3-light">

<%@include file="_navbar.jsp" %>

<div class="espace row">
    <div class ="container">
        <h2 class="text-black mb-4 text-center">TABLEAU DE BORD</h2>

        <table
                class="table table-striped table-hover table-condensed table-bordered">
            <tr>
                <th>Nom</th>
                <th>Region</th>
                <th>Description</th>
                <th>Date de parution</th>
                <th>Reservation</th>
                <th>Choix</th>
            </tr>

            <c:forEach var="topo" items="${topos}">
                <tr>

                    <td>${topo.nom}</td>
                    <td>${topo.region}</td>
                    <td>${topo.description}</td>
                    <td>${topo.dateParution}</td>
                    <td>
                        <c:choose>
                            <c:when test="${topo.disponibilite == true}">
                                Reservation Demandée
                            </c:when>
                            <c:otherwise>

                                Disponible

                            </c:otherwise>
                        </c:choose>
                    <td>
                    <c:choose>
                        <c:when test="${topo.disponibilite == true}">
                            <a class="btn-primary" href="${pageContext.request.contextPath }/validite/${topo.id}"> rendre indisponible </a>
                        <hr/>
                            <a class="btn-primary" href="${pageContext.request.contextPath }/validiteNul/${topo.id}"> remettre en ligne </a>
                        </c:when>
                        <c:otherwise>

                        Aucune demande

                        </c:otherwise>
                    </c:choose>
                </tr>

            </c:forEach>

        </table>
    </div>
</div>


</div>
</div>

<%@include file="_footer.jsp" %>

<%@include file="_js.jsp" %>

</body>
