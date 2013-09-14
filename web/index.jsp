<%-- 
    Document   : index
    Created on : Sep 11, 2013, 4:27:25 PM
    Author     : ttjud_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <link rel="stylesheet" type="text/css" href="CSS/cartStyle.css" />
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator App</title>
        <script type="text/javascript" language="javascript" src="JavaScript/ajax1.js"></script>
        <script type="text/javascript" language="javascript" src="JavaScript/cart.js"></script>
    </head>
    <body>
        <h3>Welcome to the Web Calculator</h3>
        <div>
            <form>
                <p>Please enter two integers and select an operation type:</p>
                <p>Integer 1: <input id="int_1" type="text"></p>
                <p>Integer 2: <input id="int_2" type="text"></p>
                <p>Operator:
                    <select id="operator">
                        <option id="add">add</option>
                        <option id="multiply">multiply</option>
                        <option id="r_prime">relatively prime</option>
                        <option id="mod">mod</option>
                        <option id="mod_inv">mod inverse</option>
                        <option id="power">power</option>
                    </select>
                </p>
               
            </form>
            <button type="button" onclick="Calculate()">Submit</button>
            <button type="button" onclick="clearPage()">Reset</button>
        </div>
        <div id="result">Here is the result!
          
        </div>
    </body>
</html>
