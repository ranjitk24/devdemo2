import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Firstservlet extends HttpServlet
{
public void doGet(HttpServletRequest req,
HttpServletResponse res) throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
String name=req.getParameter("username");

HttpSession s=req.getSession();
s.setAttribute("uname",name);
out.println("welcome"+name);
out.println("<a href='s2'>Visit</a>");
out.close();
}
}

