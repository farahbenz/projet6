<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <%@include file="_head.jsp" %>

</head>

<body class="espaceSection">

<%@include file="_navbar.jsp" %>


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
                            <label>Secteur</label>
                            <th:input path="secteur" type="text" class="form-control"/>
                        </div>

                        <div class="form-label-group">
                            <label>Type</label>
                            <th:input path="type" type="text" class="form-control"/>
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

                        <hr>

                        <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Soumettre ce spot</button>
                        <hr class="my-4">

                    </th:form>
                </div>
            </div>
        </div>
    </div>
</div>




<%@include file="_footer.jsp" %>


<%@include file="_js.jsp" %>

</body>

</html>