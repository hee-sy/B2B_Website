<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html class="scroll-smooth" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="font-import.css" />
<script src="https://cdn.tailwindcss.com"></script>
<script src="tailwind-config.js"></script>
<title>Home</title>
</head>
<body>

	<h2>Hello World :))</h2>
	<!-- CustHeader.html -->
	<jsp:include page="CustHeader.html" />

	<!-- HomeAdvertisement.html -->
	<jsp:include page="HomeAdvertisement.html" />

	<!-- HomeCategory.html -->
	<jsp:include page="HomeCategory.html" />

	<!-- HomeFeaturedSnacks.html -->
	<jsp:include page="HomeFeaturedSnacks.html" />

	<!-- CustFooter.html -->
	<jsp:include page="CustFooter.html" />
</body>
</html>