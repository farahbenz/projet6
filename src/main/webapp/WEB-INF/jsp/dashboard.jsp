<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>

<%@include file="_head.jsp" %>

</head>

<body class="espaceSection">

<%@include file="_navbar.jsp" %>

<div class="espace row">
    <div class ="container">
        <h2 class="text-black mb-4 text-center">TABLEAU DE BORD</h2>

        <table
                class="table table-striped table-hover table-condensed table-bordered">
            <c:choose>
            <c:when test="${topos.isEmpty()}">
                <mark><B> Aucun Topo enregistré </B></mark>
            </c:when>
            <c:otherwise>
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
                                Reservation en cours
                            </c:when>
                            <c:otherwise>

                                Disponible

                            </c:otherwise>
                        </c:choose>
                    </td>
                    <td>
                    <c:choose>
                        <c:when test="${topo.disponibilite == true}">
                            <a  href="${pageContext.request.contextPath }/reservation/valider/${topo.id}">

                                <c:if test="${topo.echangeEmail == false}">
                                    <input type="button"  value ="Envoyé un email"/>
                                </c:if>
                                <c:if test="${topo.echangeEmail == true}">
                                    <input type="button"  value ="Email envoyé"/>
                                </c:if>
                            </a>
                            <hr/>
                            <a class="btn-primary" href="${pageContext.request.contextPath }/reservation/annuler/${topo.id}"><input type="button" value ="Remettre en ligne"/> </a>
                        </c:when>
                        <c:otherwise>

                        Aucune demande

                        </c:otherwise>
                    </c:choose>
                    </td>
                </tr>

            </c:forEach>

            </c:otherwise>
            </c:choose>

        </table>
    </div>
</div>


</div>
</div>

<%@include file="_footer.jsp" %>

<%@include file="_js.jsp" %>

</body>
