package com.nguyentran.controller.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.nguyentran.DAO.AdminDAO;
import com.nguyentran.DAO.CategoryDAO;
import com.nguyentran.DAO.ProductDAO;
import com.nguyentran.models.Admin;
import com.nguyentran.models.Category;
import com.nguyentran.models.Product;

@WebServlet({ "/home","/" })
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private CategoryDAO categoryDao;
	private ProductDAO productDao;

	@Override
	public void init() throws ServletException {
		categoryDao = new CategoryDAO();
		productDao = new ProductDAO();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String content = req.getServletPath();

		try {
			switch (content) {
			
			default:
				getHomePage(req, resp);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void getHomePage(HttpServletRequest req, HttpServletResponse resp)
			throws SQLException, IOException, ServletException {
		
		List<Category> cates = categoryDao.getAllCats();
		
		
		List<Product> prods = productDao.getAllProduct();
		req.setAttribute("listCates", cates);
		req.setAttribute("listProds", prods);
		resp.setCharacterEncoding("UTF-8");
		RequestDispatcher d = req.getRequestDispatcher("views/web/homepage.jsp");
		d.forward(req, resp);
	}
	
	

}
