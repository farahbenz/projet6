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

<div class="button-signup">
    <a class="btn btn-primary" href="/ajoutTopo" role="button"> Ajouter un topo</a>
</div>

<div class="espace row">
    <div class ="container">
        <h2 class="text-black mb-4 text-center">TOPOS</h2>

                <table
                        class="table table-striped table-hover table-condensed table-bordered">
                    <c:choose>
                    <c:when test="${topos == null}">
                        <mark><B> Aucun topo disponible </B></mark>
                    </c:when>
                    <c:otherwise>
                    <tr>
                        <th>Nom</th>
                        <th>Region</th>
                        <th>Description</th>
                        <th>Date de parution</th>
                        <th>Reservation</th>
                    </tr>


                    <c:forEach var="topo" items="${topos}">

                        <tr>

                            <td>${topo.nom}</td>
                            <td>${topo.region}</td>
                            <td>${topo.description}</td>
                            <td>${topo.dateParution}</td>
                            <td><a class="btn-primary" href="${pageContext.request.contextPath }/reservation/${topo.id}">

                        <c:if test="${topo.disponibilite == false}">
                            <input type="button"  value ="Réserver"/>
                        </c:if>
                        <c:if test="${topo.disponibilite == true}">
                            <input type="button"  value ="indisponible"/>
                        </c:if>

                   </a>

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

