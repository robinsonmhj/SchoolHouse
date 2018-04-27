
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
<title>Find House/Apartment for You</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/fontello.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap-responsive.css" />" rel="stylesheet">
<link rel='stylesheet' id='prettyphoto-css'  href="<c:url value="/resources/css/prettyPhoto.css" />" type='text/css' media='all'>
 <c:url var="home" value="/" scope="request" />
<!--[if lt IE 7]>
<link href="<c:url value="/resources/css/fontello-ie7.css" />" rel="stylesheet">
<![endif]-->
<link href='http://fonts.googleapis.com/css?family=Quattrocento:400,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Patua+One' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
<style type="text/css">
body {
	padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
}
</style>

<!--[if lt IE 9]>
<script src="js/html5.js"></script>
<![endif]-->
<!--  
<script src="<c:url value="/resources/js/jquery.js" />"></script>
<script src="<c:url value="/resources/js/jquery.scrollTo-1.4.2-min.js" />"></script>
<script src="<c:url value="/resources/js/jquery.localscroll-1.2.7-min.js" />"></script>
-->
<script type="text/javascript" src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="http://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<script src="<c:url value="/resources/js/bootstrap.js" />"></script>
<script src="<c:url value="/resources/js/jquery.prettyPhoto.js" />"></script>
<!-- <script src="<c:url value="/resources/js/site.js" />"></script> -->
<script src="<c:url value="/resources/js/search.js" />"></script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCcMQfZ294HmASExYDeTeGo5q_p86kowgQ"></script>
</head>
<body>
<div class="navbar-wrapper">
  <div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
      <div class="container"> <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </a>
        <h1 class="brand"><a href="#top"></a></h1>
        <nav class="pull-right nav-collapse collapse">
          <ul id="menu-main" class="nav">
          	<li><a href="home" title="Home">Home</a></li>
            <li><a href="portfolio" title="portfolio">Portfolio</a></li>
            <li><a href="service" title="service">Services</a></li>
            <li><a href="news" title="news">News</a></li>
            <li><a href="team" title="team">Team</a></li>
            <li><a href="login" title="login">Login</a></li>
          </ul>
        </nav>
      </div>
    </div>
  </div>
</div>
<!-- <div id="top"></div> -->
<div id="headerwrap">
    <h1>We find the house closed to your university </h1>
    <div class="container">
      <div class="row">
        <div class="span12">
          <form class="form">
          <input type="text" id="universityName" placeholder="type your university name" class="cform-text" size="80" title="university name">
          <input type="submit" id="search" value="Search" class="cform-submit">
         </form>
        </div>
      </div>
      <div id="error"></div>
      <div id="googleMap"></div>
    </div>
</div>
<div class="footer">
  <div class="container">
    <footer> <small>&copy; FreshmanHouse.com. All rights reserved. </small> </footer>
  </div>
</div>

</body>
</html>