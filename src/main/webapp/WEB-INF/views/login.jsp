<%-- 
    Document   : login
    Created on : 03-abr-2017, 10:09:03
    Author     : bvaldez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Login</title>
    </head>
    <body>
        <div>
            <div>
                <div>
                    <form action="${loginUrl}" method="post">
                        <div>
                            <label>ID</label>
                            <input type="text" id="username" name="ssoId" required>
                        </div>
                        <div>
                            <label>ID+</label>
                            <input type="password" id="password" name="password" required>
                        </div>
                        <div>
                            <input type="hidden" name="${_csrf.parameterName}" 	value="${_csrf.token}" />
                            <div>
                                <button type="submit">Enviar</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div> 
    </body>
</html>
