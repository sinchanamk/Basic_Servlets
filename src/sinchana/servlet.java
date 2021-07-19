package sinchana;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class servlet extends HttpServlet
{
	
	protected void dopost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
	{
		String eid=req.getParameter("Name");
		int id=Integer.parseInt(eid);
		String name=req.getParameter("nm");
		String eperc=req.getParameter("pr");
		double per=Double.parseDouble(eperc);
		
		String dept=req.getParameter("dp");
		
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='cyan'><h1>"+"welcome"+id+"to"+dept+"branch"+name+"name"+per+"percentagee"+"</h1></body></html>");
				out.close();
				out.println("Totally WELCOME");
		
}}