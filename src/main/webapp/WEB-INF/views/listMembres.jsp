<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>List Members</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>List of Members</h2>

    <!-- Add Member Button -->
    <div class="text-right mb-3">
        <a href="${pageContext.request.contextPath}/members/add" class="btn btn-success">Add Member</a>
    </div>

    <table class="table table-bordered table-striped mt-3">
        <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>Nom</th>
            <th>Prénom</th>
            <th>Piece Identification</th>
            <th>Nationalité</th>
            <th>Date Adhesion</th>
            <th>Date Expiration Licence</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="membre" items="${members}">
            <tr>
                <td>${membre.numeroadhesion}</td>
                <td>${membre.nom}</td>
                <td>${membre.prenom}</td>
                <td>${membre.pieceidentification}</td>
                <td>${membre.nationalite}</td>
                <td>${membre.dateadhesion}</td>
                <td>${membre.dateexpirationlicence}</td>
                <td>
                    <!-- Edit Button -->

                    <!-- Delete Button -->
                    <form action="${pageContext.request.contextPath}/members/delete/${membre.numeroadhesion}"
                          method="post"
                          style="display:inline-block;"
                          onsubmit="return confirm('Are you sure you want to delete this member?');">
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        <button type="submit" class="btn btn-danger btn-sm">Delete</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
