<%--
  Created by IntelliJ IDEA.
  User: homeLaptop
  Date: 15/11/12
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="qotd.Quote" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Random Quote</title>
    <g:javascript library="prototype"/>
</head>

<body>

<div id="quote">
    <ul id="menu">
        <li>
            <g:remoteLink action="ajaxRandom" update="quote">
                Next Quote
            </g:remoteLink>
        </li>
        <li>
            <g:link action="list">
                Admin
            </g:link>
        </li>
    </ul>

    <q>${quote.content}</q>

    <p>${quote.author}</p>
</div>

</body>
</html>