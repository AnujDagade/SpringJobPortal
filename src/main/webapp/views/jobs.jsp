<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <table class="table">
        <thead>
            <tr>
                <th scope="col">Post ID</th>
                <th scope="col">Job Title</th>
                <th scope="col">Company Name</th>
                <th scope="col">Location</th>
                <th scope="col">Tech Stack</th>
                <th scope="col">Description</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${jobs}" var="jobPost">
                <tr>
                    <th scope="row">${jobPost.postId}</th>
                    <td>${jobPost.jobTitle}</td>
                    <td>${jobPost.companyName}</td>
                    <td>${jobPost.location}</td>
                    <td>${jobPost.techStack}</td>
                    <td>${jobPost.description}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>