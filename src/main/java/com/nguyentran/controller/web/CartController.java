package com.nguyentran.controller.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.nguyentran.DAO.CategoryDAO;
import com.nguyentran.DAO.OderDetailDAO;
import com.nguyentran.DAO.ProductDAO;
import com.nguyentran.models.Product;

@WebServlet("/client/*")
public class CartController extends HttpServlet {

	private ProductDAO productDao;
	private OderDetailDAO oderDetailDao;

	@Override
	public void init() throws ServletException {

		productDao = new ProductDAO();
		oderDetailDao = new OderDetailDAO();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		String content = req.getRequestURI().substring(22);
		
		
		System.out.println(1 + content);
		

			switch (content) {
			case "addocard" :
				addToCart(req, resp);
				break;
			case "removecard" :
				addToCart(req, resp);
				break;
			
			}
		
			
		}

	private void addToCart(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("p_id");
		
		Product product = productDao.getProduct(Integer.valueOf(id));
		
		HttpSession session = req.getSession();
		
		Object obj = session.getAttribute("cart");
		
		Gson gson = new Gson();
		String prodJS = gson.toJson(product);
		
		JsonObject object = new JsonObject();
		object.addProperty("listCats", prodJS);
		
		
		if(obj == null) {
			
			product.setQuantity(1);
			
			
			Map<String, Product> map = new HashMap<>();
			map.put(id, product);

			session.setAttribute("cart", map);
			String mapJS = gson.toJson(map);
			object.addProperty("listMap", mapJS);
		} else {
			Map<String,Product> map =  (Map<String, Product>) obj;
			
			Product oldProduct = map.get(id);
			
			if(oldProduct == null) {
				map.put(id, product);
			} else {
				oldProduct.setQuantity(oldProduct.getQuantity()+1);
			}
			session.setAttribute("cart", map);
			String mapJS = gson.toJson(map);
			object.addProperty("listMap", mapJS);
		}
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		
		out.print(object.toString());
		
		out.flush();
//		resp.sendRedirect(req.getContextPath());
	}
}