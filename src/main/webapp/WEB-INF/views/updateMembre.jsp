<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Member</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2 class="mt-5">Update Member</h2>
    <form action="${pageContext.request.contextPath}/members" method="post" class="mt-3">
        <input type="hidden" id="numeroAdhesion" name="numeroAdhesion" value="${member.numeroAdhesion}">
        <div class="form-group">
            <label for="nom">Nom:</label>
            <input type="text" class="form-control" id="nom" name="nom" value="${member.nom}" required>
        </div>
        <div class="form-group">
            <label for="prenom">Prenom:</label>
            <input type="text" class="form-control" id="prenom" name="prenom" value="${member.prenom}" required>
        </div>
        <div class="form-group">
            <label for="pieceIdentification">Piece Identification:</label>
            <input type="text" class="form-control" id="pieceIdentification" name="pieceIdentification" value="${member.pieceIdentification}" required>
        </div>
        <div class="form-group">
            <label for="nationalite">Nationalite:</label>
            <input type="text" class="form-control" id="nationalite" name="nationalite" value="${member.nationalite}" required>
        </div>
        <div class="form-group">
            <label for="dateAdhesion">Date Adhesion:</label>
            <input type="date" class="form-control" id="dateAdhesion" name="dateAdhesion" value="${member.dateAdhesion}" required>
        </div>
        <div class="form-group">
            <label for="dateExpirationLicence">Date Expiration Licence:</label>
            <input type="date" class="form-control" id="dateExpirationLicence" name="dateExpirationLicence" value="${member.dateExpirationLicence}" required>
        </div>
        <button type="submit" class="btn btn-primary">Update Member</button>
    </form>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>