package com.connect.globe.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class PostServlet extends HttpServlet
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
pw.println("<fieldset style='width:60%'>");
pw.println("<p class='body_sec' style='font-size:30px;'>POST REPORT</p>");
pw.println("<form id='post_form' action='/connect-globe/view?login=true&'>");

pw.println("<input type='hidden' name='login' value='true'>");
pw.println("<table border='0' class='body_sec'>");
pw.println("<tr>");
pw.println("<td align='left'>COUNTRY :</td>");
pw.println("<td align='left'>");
pw.println("<select id='countryComboBox'  name='country' class='body_sec' style='width:200px;margin:10px;'>");
pw.println("<option value='-1'>&lt;Select Country&gt;</option>");
pw.println("<option value='India'>India</option>");
pw.println("<option value='U.S.A.'>U.S.A.</option>");
pw.println("<option value='China'>China</option>");
pw.println("<option value='Japan'>Japan</option>");
pw.println("<option value='Germany'>Germany</option>");
pw.println("</select>");
pw.println("</td>");
pw.println("</tr>");
pw.println("<tr>");
pw.println("<td align='left'>STATE :</td>");
pw.println("<td align='left'>");
pw.println("<select id='stateComboBox'  name='state' style='width:200px;margin:10px;' class='body_sec'>");
pw.println("<option value='-1'>&lt;Select State&gt;</option>");
pw.println("<option value='Madhya Pradesh'>Madhya Pradesh</option>");
pw.println("<option value='Maharashtra'>Maharashtra</option>");
pw.println("<option value='Punjab'>Punjab</option>");
pw.println("<option value='Gujarat'>Gujarat</option>");
pw.println("<option value='Karnataka'>Karnataka</option>");
pw.println("<option value='New York'>New York</option>");
pw.println("<option value='Texas'>Texas</option>");
pw.println("<option value='Berlin>Berlin</option>");
pw.println("<option value='Beijing'>Beijing</option>");
pw.println("<option value='Shanghai'>Shanghai</option>");
pw.println("</select>");
pw.println("</td>");
pw.println("</tr>");
pw.println("");
pw.println("<tr>");
pw.println("<td align='left'>CITY :</td>");
pw.println("<td align='left'>");
pw.println("<select id='cityComboBox'  name='city' style='width:200px;margin:10px;' class='body_sec'>");
pw.println("<option value='-1'>&lt;Select City&gt;</option>");
pw.println("<option value='Ujjain'>Ujjain</option>");
pw.println("<option value='Ahmedabad>Ahmedabad</option>");
pw.println("<option value='Bengaluru'>Bengaluru</option>");
pw.println("<option value='Mumbai'>Mumbai</option>");
pw.println("<option value='Amritsar'>Amritsar</option>");
pw.println("<option value='Brooklyn'>Brooklyn</option>");
pw.println("<option value='Queens'>Queens</option>");
pw.println("<option value='Tokyo'>Tokyo</option>");
pw.println("<option value='Houston'>Houston</option>");
pw.println("<option value='Dallas'>Dallas</option>");
pw.println("<option value='Berlin'>Berlin</option>");
pw.println("<option value='Beijing'>Beijing</option>");
pw.println("<option value='Shanghai'>Shanghai</option>");
pw.println("</select>");
pw.println("</td>");
pw.println("</tr>");
pw.println("");
pw.println("<tr>");
pw.println("<td colspan='2' align='left'>YOUR REPORT :</td>");
pw.println("</tr><tr><td colspan='2' align='left'><textarea type='text' id='report' name='report' rows='7' cols='100'></textarea></td>");
pw.println("</tr>");
pw.println("");
pw.println("<tr>");
pw.println("<td colspan='2' align='center'>");
pw.println("<button type='submit' style='margin-left:10%;margin-top:2%' >SUBMIT</button>");
pw.println("</td>");
pw.println("</tr>");
pw.println("</table>");
pw.println("</form>");
pw.println("</fieldset>");
pw.println("</center>");
pw.println("</section>");
pw.println("");
pw.println("<footer>CONNECT GLOBE  | All rights Reserved. </footer>");
pw.println("");
pw.println("</body>");
pw.println("</html>");

}catch(Exception e)
{
System.out.println(e);
}
}
}