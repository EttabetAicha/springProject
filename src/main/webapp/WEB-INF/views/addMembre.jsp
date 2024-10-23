    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <!DOCTYPE html>
    <html>
    <head>
        <title>Add Member</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
    <div class="container">
        <h2 class="mt-5">Add Member</h2>
        <form:form action="${pageContext.request.contextPath}/members" method="post" modelAttribute="membre" class="mt-3">
            <div class="form-group">
                <label for="nom">Nom:</label>
                <form:input path="nom" type="text" class="form-control" id="nom" required="required"/>
                <form:errors path="nom" cssClass="text-danger"/>
            </div>
            <div class="form-group">
                <label for="prenom">Prenom:</label>
                <form:input path="prenom" type="text" class="form-control" id="prenom" required="required"/>
                <form:errors path="prenom" cssClass="text-danger"/>
            </div>
            <div class="form-group">
                <label for="pieceidentification">Piece Identification:</label>
                <form:input path="pieceidentification" type="text" class="form-control" id="pieceidentification" required="required"/>
                <form:errors path="pieceidentification" cssClass="text-danger"/>
            </div>
            <div class="form-group">
                <label for="nationalite">Nationalite:</label>
                <form:input path="nationalite" type="text" class="form-control" id="nationalite" required="required"/>
                <form:errors path="nationalite" cssClass="text-danger"/>
            </div>
            <div class="form-group">
                <label for="dateadhesion">Date Adhesion:</label>
                    <form:input path="dateadhesion" type="date" class="form-control" id="dateadhesion" required="required"/>
                <form:errors path="dateadhesion" cssClass="text-danger"/>
            </div>
            <div class="form-group">
                <label for="dateexpirationlicence">Date Expiration Licence:</label>
                <form:input path="dateexpirationlicence" type="date" class="form-control" id="dateexpirationlicence" required="required"/>
                <form:errors path="dateexpirationlicence" cssClass="text-danger"/>
            </div>

            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <button type="submit" class="btn btn-primary">Add Member</button>
        </form:form>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
    </html>
