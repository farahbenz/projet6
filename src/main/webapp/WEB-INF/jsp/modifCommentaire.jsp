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
                    <h5 class="card-title text-center">Ajouter un commentaire</h5>


                    <th:form modelAttribute="comment" action="${pageContext.request.contextPath }/commentaire/modifier" class="form-signin"  method="post">


                        <div class="form-label-group">

                            <tr>
                            <td>Commentaire</td>
                            <td>
                            <th:input path="commentaire" />
                            </td>
                                <th:input path="id" type="hidden"/>
                            </tr>


                        </div>

                        <hr>
                        <tr>
                            <td>
                        <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Soumettre ce nouveau commentaire</button>
                        <hr class="my-4">
                            </td>
                        </tr>
                    </th:form>
                </div>
            </div>
        </div>
    </div>
</div>

<%@include file="_footer.jsp" %>

<%@include file="_js.jsp" %>

</body>

