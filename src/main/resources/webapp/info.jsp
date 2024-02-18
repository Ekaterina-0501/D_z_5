<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="info.css">
</head>
<body>
<div class="regForm">
  <div class="Name">
    <p>Name: <%= request.getParameter("username") %></p>
    </div>
    <div class="Age">
    <p>Age: <%= request.getParameter("userage") %></p>
    </div>
    <div class="Gender">
    <p>Gender: <%= request.getParameter("gender") %></p>
    </div>
    <div class="Country">
    <p>Country: <%= request.getParameter("country") %></p>
    </div>
  <p>Languages:</p>
  <ul>
  <%

    String[] languages = request.getParameterValues("languages");
    for(String language: languages){
        out.println("<li> " +language + "</li> ");
    }
  %>
  </ul>
</div>
</body>
</html>