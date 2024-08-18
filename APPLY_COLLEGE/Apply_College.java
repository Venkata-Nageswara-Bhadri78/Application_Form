import javax.servlet.*;
import java.io.*;
import java.sql.*;


public class Apply_College extends GenericServlet{
	private final String url = "jdbc:mysql://localhost:3306/ApplicationForm";
	private final String username = "root";
	private final String password = "root";
	public void service(ServletRequest request, ServletResponse response){
		//response.setResponseType("text/html");
		try{
			//retriving data from form
			String first_name = request.getParameter("f_name");
			String last_name = request.getParameter("l_name");
			String full_name = request.getParameter("full_name");
			String father_name = request.getParameter("father_name");
			String mother_name = request.getParameter("mother_name");
			String dob = request.getParameter("dob");
			long aadhar_number = Long.parseLong(request.getParameter("aadhar"));
			long mobile_number = Long.parseLong(request.getParameter("mob_number"));
			String address = request.getParameter("address");

			String school_name = request.getParameter("school_name");
			int school_percentage = Integer.parseInt(request.getParameter("school_parcentage"));
			String inter_clg_name = request.getParameter("inter_college");
			int inter_percentage= Integer.parseInt(request.getParameter("inter_percentagte"));
			int eamcet_rank = Integer.parseInt(request.getParameter("eamcet_rank"));
			String branch = request.getParameter("branch");
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password);
			String query = "insert into StudentResponses values(null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
			PreparedStatement state = conn.prepareStatement(query);
			state.setString(1, first_name);
			state.setString(2, last_name);
			state.setString(3, full_name);
			state.setString(4, father_name);
			state.setString(5, mother_name);
			state.setString(6, dob);
			state.setLong(7, aadhar_number);
			state.setLong(8, mobile_number);
			state.setString(9, address);
			state.setString(10, school_name);
			state.setInt(11, school_percentage);
			state.setString(12, inter_clg_name);
			state.setInt(13, inter_percentage);
			state.setInt(14, eamcet_rank);
			state.setString(15, branch);
			
			state.executeUpdate();
			PrintWriter out = response.getWriter();
			out.println("YOUR RESPONSE IS SUCESSFULLY SUBMITTED");
			
		}
		catch(Exception e){
			
		}
	}
}