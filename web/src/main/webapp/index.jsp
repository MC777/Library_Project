<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>Index</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.0.0-2/css/bootstrap.min.css">
</head>

<body>
<div class="container">
<jsp:include page="/WEB-INF/fragments/header.jspf"/>
    <br><br><br>
    <form>
        <table class="table-sm table thead-dark col-md-12">
            <thead>
            <tr>
                <th>#</th>
                <th>Title</th>
                <th>ISBN</th>
                <th>Author</th>
                <th>Type</th>
                <th>Release</th>
                <th>Pages</th>
                <th>Borrower</th>
                <th></th>
            </tr>
            </thead>

            <tbody>
            <c:forEach var="book" items="${requestScope.books}" varStatus="loop">
                <tr>
                    <th scope="row">${loop.index + 1}</th>
                    <td>${book.title}</td>
                    <td>${book.isbn}</td>
                    <td>${book.authorName}</td>
                    <td>${book.bookType}</td>
                    <td>${book.release}</td>
                    <td>${book.pages}</td>
                    <td>${not empty book.borrowerName ? book.borrowerName : '-'}</td>
                    <td><input class="from-check-input" type="radio" name="bookId" value="${book.id}" checked></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <button type="submit" class="btn btn-outline-success" name="action" value="ADD">ADD</button>
        <button type="submit" class="btn btn-outline-warning" name="action" value="EDIT">EDIT</button>
        <button type="submit" class="btn btn-outline-primary" name="action" value="SHOW">SHOW</button>
        <button type="submit" class="btn btn-outline-danger" name="action" value="DELETE">DELETE</button>
    </form>
</div>
</body>
</html>
