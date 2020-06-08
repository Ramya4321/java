/*
aim:9. Create a Servlet that recognizes first time visitor to
web application and responds by saying Welcome to
new user otherwise welcome back.
*/
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ServletWelcome extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String msg="Welcome to new user";
		HttpSession ses=req.getSession(true);
		if(ses.isNew())
		{
			pw.println("<b><i><u>Welcome to new user");
		}
		else
		{
			pw.println("<b><i><u>Welcome back");
		}
		pw.close();
	}
}
