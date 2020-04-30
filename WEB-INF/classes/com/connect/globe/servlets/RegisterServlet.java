package com.connect.globe.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class RegisterServlet extends HttpServlet
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


pw.println("function registered()");
pw.println("{");
pw.println("alert('User '+register_form.username.value+' Registered Successfully!!!');");
pw.println("}");

pw.println("</script>");
pw.println("</head>");
pw.println("<body>");

pw.println("<header>");
pw.println("<div class='title'>CONNECT GLOBE</div>");
pw.println("</header>");

pw.println("<div class='menu'>");
pw.println("<a onclick=hrefa('/connect-globe/index') >Home</a>");
pw.println("<a onclick=hrefa('/connect-globe/register')>Register</a>");
pw.println("<a onclick=hrefa('/connect-globe/view')>View Status</a>");
pw.println("<a onclick=hrefa('/connect-globe/post')>Post Status</a>");
pw.println("<a onclick=hrefa('/connect-globe/discuss')>Discuss</a>");
pw.println("<div class='menu_log'>");
pw.println("<a onclick=hrefa('/connect-globe/logout')>Logout</a>");
pw.println("</div>");
pw.println("</div>");
pw.println("<br>");

pw.println("<section id='form'>");
pw.println("<center>");
pw.println("<fieldset id='main' style='width:30%'>");
pw.println("<p class='body_sec' style='font-size:30px;'>REGISTER HERE</p>");
pw.println("<form id='register_form'>");
pw.println("<table border='0' class='body_sec'>");
pw.println("<tr>");
pw.println("<td colspan='2' align='left'>USER NAME :</td>");
pw.println("</tr><tr><td colspan='2' align='left'><input id='username' type='text' name='username' size='40'></td>");
pw.println("</tr>");

pw.println("<tr>");
pw.println("<td colspan='2' align='left'>PASSWORD :</td>");
pw.println("</tr><tr><td colspan='2' align='left'><input id='password' type='password' name='password' size='40'></td>");
pw.println("</tr>");

pw.println("<tr>");
pw.println("<td colspan='2' align='left'>EMAIL ID :</td>");
pw.println("</tr><tr><td colspan='2' align='left'><input id='email' type='email' name='email' size='40'></td>");
pw.println("</tr>");

pw.println("<tr>");
pw.println("<td  colspan='2' align='left'>MOBILE NUMBER :</td>");
pw.println("</tr><tr><td colspan='2' align='left'><input id='mobile' type='text' name='mobile' size='40'></td>");
pw.println("</tr>");

pw.println("<tr>");
pw.println("<td colspan='2' align='left'>ADDRESS :</td>");
pw.println("</tr><tr><td colspan='2' align='left'><textarea type='text' id='address' name='address' row='5' cols='41'></textarea></td>");
pw.println("</tr>");

pw.println("<tr>");
pw.println("<td colspan='2' align='center'>");
pw.println("<button type='button' onclick=registered() name='register' style='margin-left:10%;margin-top:2%' >REGISTER</button>");
pw.println("</td>");
pw.println("</tr>");
pw.println("</table>");
pw.println("</form>");
pw.println("</fieldset>");
pw.println("</center>");
pw.println("</section>");

pw.println("<footer>CONNECT GLOBE  | All rights Reserved. </footer>");

pw.println("</body>");
pw.println("</html>");
pw.println("</body>");
pw.println("</html>");


}catch(Exception e)
{
System.out.println(e);
}
}
}