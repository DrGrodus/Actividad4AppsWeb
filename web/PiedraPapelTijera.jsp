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
        <h1>Piedra, papel o tijera</h1>
        <%
            String email = getServletContext().getInitParameter("email");
        %>

        <form method="post" action="play">
            <select name="jugada" size="1">
                <option value="0">Piedra</option>
                <option value="1">Papel</option>
                <option value="2">Tijera</option>
            </select> 
            <input type="submit">
        </form><br>

        <ul>
            <li>0: Piedra</li>
            <li>1: Papel</li>
            <li>2: Tijeras</li>
        </ul><br>
        
        <table border="1">
            <tr>
                <th>        </th>
                <th>Jugador </th>
                <th>Compu   </th>
            </tr>
            
            <tr>
                <td>Jugada</td>
                <td> <% out.println(request.getParameter("jugada"));  %> </td>
                <td> <% out.println(request.getAttribute("compu"));  %> </td>
            </tr>
            
            <tr>
                <td>Ganador de jugada</td>
                <td> <% out.println(request.getAttribute("result")); %> </td>
            </tr>
            
            <tr>
                <td>Jugadas ganadas</td>
                <td><% out.println(request.getAttribute("jugadorPJ")); %></td>
                <td><% out.println(request.getAttribute("compuPJ")); %></td>
            </tr>
            
            <tr>
                <td>Jugadas empatadas</td>
                <td><% out.println(request.getAttribute("empatesJ")); %></td>
            </tr>
            
            <tr>
                <td>Partidas ganadas</td>
                <td><% out.println(request.getAttribute("jugadorPP")); %></td>
                <td><% out.println(request.getAttribute("compuPP")); %></td>
            </tr>
            
            <tr>
                <td>Partidas empatadas</td>
                <td><% out.println(request.getAttribute("empatesP")); %></td>
            </tr>
            
        </table>
            
            <% 
                out.println(request.getAttribute("msg"));
            %>

    </body>
</html>
