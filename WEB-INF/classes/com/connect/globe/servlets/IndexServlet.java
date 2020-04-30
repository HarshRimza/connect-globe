package com.connect.globe.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class IndexServlet extends HttpServlet
{
public void doGet(HttpServletRequest rq, HttpServletResponse rs)
{
try
{
String login=rq.getParameter("login");
if(login.equals("false"))
{
RequestDispatcher rd=rq.getRequestDispatcher("/login?login=false");
rd.forward(rq,rs);
}
rs.setContentType("text/html");
PrintWriter pw=rs.getWriter();

pw.println("<!Doctype html>");
pw.println("<html>");
pw.println("<head>");
pw.println("<title>Connect Globe</title>");
pw.println("<style>");
pw.println(".title{font-size:40px;color:#FF4136;text-align:left;font-weight:bold;}");
pw.println(".aim{font-size:17px;margin-left:10px;text-align:center;margin-bottom:15px;}");
pw.println("body{margin: 0 auto;background-position: center;background-size: contain;}");
pw.println("align{text-align: center;color: #878E83;font-size:18px;font-weight:bold;line-height: 30px;}");
pw.println(".menu{position: sticky;top: 0;background-color: #85144b;padding:5px 0px 5px 0px;color:white;margin: 0 auto;overflow: hidden;}");
pw.println(".menu a{float: left;color: white;display : block;text-align: center;padding: 14px 16px;text-decoration:none;font-size: 20px;}");
pw.println(".menu_log{right:auto;float:right;}");
pw.println("footer{width:100%;bottom:0px;background-color:#CED9C8;position:sticky;padding-top:10px;padding-bottom:20px;text-align:center;color:#878E83;font-size:15px;font-weight:bold;}");
pw.println("button{color: #878E83;font-weight: bold;border: 1px solid #878E83;font-size: 16px;}");
pw.println(".body_sec{text-align: center;color: #878E83;font-size: 18px;font-weight: bold;line-height: 30px;}");
pw.println("</style>");

pw.println("<script>");

pw.println("var login="+login+";");
pw.println("function hrefa(url)");
pw.println("{");
pw.println("url=url+'?login='+login;");
pw.println("document.location.href=url;");
pw.println("}");

pw.println("</script>");


pw.println("</head>");
pw.println("<body>");
pw.println("");
pw.println("<header>");
pw.println("<div class='title'>CONNECT GLOBE</div>");
pw.println("</header>");
pw.println("");
pw.println("<div class='menu'>");
pw.println("<a onclick=hrefa('/connect-globe/login')>Login</a>");
pw.println("<a onclick=hrefa('/connect-globe/register')>Register</a>");
pw.println("</div>");
pw.println("<br>");

pw.println("<section id='form'>");
pw.println("</section>");
pw.println("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>");
pw.println("<footer>CONNECT GLOBE  | All rights Reserved. </footer>");

pw.println("</body>");
pw.println("</html>");
}catch(Exception e)
{
System.out.println(e);
}
}
}