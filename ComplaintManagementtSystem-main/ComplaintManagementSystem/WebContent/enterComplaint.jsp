
<!DOCTYPE html>
<html>
<head>
    <title>Enter Complaint</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h2>Enter Complaint</h2>
        <form method="post" action="ComplaintServlet">
            <input type="text" name="title" placeholder="Title" required><br>
            <textarea name="description" placeholder="Description" required></textarea><br>
            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>
