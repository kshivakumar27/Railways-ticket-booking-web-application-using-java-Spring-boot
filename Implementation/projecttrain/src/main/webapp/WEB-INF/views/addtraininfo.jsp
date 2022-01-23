<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertinfo" method="post">
User id<input type="number" name="uid"><br><br>
User name<input type="text" name="uname"><br><br>
Train name :<select name="trainnames">
<option value="bangloreexpress">banglore express</option>
<option value="chennaiexpress">chennai express</option>
<option value="andraexpress">Andrapradesh express</option>
</select>

Train :<select name="timings">
<option value="five">5'o'clock</option>
<option value="fivethirty">5:30</option>
<option value="seven">7'o'clock</option>
<option value="nine">9'o'clock</option>
<option value="three">3'o'clock</option>
<option value="eleven">11'o'clock</option>
</select>

Payment Type :<select name="paymenttype">
<option value="gpay">gpay</option>
<option value="phaonepay">phonepay</option>
</select>

<input type="submit" value="Insert Info">

</form>
</body>
</html>