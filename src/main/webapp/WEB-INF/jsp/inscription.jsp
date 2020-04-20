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
        <div class=" col-lg-10 col-xl-9 mx-auto">
            <div class="card card-signin flex-row my-5">

                <div class="card-body">
                    <h5 class="card-title text-center">S'inscrire</h5>
                    <th:form modelAttribute="user" action="/inscription" class="form-signin"  method="post">


                        <div class="form-label-group">
                            <label>Identifiant</label>
                            <th:input path="username" type="text" class="form-control" />
                        </div>

                        <div class="form-label-group">
                            <label>Email</label>
                            <th:input path="email" type="email" class="form-control" />
                        </div>

                        <hr>

                        <div class="form-label-group">
                            <label>Password</label>
                            <th:input path="password" type="password" class="form-control" />
                        </div>

                        <hr>

                        <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">S'enregistrer</button>
                        <a class="d-block text-center mt-2 small" href="/login">Se connecter</a>
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