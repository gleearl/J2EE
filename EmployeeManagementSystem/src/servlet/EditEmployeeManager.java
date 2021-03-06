package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DataAccess;

/**
 * Servlet implementation class EditEmployeeManager
 */
@WebServlet("/EditEmployeeManager")
public class EditEmployeeManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditEmployeeManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int empId = Integer.parseInt(request.getParameter("idNo"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String middleName = request.getParameter("middleName");
		String birthday = request.getParameter("birthday");
		System.out.println(birthday);
		String address = request.getParameter("address");
		String contactNo = request.getParameter("contactNo");
		String email = request.getParameter("email");
		int deptNo = Integer.parseInt(request.getParameter("deptNo"));
		String jobTitle = request.getParameter("jobTitle");
		
		DataAccess da = new DataAccess();
		da.editEmp(empId, firstName, lastName, middleName, birthday, address, contactNo, email, deptNo, jobTitle);
		response.sendRedirect("ViewEmployeeServlet?id="+empId);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
