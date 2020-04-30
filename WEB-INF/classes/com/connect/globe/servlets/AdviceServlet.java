package com.connect.globe.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class AdviceServlet extends HttpServlet
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

String country=rq.getParameter("country");
String state=rq.getParameter("state");
String city=rq.getParameter("city");
String report=rq.getParameter("report");


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

pw.println("function sendAdvice()");
pw.println("{");
pw.println("alert('Your Advice is send');");
pw.println("}");

pw.println("function showAdvice()");
pw.println("{");
pw.println("var view=document.getElementById('advice');");
pw.println("var form=document.getElementById('advice_form');");
pw.println("var button=document.getElementById('advice_button');");
pw.println("var fieldset,country,state,city,report,br;");
pw.println("fieldset=document.createElement('fieldset');");

pw.println("country=document.createElement('span');");
pw.println("country.innerHTML='COUNTRY : ';");
pw.println("country.className='body_sec';");
pw.println("form.appendChild(country);");
pw.println("country=document.createElement('span');");
pw.println("country.innerHTML='"+country+"';");
pw.println("country.className='body_sec';");
pw.println("form.appendChild(country);");

pw.println("br=document.createElement('br');");
pw.println("form.appendChild(br);");


pw.println("state=document.createElement('span');");
pw.println("state.innerHTML='STATE : ';");
pw.println("state.className='body_sec';");
pw.println("form.appendChild(state);");
pw.println("state=document.createElement('span');");
pw.println("state.innerHTML='"+state+"';");
pw.println("state.className='body_sec';");
pw.println("form.appendChild(state);");

pw.println("br=document.createElement('br');");
pw.println("form.appendChild(br);");

pw.println("city=document.createElement('span');");
pw.println("city.innerHTML='CITY : ';");
pw.println("city.className='body_sec';");
pw.println("form.appendChild(city);");
pw.println("city=document.createElement('span');");
pw.println("city.innerHTML='"+city+"';");
pw.println("city.className='body_sec';");
pw.println("form.appendChild(city);");

pw.println("br=document.createElement('br');");
pw.println("form.appendChild(br);");

pw.println("report=document.createElement('span');");
pw.println("report.innerHTML='REPORT : ';");
pw.println("report.className='body_sec';");
pw.println("form.appendChild(report);");
pw.println("report=document.createElement('textarea');");
pw.println("report.rows='6';");
pw.println("report.cols='80';");
pw.println("report.className='body_sec';");
pw.println("form.appendChild(report);");

pw.println("br=document.createElement('br');");
pw.println("form.appendChild(br);");

pw.println("form.appendChild(button);");

pw.println("fieldset.appendChild(form);");
pw.println("advice.appendChild(fieldset);");
pw.println("}");
pw.println("window.addEventListener('load',showAdvice);");
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
pw.println("<section>");
pw.println("<p class='body_sec' style='font-size:30px;'>ADVICE SECTION</p>");
pw.println("<div id='advice'>");
pw.println("<form id='advice_form'>");
pw.println("<button id='advice_button' type='button' onclick=sendAdvice()>SEND ADVICE</button>");
pw.println("</form>");
pw.println("</div>");
pw.println("</section>");
pw.println("<br>");
pw.println("<br>");
pw.println("<br>");
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