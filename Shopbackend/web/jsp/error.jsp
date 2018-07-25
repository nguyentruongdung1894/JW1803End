<%-- 
    Document   : error
    Created on : Jul 24, 2018, 7:01:01 PM
    Author     : ScorPius 31
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <f:form action="update.htm" modelAttribute="proUpdate" method="POST">
        <table>
            <tr>
                <td>productId</td>
                <td><f:input path="productId"/></td>
            </tr>
            <tr>
                <td>categoryId</td>
                <td><f:input path="categoryId"/></td>
            </tr>
            <tr>
                <td>productName</td>
                <td><f:input path="productName"/></td>
            </tr>
            <tr>
                <td>productImage</td>
                <td><f:input path="productImage"/></td>
            </tr>
            <tr>
                <td>date</td>
                <td><f:input path="date"/></td>
            </tr>
            <tr>
                <td>imageId</td>
                <td><f:input path="imageId"/></td>
            </tr>
            <tr>
                <td>quantity</td>
                <td><f:input path="quantity"/></td>
            </tr>
            <tr>
                <td>description</td>
                <td><f:input path="description"/></td>
            </tr>
            <tr>
                <td>price</td>
                <td><f:input path="price"/></td>
            </tr>
            <tr>
                <td>saleId</td>
                <td>
            <f:select path="saleId">
                <c:forEach items="${sale}" var="sale">
                    <f:option value="${sale.saleid}" label="${sale.levelSale}"/>
                </c:forEach>
            </f:select>
            </td>
            </tr>
            <tr>
                <td>view</td>
                <td><f:input path="view"/></td>
            </tr>
            <tr>
                <td>supplier</td>
                <td><f:select path="supplier">
                <c:forEach items="${sup}" var="sup">
                    <f:option value="${sup.supplierId}" label="${sup.supplierName}"/>    
                </c:forEach>
            </f:select>
            </td>
            </tr>

            <tr>
                <td>Status</td>
                <td><f:select path="status">
                <f:option value="true" label="Active"/>
                <f:option value="false" label="InActive"/>
            </f:select></td>
            </tr>
            <tr>
                <td colspan="2" align="right">
                    <input type="submit" value="Create"/>
                    <input type="reset" value="Reset"/>
                    <input type="button" value="Back" onclick="history.go(-1)"/>
                </td>
            </tr>
        </table>
    </f:form>
</body>
</html>
