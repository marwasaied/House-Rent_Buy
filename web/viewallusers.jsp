<%@page import="Classes.Notification"%>
<%@page import="Logical_layer.NotificationLogic"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Logical_layer.AdminLogic"%>
<%@page import="Classes.User"%>
<!doctype html>
<!--[if IE 7 ]>    <html lang="en-gb" class="isie ie7 oldie no-js"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en-gb" class="isie ie8 oldie no-js"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en-gb" class="isie ie9 no-js"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en-gb" class="no-js">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<!--[if lt IE 9]> 
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <![endif]-->
<title>WebThemez - Single page website</title>
<meta name="description" content="">
<meta name="author" content="WebThemez">
<!--[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
<!--[if lte IE 8]>
		<script type="text/javascript" src="http://explorercanvas.googlecode.com/svn/trunk/excanvas.js"></script>
	<![endif]-->
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/isotope.css" media="screen" />
<link rel="stylesheet" href="js/fancybox/jquery.fancybox.css" type="text/css" media="screen" />
<link href="css/animate.css" rel="stylesheet" media="screen">
<!-- Owl Carousel Assets -->
<link href="js/owl-carousel/owl.carousel.css" rel="stylesheet">
<link rel="stylesheet" href="css/styles.css" />
<link rel="stylesheet" href="css/css.css" />

<!-- Font Awesome -->
<link href="font/css/font-awesome.min.css" rel="stylesheet">
</head>

<body>
<header class="header">
  <div class="container">
    <nav class="navbar navbar-inverse"  role="navigation" id="primary_nav_wrap">
      <div class="navbar-header">
        
        <a href="#" class="navbar-brand scroll-top logo  animated bounceInLeft"><b><i><img src="images/logo.png" /></i></b></a> </div>
      <!--/.navbar-header-->
      <div id="main-nav" class="collapse navbar-collapse">
        <ul class="nav navbar-nav" id="mainNav">
          <li><a href="HomePage.jsp" class="scroll-link">Home</a></li>
          <li class="current-menu-item"><a href="" class="scroll-link">Notifications</a>
              <% User user= (User) request.getSession().getAttribute("TheUser");
                    NotificationLogic nio = new NotificationLogic();
                    ArrayList <Notification> newNotification = nio.selectNewNotification(user);
                    ArrayList <Notification > oldNotification =nio.selectOldNotification(user);
                    nio.updateNotification(user);
       
               %>
            <ul>
               <% 
                System.out.println(newNotification.size());
                for(int i =0 ;i<newNotification.size();i++){
                %>
              <li id ="notify"><a href="specificHouseServlet?houseID=<%= newNotification.get(i).getLink()%>"><%= newNotification.get(i).getContent()%></a></li>
              <% } %>
              <%  
                for(int i =0 ;i<oldNotification.size();i++){    
              %>
              <li id ="notify"><a href="specificHouseServlet?houseID=<%= oldNotification.get(i).getLink()%>"><%= oldNotification.get(i).getContent()%></a></li>
                
              <%}%>
            </ul>
          </li>
          
          <li><a href="viewprofile.jsp" class="scroll-link">Profile</a></li>
          <li><a href="UserAdsServlet" class="scroll-link">My Ads</a></li>
          <li><a href="searchHouse.jsp" class="scroll-link">Search</a></li>
          <li><a href="AddHouse.jsp" class="scroll-link">Add House</a></li>
          <% if (user.isIsAdmin()==true){
              
          %>
          <li><a href="viewallusers.jsp" class="scroll-link">Users</a></li>
          <li><a href="suspededHouses.jsp" class="scroll-link">suspended houses</a></li>
          <%}%>
          <li><a href="logoutServlet" class="scroll-link">LogOut</a></li>
        </ul>
      </div>
      <!--/.navbar-collapse--> 
    </nav>
    <!--/.navbar--> 
  </div>
  <!--/.container--> 

</header>

<!--/.header-->
<div id="#top"></div>

<div><h2></h2></div>

<section id="contactUs" class="contact-parlex">
  <div class="parlex-back">
    <div class="container">
      <div class="row">
        <div class="heading text-center"> 
          <!-- Heading -->
          <h2>Users</h2>
        </div>
      </div>
      <div class="row mrgn30">
          <div class="col-sm-12">
            <div class="form-group">
             
              <% 
                AdminLogic adminlogic=new AdminLogic();
                ArrayList<User> users=new ArrayList<User>();
                users=adminlogic.viewusers();
                System.out.println("users" +users.size());
                 for(int i=0;i<users.size();i++){
                     
                 String username=users.get(i).getuserName();
                 %>
                 <input class="btn btn-lg btn-primary" id="submit" type="button" onclick="location.href='Changepassword.jsp?username=<%=users.get(i).getuserName()%>'" name="" value=<%=users.get(i).getuserName()%>
              >
                 <br>
                 <br>
                 <br>
                 <%}%>
                  
                
            </div>
            
            
              
              
              

            </div>
            <div class="result"></div>
          </div>
        
      </div>
    </div>
    <!--/.container--> 
  </div>
</section>





<a href="#top" class="topHome"><i class="fa fa-chevron-up fa-2x"></i></a> 

<!--[if lte IE 8]><script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script><![endif]--> 
<script src="js/modernizr-latest.js"></script> 
<script src="js/jquery-1.8.2.min.js" type="text/javascript"></script> 
<script src="js/bootstrap.min.js" type="text/javascript"></script> 
<script src="js/jquery.isotope.min.js" type="text/javascript"></script> 
<script src="js/fancybox/jquery.fancybox.pack.js" type="text/javascript"></script> 
<script src="js/jquery.nav.js" type="text/javascript"></script> 
<script src="js/jquery.fittext.js"></script> 
<script src="js/waypoints.js"></script> 
<script src="js/custom.js" type="text/javascript"></script> 
<script src="js/owl-carousel/owl.carousel.js"></script>
</body>
</html>
