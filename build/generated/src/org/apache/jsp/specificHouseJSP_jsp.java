package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Classes.Comment;
import Classes.Comment;
import java.util.ArrayList;
import java.util.ArrayList;
import Classes.House;

public final class specificHouseJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
<<<<<<< HEAD
      out.write(" \r\n");
=======
      out.write("\r\n");
>>>>>>> 68e46a9e48c5488dbefa1cc9aadb088e363189ec
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<!--[if IE 7 ]>    <html lang=\"en-gb\" class=\"isie ie7 oldie no-js\"> <![endif]-->\r\n");
      out.write("<!--[if IE 8 ]>    <html lang=\"en-gb\" class=\"isie ie8 oldie no-js\"> <![endif]-->\r\n");
      out.write("<!--[if IE 9 ]>    <html lang=\"en-gb\" class=\"isie ie9 no-js\"> <![endif]-->\r\n");
      out.write("<!--[if (gt IE 9)|!(IE)]><!-->\r\n");
      out.write("<html lang=\"en-gb\" class=\"no-js\">\r\n");
      out.write("<!--<![endif]-->\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<!--[if lt IE 9]> \r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("<title>WebThemez - Single page website</title>\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"WebThemez\">\r\n");
<<<<<<< HEAD
      out.write(" \r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"http://h...content-available-to-author-only...e.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("<!--[if lte IE 8]>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"http://e...content-available-to-author-only...e.com/svn/trunk/excanvas.js\"></script>\r\n");
=======
      out.write("\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("<!--[if lte IE 8]>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"http://explorercanvas.googlecode.com/svn/trunk/excanvas.js\"></script>\r\n");
>>>>>>> 68e46a9e48c5488dbefa1cc9aadb088e363189ec
      out.write("\t<![endif]-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/isotope.css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"js/fancybox/jquery.fancybox.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<link href=\"css/animate.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<!-- Owl Carousel Assets -->\r\n");
      out.write("<link href=\"js/owl-carousel/owl.carousel.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/styles.css\" />\r\n");
<<<<<<< HEAD
      out.write("<link rel=\"stylesheet\" href=\"css/rate.css\" />\r\n");
      out.write("<!-- Font Awesome -->\r\n");
      out.write("<link href=\"font/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write(" \r\n");
=======
      out.write("<!-- Font Awesome -->\r\n");
      out.write("<link href=\"font/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
>>>>>>> 68e46a9e48c5488dbefa1cc9aadb088e363189ec
      out.write("<body>\r\n");
      out.write("<header class=\"header\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <nav class=\"navbar navbar-inverse\" role=\"navigation\">\r\n");
      out.write("      <div class=\"navbar-header\">\r\n");
      out.write("        <button type=\"button\" id=\"nav-toggle\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#main-nav\"> <span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </button>\r\n");
      out.write("        <a href=\"#\" class=\"navbar-brand scroll-top logo  animated bounceInLeft\"><b><i><img src=\"images/logo.png\" /></i></b></a> </div>\r\n");
      out.write("      <!--/.navbar-header-->\r\n");
      out.write("      <div id=\"main-nav\" class=\"collapse navbar-collapse\">\r\n");
      out.write("        <ul class=\"nav navbar-nav\" id=\"mainNav\">\r\n");
      out.write("          <li class=\"active\" id=\"firstLink\"><a href=\"#home\" class=\"scroll-link\">Home</a></li>\r\n");
      out.write("          <li><a href=\"#services\" class=\"scroll-link\">Services</a></li>\r\n");
      out.write("          <li><a href=\"#aboutUs\" class=\"scroll-link\">About Us</a></li>\r\n");
      out.write("          <li><a href=\"#work\" class=\"scroll-link\">Projects</a></li>\r\n");
      out.write("          <li><a href=\"#plans\" class=\"scroll-link\">Price</a></li>\r\n");
      out.write("          <li><a href=\"#team\" class=\"scroll-link\">Team</a></li>\r\n");
      out.write("          <li><a href=\"#contactUs\" class=\"scroll-link\">Contact Us</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--/.navbar-collapse--> \r\n");
      out.write("    </nav>\r\n");
      out.write("    <!--/.navbar--> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--/.container--> \r\n");
      out.write("</header>\r\n");
      out.write("<!--/.header-->\r\n");
      out.write("<div id=\"#top\"></div>\r\n");
      out.write("<script>\r\n");
      out.write("// When the user clicks on <div>, open the popup\r\n");
      out.write("function myFunction() {\r\n");
      out.write("    var popup = document.getElementById(\"myPopup\");\r\n");
      out.write("    popup.classList.toggle(\"show\");\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<section id=\"aboutUs\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"heading text-center\"> \r\n");
      out.write("      <!-- Heading -->\r\n");
      out.write("      <h2>About Us</h2>\r\n");
      out.write("    </div>\r\n");
<<<<<<< HEAD
      out.write(" \r\n");
      out.write("    <div class=\"row dataTxt\">\t\r\n");
      out.write("        <div class=\"col-md-6 col-sm-6\">\r\n");
=======
      out.write("  \r\n");
      out.write("    <div class=\"row dataTxt\">\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6 col-sm-6\">\r\n");
>>>>>>> 68e46a9e48c5488dbefa1cc9aadb088e363189ec
      out.write("            <ul class=\"listArrow\">\r\n");
      out.write("                ");
 House house=(House)application.getAttribute("house");
      out.write("\r\n");
      out.write("                <h2><li>");
      out.print(house.getAdName());
      out.write("</li></h2>\r\n");
      out.write("                <h4><li>Type</li></h4>\r\n");
      out.write("                <p>");
      out.print(house.getType());
      out.write("</p>\r\n");
      out.write("                <li><h4>Description</h4>\r\n");
      out.write("              <p>");
      out.print(house.getDescription());
      out.write("</p>\r\n");
      out.write("              </li>\r\n");
      out.write("              <h4><li>For </li></h4>\r\n");
      out.write("                <p>");
      out.print(house.getAdType());
      out.write("</p>\r\n");
      out.write("              <h4><li>Size</li></h4>\r\n");
      out.write("                <p>");
      out.print(house.getSize());
      out.write("</p>\r\n");
      out.write("                <h4><li>Floor</li></h4>\r\n");
      out.write("                <p>");
      out.print(house.getFloor());
      out.write("</p>\r\n");
      out.write("                <h4><li>Status</li></h4>\r\n");
      out.write("                <p>");
      out.print(house.getStatus());
      out.write("</p>\r\n");
      out.write("                <h4><li>Location</li></h4>\r\n");
      out.write("                <p>");
      out.print(house.getLocation());
      out.write("</p>\r\n");
      out.write("                <h4><li>Rate</li></h4>\r\n");
      out.write("                <p>");
      out.print(house.getRate());
      out.write("</p>\r\n");
      out.write("                <h4><li>Price</li></h4>\r\n");
      out.write("                <p>");
      out.print(house.getPrice());
      out.write("</p>\r\n");
      out.write("              </ul>\r\n");
      out.write("<style>\r\n");
      out.write("       #map {\r\n");
      out.write("        height: 400px;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("       }\r\n");
      out.write("    </style>\r\n");
<<<<<<< HEAD
      out.write(" \r\n");
      out.write(" \r\n");
=======
      out.write("\r\n");
>>>>>>> 68e46a9e48c5488dbefa1cc9aadb088e363189ec
      out.write("    <div id=\"map\"></div>\r\n");
      out.write("<script>\r\n");
      out.write("      function initMap() {\r\n");
      out.write("        var map = new google.maps.Map(document.getElementById('map'), {\r\n");
      out.write("          zoom: 10,\r\n");
      out.write("          center: {lat: 30.0444, lng: 31.2357}\r\n");
      out.write("        });\r\n");
      out.write("        var geocoder = new google.maps.Geocoder();\r\n");
<<<<<<< HEAD
      out.write("\r\n");
      out.write("        \r\n");
      out.write("          geocodeAddress(geocoder, map);\r\n");
      out.write("        \r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function geocodeAddress(geocoder, resultsMap) {\r\n");
      out.write("        var address = \"6 october, egypt\";\r\n");
=======
      out.write("          geocodeAddress(geocoder, map);\r\n");
      out.write("       \r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function geocodeAddress(geocoder, resultsMap) {\r\n");
      out.write("\t");
String adr=house.getLocation();
      out.write("\r\n");
      out.write("        var address =\"");
      out.print(adr);
      out.write("\";\r\n");
>>>>>>> 68e46a9e48c5488dbefa1cc9aadb088e363189ec
      out.write("        geocoder.geocode({'address': address}, function(results, status) {\r\n");
      out.write("          if (status === 'OK') {\r\n");
      out.write("            resultsMap.setCenter(results[0].geometry.location);\r\n");
      out.write("            var marker = new google.maps.Marker({\r\n");
      out.write("              map: resultsMap,\r\n");
      out.write("              position: results[0].geometry.location\r\n");
      out.write("            });\r\n");
      out.write("          } else {\r\n");
      out.write("            alert('Geocode was not successful for the following reason: ' + status);\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("    <script async defer\r\n");
<<<<<<< HEAD
      out.write("    src=\"https://m...content-available-to-author-only...s.com/maps/api/js?key=AIzaSyApNZIr1Y8z16FL8--iEnirsSzhZqNMqCw&callback=initMap\">\r\n");
      out.write("    </script>\t\t\t\t\t\t\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"popup\" onclick=\"myFunction()\" ><div class=\"btn\">Request Contacts!</div>\r\n");
=======
      out.write("    src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyApNZIr1Y8z16FL8--iEnirsSzhZqNMqCw&callback=initMap\">\r\n");
      out.write("    </script>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"popup\" onclick=\"myFunction()\" ><div class=\"btn\">Request Contacts!</div>\r\n");
>>>>>>> 68e46a9e48c5488dbefa1cc9aadb088e363189ec
      out.write("            <span class=\"popuptext\" id=\"myPopup\">Email:\r\n");
      out.write("                                            <br> Phone:\r\n");
      out.write("            </span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("              <label for=\"comments\"><h4>Comments</h4></label>\r\n");
      out.write("              ");
 ArrayList <Comment> comments = house.getComments();
                for (int i = 0; i < comments.size(); i++){
                    
      out.write("\r\n");
      out.write("                    <p> ");
      out.print(  comments.get(i).getUser().getfName());
      out.write(" : ");
      out.print( comments.get(i).getcomment());
      out.write("</p>\r\n");
<<<<<<< HEAD
      out.write(" \r\n");
=======
      out.write("                    \r\n");
>>>>>>> 68e46a9e48c5488dbefa1cc9aadb088e363189ec
      out.write("                    <br>\r\n");
      out.write("                ");
} 
      out.write("\r\n");
<<<<<<< HEAD
      out.write("                \r\n");
      out.write("                <form action=\"rateServlet\" >\r\n");
      out.write("                    <input class=\"star star-5\" id=\"star-5\" type=\"radio\" value=\"5\" name=\"star\"/>\r\n");
      out.write("                    <label class=\"star star-5\" for=\"star-5\"></label>\r\n");
      out.write("                    <input class=\"star star-4\" id=\"star-4\" type=\"radio\" value=\"4\" name=\"star\"/>\r\n");
      out.write("                    <label class=\"star star-4\" for=\"star-4\"></label>\r\n");
      out.write("                    <input class=\"star star-3\" id=\"star-3\" type=\"radio\" value=\"3\" name=\"star\"/>\r\n");
      out.write("                    <label class=\"star star-3\" for=\"star-3\"></label>\r\n");
      out.write("                    <input class=\"star star-2\" id=\"star-2\" type=\"radio\" value=\"2\" name=\"star\"/>\r\n");
      out.write("                    <label class=\"star star-2\" for=\"star-2\"></label>\r\n");
      out.write("                    <input class=\"star star-1\" id=\"star-1\" type=\"radio\" value=\"1\" name=\"star\"/>\r\n");
      out.write("                    <label class=\"star star-1\" for=\"star-1\"></label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-lg btn-primary\" value=\"Rate\">\r\n");
      out.write("                </form>\r\n");
      out.write("                \r\n");
=======
>>>>>>> 68e46a9e48c5488dbefa1cc9aadb088e363189ec
      out.write("               <form method=\"post\" action=\"AddCommentServlet\" id=\"contactfrm\" role=\"form\">\r\n");
      out.write("              <textarea name=\"comment\" class=\"form-control\" id=\"comments\" cols=\"3\" rows=\"5\" placeholder=\"Enter your Comment?\" title=\"Please enter your message (at least 10 characters)\"></textarea>\r\n");
      out.write("              <input type=\"submit\"  value=\"Add comment\"  class=\"btn btn-lg btn-primary\">\r\n");
      out.write("               </form>\r\n");
<<<<<<< HEAD
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
=======
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
>>>>>>> 68e46a9e48c5488dbefa1cc9aadb088e363189ec
      out.write("<div class=\"col-md-6 col-sm-12\"> \r\n");
      out.write("<section id=\"home\">\r\n");
      out.write("  <div class=\"banner-container\"> \r\n");
      out.write("    <div id=\"carousel\" class=\"carousel slide carousel-fade\" data-ride=\"carousel\">\r\n");
      out.write("  <ol class=\"carousel-indicators\">\r\n");
      out.write("    <li data-target=\"#carousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("    <li data-target=\"#carousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("    <li data-target=\"#carousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("  </ol>\r\n");
      out.write("  <!-- Carousel items -->\r\n");
      out.write("  <div class=\"carousel-inner\">\r\n");
<<<<<<< HEAD
      out.write("      ");
 for(int i=0; i<house.getImages().size(); i++)
      {
          request.setAttribute("i", i);
      
      out.write("\r\n");
      out.write("    <div class=\"item\"><img src=\"viewPhotoServlet?adName=");
      out.print( house.getAdName() );
      out.write("\" alt=\"banner\" /></div>\r\n");
      out.write("    <div class=\"item\"><img src=\"images/banner-bg2.jpg\" alt=\"banner\" /></div>\r\n");
      out.write("    <div class=\"item\"><img src=\"images/banner-bg3.jpg\" alt=\"banner\" /></div>\r\n");
      out.write("    ");
 }
     
      out.write("\r\n");
=======
      out.write("    <div class=\"active item\"><img src=\"images/banner-bg.jpg\" alt=\"banner\" /></div>\r\n");
      out.write("    <div class=\"item\"><img src=\"images/banner-bg2.jpg\" alt=\"banner\" /></div>\r\n");
      out.write("    <div class=\"item\"><img src=\"images/banner-bg3.jpg\" alt=\"banner\" /></div>\r\n");
>>>>>>> 68e46a9e48c5488dbefa1cc9aadb088e363189ec
      out.write("  </div>\r\n");
      out.write("  <!-- Carousel nav -->\r\n");
      out.write("  <a class=\"carousel-control left\" href=\"#carousel\" data-slide=\"prev\">&lsaquo;</a>\r\n");
      out.write("  <a class=\"carousel-control right\" href=\"#carousel\" data-slide=\"next\">&rsaquo;</a>\r\n");
      out.write("</div>\r\n");
<<<<<<< HEAD
      out.write(" \r\n");
      out.write("  </div>  \r\n");
      out.write(" \r\n");
=======
      out.write("  \r\n");
      out.write("  </div>  \r\n");
      out.write("  \r\n");
>>>>>>> 68e46a9e48c5488dbefa1cc9aadb088e363189ec
      out.write("  <div class=\"container hero-text2\">\r\n");
      out.write("  </div>\r\n");
      out.write("</section>\r\n");
      out.write("  </div>\r\n");
      out.write("</section> \r\n");
<<<<<<< HEAD
      out.write(" \r\n");
=======
      out.write("\r\n");
>>>>>>> 68e46a9e48c5488dbefa1cc9aadb088e363189ec
      out.write("<!--/.page-section-->\r\n");
      out.write("<section class=\"copyright\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-sm-12 text-center\"> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- / .row --> \r\n");
      out.write("  </div>\r\n");
      out.write("</section>\r\n");
      out.write("<a href=\"#top\" class=\"topHome\"><i class=\"fa fa-chevron-up fa-2x\"></i></a> \r\n");
<<<<<<< HEAD
      out.write(" \r\n");
=======
      out.write("\r\n");
>>>>>>> 68e46a9e48c5488dbefa1cc9aadb088e363189ec
      out.write("<!--[if lte IE 8]><script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script><![endif]--> \r\n");
      out.write("<script src=\"js/modernizr-latest.js\"></script> \r\n");
      out.write("<script src=\"js/jquery-1.8.2.min.js\" type=\"text/javascript\"></script> \r\n");
      out.write("<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script> \r\n");
      out.write("<script src=\"js/jquery.isotope.min.js\" type=\"text/javascript\"></script> \r\n");
      out.write("<script src=\"js/fancybox/jquery.fancybox.pack.js\" type=\"text/javascript\"></script> \r\n");
      out.write("<script src=\"js/jquery.nav.js\" type=\"text/javascript\"></script> \r\n");
      out.write("<script src=\"js/jquery.fittext.js\"></script> \r\n");
      out.write("<script src=\"js/waypoints.js\"></script> \r\n");
      out.write("<script src=\"js/custom.js\" type=\"text/javascript\"></script> \r\n");
      out.write("<script src=\"js/owl-carousel/owl.carousel.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("var slideIndex = 1;\r\n");
      out.write("showDivs(slideIndex);\r\n");
<<<<<<< HEAD
      out.write(" \r\n");
      out.write("function plusDivs(n) {\r\n");
      out.write("  showDivs(slideIndex += n);\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
=======
      out.write("\r\n");
      out.write("function plusDivs(n) {\r\n");
      out.write("  showDivs(slideIndex += n);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
>>>>>>> 68e46a9e48c5488dbefa1cc9aadb088e363189ec
      out.write("function showDivs(n) {\r\n");
      out.write("  var i;\r\n");
      out.write("  var x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("  if (n > x.length) {slideIndex = 1}    \r\n");
      out.write("  if (n < 1) {slideIndex = x.length}\r\n");
      out.write("  for (i = 0; i < x.length; i++) {\r\n");
      out.write("     x[i].style.display = \"none\";  \r\n");
      out.write("  }\r\n");
      out.write("  x[slideIndex-1].style.display = \"block\";  \r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
<<<<<<< HEAD
      out.write(" ");
=======
      out.write("\r\n");
>>>>>>> 68e46a9e48c5488dbefa1cc9aadb088e363189ec
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
