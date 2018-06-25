<%-- 
    Document   : index
    Created on : Jun 25, 2018, 6:24:20 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello ${requestScope.name}</h1>
        
        <form method="post" action="">
            <input type="text" name="email" placeholder="Subscribe Enter Email"/>
            <button type="submit">Subscribe</button>
        </form>
    </body>
</html>
