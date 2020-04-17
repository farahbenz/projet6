<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <%@include file="_head.jsp" %>
    <link href="/css/main.css" rel="stylesheet" media="all">

</head>

<body class="inscription-section bg-dark-3-light">

<%@include file="_navbar.jsp" %>


<div class="page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins">
    <div class="wrapper wrapper--w780">
        <div class="card card-3">
            <div class="card-heading"></div>
            <div class="card-body">
                <h2 class="title">Se connecter</h2>
                <th:form method="POST" action="/login">

                    <div class="input-group">
                        <input class="input--style-3" type="text" placeholder="Nom d'utilisateur" name="username"/>
                    </div>

                    <div class="input-group">
                        <input class="input--style-3" type="password" placeholder="Mot de passe" name="password"/>
                    </div>

                    <hr/>

                    <div class="p-t-10">
                        <input class="btn btn-lg btn-primary btn-block text-uppercase" type="submit" value="Se connecter">
                     </div>

                </th:form>
            </div>
        </div>
    </div>
</div>

<%@include file="_footer.jsp" %>

<%@include file="_js.jsp" %>

</body>

</html>
