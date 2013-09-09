<%-- 
    Document   : index
    Created on : 02/09/2013, 11:40:39 AM
    Author     : TTJudy
--%>

<%@ page import="java.util.*" %>
<%@ page import="developerworks.ajax.store.*" %>
<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <link rel="stylesheet" type="text/css" href="CSS/cartStyle.css" />
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <%--
            The Java Script files are placed in the "JavaScript" folder
        --%>
        <script type="text/javascript" language="javascript" src="JavaScript/ajax1.js"></script>
        <script type="text/javascript" language="javascript" src="JavaScript/cart.js"></script>
    </head>
    <body>
        <div style="float: left; width: 500px">
            <h2>Catalog</h2>
            <table border="1">
                <thead>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Price</th>
                    <th></th>
                    <th></th>
                </thead>
                <tbody>
                    <%
                        for (Iterator<Item> I = new Catalog().getAllItems().iterator(); I.hasNext();) {
                            Item item = I.next();
                    %>
                    <tr>
                        <td><%= item.getName()%></td>
                        <td><%= item.getDescription()%></td>
                        <td><%= item.getFormattedPrice()%></td>
                        <td><button onclick="addToCart('<%= item.getCode()%>')">Add to Cart</button></td>
                        <td><button onclick="deleteFromCart('<%= item.getCode()%>')">Delete</button></td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
        <div style="position: absolute; top: 0px; right: 0px; width: 250px">
            <h2>Cart Contents</h2>
            <ul id="contents">
            </ul>
            Total cost: <span class="thick" id="total">$0.00</span>
        </div>
    </body>
</html>
