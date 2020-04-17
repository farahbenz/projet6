<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <%@include file="_head.jsp" %>

</head>

<body class="inscription-section">

<%@include file="_navbar.jsp" %>

<div class="button-signup">
    <a class="btn btn-primary" href="/ajoutSpot" role="button"> Ajouter un spot</a>
</div>


<div class="espace row">
    <div class ="container">
        <h2 class="text-black mb-4 text-center">SPOTS/SITES</h2>

        <table
                class="table table-striped table-hover table-condensed table-bordered">
            <tr>
                <th>Nom</th>
                <th>Région</th>
                <th>Action</th>

            </tr>

            <c:forEach var="spot" items="${spots}">
                <tr>
                    <td>${spot.nom}</td>
                    <td>${spot.secteur}</td>
                    <td><a class="btn btn-primary" href="/afficheSpot/${spot.id}" role="button" >Detail</a></td>

                </tr>

            </c:forEach>

        </table>
    </div>
</div>

<%@include file="_footer.jsp" %>

<%@include file="_js.jsp" %>

</body>

</html>