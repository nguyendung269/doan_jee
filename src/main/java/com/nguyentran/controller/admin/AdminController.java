package com.nguyentran.controller.admin;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nguyentran.DAO.AdminDAO;
import com.nguyentran.models.Admin;

@WebServlet({ "/admin"})
public class AdminController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private AdminDAO AdminDao;

	@Override
	public void init() throws ServletException {
		AdminDao = new AdminDAO();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String content = req.getServletPath();

		try {
			switch (content) {
			case "/new":
				showNewForm(req, resp);
				break;
			case "/insert":
				insertAdmin(req, resp);
				break;
			case "/delete":
				deleteAdmin(req, resp);
				break;
			case "/edit":
				showEditForm(req, resp);
				break;
			case "/update":
				updateAdmin(req, resp);
				break;
			default:
				listAdmin(req, resp);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listAdmin(HttpServletRequest req, HttpServletResponse resp)
			throws SQLException, IOException, ServletException {
//		List<Admin> Admins = AdminDao.getAllAdmins();
//		System.out.println(Admins);
//
//		req.setAttribute("listAdmin", Admins);

		RequestDispatcher d = req.getRequestDispatcher("views/web/homepage.jsp");
		d.forward(req, resp);
	}
	

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/web/admin-form.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Admin existingAdmin = AdminDao.getAdmin(id);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/web/Admin-form.jsp");
		request.setAttribute("Admin", existingAdmin);
		dispatcher.forward(request, response);

	}

	private void insertAdmin(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Admin newAdmin = new Admin(name, email, password);
		AdminDao.saveAdmin(newAdmin);
		response.sendRedirect("home");
	}

	private void updateAdmin(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		Admin Admin = new Admin(id, name, email, password);
		AdminDao.updateAdmin(Admin);
		response.sendRedirect("home");
	}

	private void deleteAdmin(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		AdminDao.deleteAdmin(id);
		response.sendRedirect("home");
	}

}
package com.nguyentran.controller.admin;


