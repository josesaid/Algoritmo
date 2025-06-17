<%@ page import="com.example.pojos.Carrito" %>
<html>
<body>
<h2><%= "Hello World! 123" %></h2>
<body>
<!--<form action="calculateServlet" method="get">-->

<%
    Integer pRojas = 0;

    Carrito carrito = (Carrito) session.getAttribute("carrito");
    if (carrito == null) {
        carrito = new Carrito();
        session.setAttribute("carrito", carrito);
    }

    String playeraRoja = request.getParameter("playera_roja");

    String pantalonMezcilla = request.getParameter("pantalon_mezcilla");

    if(playeraRoja!=null)
        out.println("playeraRoja:  " + playeraRoja +"<br>");

    if (carrito == null) {
        out.println("El carrito está vacío.");
    } else {
        int playerasRojasEnExistencia = 0;
        Object result = carrito.getItems().get("playeraRoja");
        if(result==null) {
            playerasRojasEnExistencia = 100;
        }else {
            pRojas = (Integer) result;
            pRojas = playerasRojasEnExistencia - Integer.parseInt(playeraRoja);
            carrito.getItems().put("playeraRoja", pRojas);

        }
        if(pRojas!=0)
            out.println("Ahora el inventario tiene: " + pRojas+" unidades de: " + "playera_roja");

        out.println("El carro tiene: " + carrito.getItems().size() + " items");
    }

%>




<form action="#" method="post">
    <label for="textfield1">Playera roja:</label>
    <input type="text" id="textfield1" name="playera_roja">
    <br>
    <label for="textfield2">Pantalon Mezcilla:</label>
    <input type="text" id="textfield2" name="pantalon_mezcilla">
    <br>

    <button type="submit">Añadir al carrito</button>
</form>
</body>

</body>
</html>
