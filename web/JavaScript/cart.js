// Timestamp of cart that page was last updated with
var lastCartUpdate = 0;

/*
 * Adds the specified item to the shopping cart, via Ajax call
 * itemCode - product code of the item to add
 */
function Calculate() {


    var action = document.getElementById('operator').value;

    var firstnumber = document.getElementById('int_1').value;
    var secondnumber = document.getElementById('int_2').value;
    if (isNaN(firstnumber) || isNaN(secondnumber)||firstnumber==""||secondnumber=="") {
        alert("noob, how can I calculate with an unvalid input");
    }
    else {
        var req = newXMLHttpRequest();
      //  req.onreadystatechange = getReadyStateHandler(req, updateCart);

        req.onreadystatechange = function() {
            if (req.readyState == 4) {
                // Check that we received a successful response from the server
                if (req.status == 200) {
                    // Pass the XML payload of the response to the handler function.
                     document.getElementById("result").innerHTML=req.responseText;
                     //alert(document.getElementById("result").innerHTML);
                } else {
                     alert("HTXXXXTP" + req.status + ": " + req.statusText);
                }
            }
        };
        req.open("POST", "myservlet.do", true);
        req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        req.send("action=" + action + "&firstnumber=" + firstnumber + "&secondnumber=" + secondnumber);
        //alert("aaa");
        // req.send();
    }
}
function updateCart(cartXML) {
    document.getElementById("result").innerHTML = "cartXML";
}