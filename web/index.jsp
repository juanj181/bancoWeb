<%-- 
    Document   : index
    Created on : 16-oct-2013, 19:44:54
    Author     : Juanjo
--%>

<%@page import="java.util.List"%>
<%@page import="fpmislata.com.bancoWeb.EntidadBancaria"%>
<%@page import="fpmislata.com.bancoWeb.EntidadBancariaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAO();
    String nombre=request.getParameter("nombre");

    String mSQL="select * from EntidadBancaria where IdEntidadBancaria='" + nombre +"';" ;
    List<EntidadBancaria> entidadesBancarias = EntidadBancariaDAO.findAll(mSQL);



%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><a href="localhost:8084/bancoWeb/formJsp.jsp">Buscar por nombre</a></h1>
        
        <table border="solid">
            <% for (EntidadBancaria entidadBancaria : entidadesBancarias) {%>
            <tr><td><% out.print(entidadBancaria.getCodigoEntidad());%></td>
                 <td><% out.print(entidadBancaria.getIdEntidadBancaria());%></td>
                <td><% out.print(entidadBancaria.getNombre());%></td>
                <td><% out.print(entidadBancaria.getCif());%></td>
                <td><% out.print(entidadBancaria.getTipoEntidadBancaria());%></td></tr>
                <% }%>
        </table>
    </body>
</html>
