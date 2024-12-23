<%@ page import="com.anuj.jobapp.model.JobPost" %>
<%
    JobPost myJobPost = (JobPost) request.getAttribute("jobPost");
%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<div class="container">
    <h1 class="text-center">Job Added Successfully</h1>
    <div class="card" style="width: 18rem;">
        <div class="card-body">
            <h5 class="card-title">Job Title: <%= myJobPost.getJobTitle() %></h5>
            <h6 class="card-subtitle mb-2 text-muted">Company Name: <%= myJobPost.getCompanyName() %></h6>
            <p class="card-text">Location: <%= myJobPost.getLocation() %></p>
            <p class="card-text">Tech Stack: <%= myJobPost.getTechStack() %></p>
            <p class="card-text">Description: <%= myJobPost.getDescription() %></p>
        </div>
    </div>
</div>
</body>