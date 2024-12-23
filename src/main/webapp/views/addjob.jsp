<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Job</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1 class="text-center">Add Job</h1>
    <form action="/handleform" method="post">
        <div class="mb-3">
            <label for="postId" class="form-label">Post ID</label>
            <input type="text" class="form-control" id="postId" name="postId" required>
        </div>
        <div class="mb-3">
            <label for="jobTitle" class="form-label">Job Title</label>
            <input type="text" class="form-control" id="jobTitle" name="jobTitle" required>
        </div>
        <div class="mb-3">
            <label for="companyName" class="form-label">Company Name</label>
            <input type="text" class="form-control" id="companyName" name="companyName" required>
        </div>
        <div class="mb-3">
            <label for="location" class="form-label">Location</label>
            <input type="text" class="form-control" id="location" name="location" required>
        </div>
        <div class="mb-3">
            <label for="techStack" class="form-label">Tech Stack</label>
            <select class="form-select" id="techStack" name="techStack" required>
                <option value="Java">Java</option>
                <option value="Python">Python</option>
                <option value="JavaScript">JavaScript</option>
                <option value="C#">C#</option>
                <option value="Ruby">Ruby</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="description" class="form-label">Job Description</label>
            <textarea class="form-control" id="description" name="description" rows="3" required></textarea>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.2/js/bootstrap.min.js"></script>
</body>
</html>