<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <%@include file="_head.jsp" %>

</head>

<body class="inscription-section bg-dark-3-light">

<%@include file="_navbar.jsp" %>

<div class="container">
    <div class="row">
        <div class="col-lg-10 col-xl-9 mx-auto">
            <div class="card card-signin flex-row my-5">

                <div class="card-body">
                    <h5 class="card-title text-center">Ajouter un topo</h5>

                    <th:form modelAttribute="topo" action="/ajoutTopo" class="form-signin"  method="post">


                        <div class="form-label-group">
                            <label>Nom</label>
                            <th:input path="nom" type="text" class="form-control"/>
                        </div>

                        <div class="form-label-group">
                            <label>Region</label>
                            <th:input path="region" type="text" class="form-control"/>
                        </div>

                        <div class="form-label-group">
                            <label>Description</label>
                            <th:input path="description" type="text" class="form-control"/>
                        </div>

                        <hr/>

                        <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Soumettre ce Topo</button>
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

