package edu.mum.wap.business;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.mum.wap.data.Product;
import edu.mum.wap.model.Item;

/**
 * Servlet implementation class LoadItem
 */
@WebServlet("/loadItem")
public class LoadItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoadItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);

		Map<String, Item> products = Product.setProducts();

		System.out.println(products.get("1"));
		System.out.println(products.get("2"));
		System.out.println(products.get("3"));
	}

	public static void main(String[] args) {
		Map<String, Item> products = Product.setProducts();
		
		System.out.println(products.get("1"));
		System.out.println(products.get("2"));
		System.out.println(products.get("3"));
	}
}
