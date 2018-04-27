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
<link rel='stylesheet' id='prettyphoto-css'  href="<c:url value="/resources/css/prettyPhoto.css" />" type='text/css' media='all'>
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
<link href="css/bootstrap-responsive.css" rel="stylesheet">
<!--[if lt IE 9]>
<script src="js/html5.js"></script>
<![endif]-->


<script src="js/jquery.js"></script>
<script src="js/jquery.scrollTo-1.4.2-min.js"></script>
<script src="js/jquery.localscroll-1.2.7-min.js"></script>
<script charset="utf-8">
$(document).ready(function () {
    $("a[rel^='prettyPhoto']").prettyPhoto();
});
</script>
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
            <li><a href="login" title="login" >Login</a></li>
          </ul>
        </nav>
      </div>
    </div>
  </div>
</div>
<section id="portfolio" class="single-page scrollblock">
  <div class="container">
    <div class="align"><i class="icon-desktop-circled"></i></div>
    <h1 id="folio-headline">Portfolio...</h1>
    <div class="row">
      <div class="span4">
        <div class="mask2"> <a href="img/portfolio-01.jpg" rel="prettyPhoto"><img src="img/portfolio-01.jpg" alt=""></a> </div>
        <div class="inside">
          <hgroup>
            <h2>Ethan Marcotte Design</h2>
          </hgroup>
          <div class="entry-content">
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
            <a class="more-link" href="#">view project</a> </div>
        </div>
      </div>
      <div class="span4">
        <div class="mask2"> <a href="img/portfolio-02.jpg" rel="prettyPhoto"><img src="img/portfolio-02.jpg" alt=""></a></div>
        <div class="inside">
          <hgroup>
            <h2>A Book Apart</h2>
          </hgroup>
          <div class="entry-content">
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
            <a class="more-link" href="#">view project</a></div>
        </div>
      </div>
      <div class="span4">
        <div class="mask2"> <a href="img/portfolio-03.jpg" rel="prettyPhoto"><img src="img/portfolio-03.jpg" alt=""></a></div>
        <div class="inside">
          <hgroup>
            <h2>Four Rules for Designers</h2>
          </hgroup>
          <div class="entry-content">
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
            <a class="more-link" href="#">view project</a></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="span4">
        <div class="mask2"> <a href="img/portfolio-01.jpg" rel="prettyPhoto"><img src="img/portfolio-03.jpg" alt=""></a></div>
        <div class="inside">
          <hgroup>
            <h2>Ethan Marcotte Design</h2>
          </hgroup>
          <div class="entry-content">
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
            <a class="more-link" href="#">view project</a></div>
        </div>
      </div>
      <div class="span4">
        <div class="mask2"> <a href="img/portfolio-02.jpg" rel="prettyPhoto"><img src="img/portfolio-01.jpg" alt=""></a></div>
        <div class="inside">
          <hgroup>
            <h2>A Book Apart</h2>
          </hgroup>
          <div class="entry-content">
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
            <a class="more-link" href="#">view project</a></div>
        </div>
      </div>
      <div class="span4">
        <div class="mask2"> <a href="img/portfolio-03.jpg" rel="prettyPhoto"><img src="img/portfolio-02.jpg" alt=""></a></div>
        <div class="inside">
          <hgroup>
            <h2>Four Rules for Designers</h2>
          </hgroup>
          <div class="entry-content">
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
            <a class="more-link" href="#">view project</a></div>
        </div>
      </div>
    </div>
  </div>
</section>
<div class="footer-wrapper">
  <div class="container">
    <footer> <small>&copy; FreshmanHouse.com. All rights reserved. </small> </footer>
  </div>
</div>
<script src="js/bootstrap.js"></script>
<script src="js/jquery.prettyPhoto.js"></script>
<script src="js/site.js"></script>
</body>
</html>