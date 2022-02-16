<%-- 
    Document   : PiedraPapelTijera
    Created on : 15 feb 2022, 22:28:55
    Author     : eber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            String email = getServletContext().getInitParameter("email");
            out.println("<br>try:" + request.getAttribute("result"));
            Object result = request.getAttribute("result");
            String res = result.toString();
        %>

        <form method="post" action="play">
            <select name="jugada" size="1">
                <option value="0">Piedra</option>
                <option value="1">Papel</option>
                <option value="2">Tijera</option>
            </select> 
            <input type="submit">
        </form>

        <table>
            <tr>
                <td> </td>
                <td>Jugador</td>
                <td>Compu</td>
            </tr>
            
            <tr>
                <td>Jugada</td>
                <td> <%  %> </td>
            </tr>
            
            <tr>
                <td>Ganador de partida</td>
                <td> <% out.println(result); %> </td>
            </tr>
        </table>

    </body>
</html>
