<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <%@include file="_head.jsp" %>

</head>

<body class="espaceSection" >

<%@include file="_navbar.jsp" %>

<div class="button-signup">
    <a class="btn btn-primary" href="/spots" role="button">Retour aux spots</a>
</div>


<div class="espace row">
    <div class ="container">
        <h2 class="text-black mb-4 text-center">SPOT ${spot.nom}</h2>

        <table
                class="table table-striped table-hover table-condensed table-bordered">


            <tr>
                <th>Nom</th>
                <th>Secteur</th>
                <th>Type</th>
                <th>Hauteur</th>
                <th>Orientation</th>
                <th>Nombre de voies</th>
                <th>Coordonnées geographique</th>
                <th>Cotation</th>
                <th>TAG</th>
                <th>Modifier tag</th>

            </tr>


            <tr>

                <td>${spot.nom}</td>
                <td>${spot.secteur}</td>
                <td>${spot.type}</td>
                <td>${spot.hauteur}</td>
                <td>${spot.orientation}</td>
                <td>${spot.nombreDeVoies}</td>
                <td>${spot.coordoneeGeo}</td>
                <td>${spot.cotation}</td>
                <td><c:choose>
                        <c:when test="${spot.tag == true}">
                            oui
                        </c:when>
                        <c:otherwise>
                            non
                        </c:otherwise>
                    </c:choose></td>

                <td><a class="btn-primary" href="${pageContext.request.contextPath }/tag/${spot.id}">Modifer</a></td>
            </tr>

        </table>


                <h2 class="text-black mb-4 text-center">Commentaire</h2>

                <table
                        class="table table-striped table-hover table-condensed table-bordered">
                    <c:choose>
                    <c:when test="${comments.isEmpty()}">
                        <mark><B> Aucun commentaire enregistré </B></mark>
                    </c:when>
                    <c:otherwise>
                    <tr>
                        <th>Auteur</th>
                        <th>Commentaire</th>
                        <th>Date</th>
                        <th>Modifier</th>
                        <th>Supprimer</th>
                    </tr>


                    <c:forEach var="com" items="${comments}">

                    <tr>

                        <td>${com.auteur}</td>
                        <td>${com.commentaire}</td>
                        <td>${com.dateParution}</td>
                        <td><a class="btn-primary" href="${pageContext.request.contextPath }/modifCommentaire/${com.id}">Modifier</a></td>
                        <td>
                            <a class="btn-primary" href="${pageContext.request.contextPath }/delete/${com.id}" onclick="return confirm('Êtes vous sur de vouloir supprimer ce commentaire?')">Delete</a>
                        </td>
                         </tr>

                    </c:forEach>
                    </c:otherwise>
                    </c:choose>

                </table>


    </div>
</div>

        <div class="espace row">
            <div class ="container">

                <h2 class="card-title text-center">Ajouter un commentaire</h2>


                <th:form modelAttribute="comment" action="/afficheSpot" class="form-signin"  method="post">


                    <div class="form-label-group">
                        <label>Commentaire</label>
                        <th:input path="commentaire" type="text" class="form-control"/>
                    </div>

                    <th:input path="spot" type="hidden" value="${spot.id}"/>

                    <hr>

                    <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Soumettre ce commentaire</button>
                    <hr class="my-4">

                </th:form>
            </div>
        </div>



<%@include file="_footer.jsp" %>
<%@include file="_js.jsp" %>

</body>
</html>