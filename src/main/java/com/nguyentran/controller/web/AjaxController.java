package com.nguyentran.controller.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.nguyentran.DAO.CategoryDAO;
import com.nguyentran.DAO.ProductDAO;
import com.nguyentran.models.Category;
import com.nguyentran.models.Product;


@WebServlet("/ajax")
public class AjaxController extends HttpServlet{
	
	private CategoryDAO categoryDao;
	private ProductDAO productDao;
	@Override
	public void init() throws ServletException {
		categoryDao = new CategoryDAO();
		productDao = new ProductDAO();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Category> cates = categoryDao.getAllCats();
		List<Product> prods = productDao.getAllProduct();
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
	
		Gson gson = new Gson();
		String catesJson = gson.toJson(cates);
		String prodsJson = gson.toJson(prods);
		
		
		
		JsonObject object = new JsonObject();
		object.addProperty("listCats", catesJson);
		object.addProperty("listProds", prodsJson);
		

		out.print(object.toString());
		System.out.println(object.toString());
		out.flush();
	}
}
