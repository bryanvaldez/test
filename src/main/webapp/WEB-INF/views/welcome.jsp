<%-- 
    Document   : welcome
    Created on : 06-abr-2017, 11:28:35
    Author     : bvaldez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Welcome page</title>
    </head>
    <body ng-app="app" ng-cloak="">
	Dear <strong>${user}</strong>, Welcome to Home Page.
	<a href="<c:url value="/logout" />">Logout</a>
        <div ng-controller="UserController as ctrl">
            <table>
                <thead>
                    <tr style="text-align: left;">
                        <th>N°</th>                        
                        <th>Departamento</th>
                        <th>Provincia</th>
                        <th>Distrito</th>
                        <th>Nombre Ambito</th> 
                        <th>Informacion</th> 
                    </tr>
                </thead>
                <tbody>
                    <tr ng-repeat="a in ctrl.ambits">
                        <td><span ng-bind="$index + 1"></span></td>
                        <td><span ng-bind="a.DEPARTAMENTO"></span></td>
                        <td><span ng-bind="a.PROVINCIA"></span></td>
                        <td><span ng-bind="a.DISTRITO"></span></td>
                        <td><span ng-bind="a.NOMBREAMBITO"></span></td>
                        <td><span ng-bind="a.INFORMACION"></span></td>
                    </tr>
                </tbody>
            </table>
            <div svg></div>
        </div>
        
      <script src="<c:url value='/static/js/lib/angular.min.js' />"</script>
      <script src="<c:url value='/static/js/lib/angular-route.min.js' />"</script>
      <script src="<c:url value='/static/js/app.js' />"></script>
      <script src="<c:url value='/static/js/service/service_user.js' />"></script>
      <script src="<c:url value='/static/js/controller/controller_user.js' />"></script>
      <script src="<c:url value='/static/js/modules/onpeFeedback.js' />"></script>  
    </body>
</html>
