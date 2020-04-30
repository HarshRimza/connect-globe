package com.connect.globe.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class LogoutServlet extends HttpServlet
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
else
{
RequestDispatcher rd=rq.getRequestDispatcher("/index?login=false");
rd.forward(rq,rs);
}
rs.setContentType("text/html");
PrintWriter pw=rs.getWriter();

}catch(Exception e)
{
System.out.println(e);
}
}
}