<%-- 
    Document   : index
    Created on : 16-oct-2013, 19:44:54
    Author     : Juanjo
--%>

<%@page import="fpmislata.com.bancoWeb.datos.EntidadBancariaDAOImplJDBC"%>
<%@page import="java.util.List"%>
<%@page import="fpmislata.com.bancoWeb.negocio.EntidadBancaria"%>
<%@page import="fpmislata.com.bancoWeb.datos.EntidadBancariaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImplJDBC();
    

    
    List<EntidadBancaria> entidadesBancarias = EntidadBancariaDAOImplJDBC.findAll();



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
