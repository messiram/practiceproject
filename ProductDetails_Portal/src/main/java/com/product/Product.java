package com.product;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Product extends HttpServlet {
private static final long serialVersionUID = 1L; 
 public Product() {
 super();
 // TODO Auto-generated constructor stub
 }
 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
PrintWriter out = response.getWriter();
response.setContentType("text/html;charset=UTF-8");
out.println("<!DOCTYPE html>");
out.println("<html>");
out.println("<head>");
out.println("<title>Product Details Portal</title>");
out.println("</head>");
out.println("<body>");
try {
int ID = Integer.parseInt(request.getParameter("ID"));
String name = request.getParameter("name");
String colour = request.getParameter("colour");
float price = Float.parseFloat(request.getParameter("price"));
Product_Class product1 = new Product_Class(ID, name, colour, price);
// product1 = new ProductClass(id, name, color, price));
HttpSession session = request.getSession();
session.setAttribute("data", product1);
request.setAttribute("data", product1.getproductdetails());
RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
rd.forward(request, response);
out.println("</body>");
out.println("</html>");
} catch (NumberFormatException e) {
out.println(e);
} catch (Exception e) {
out.println(e);
}
}
protected void doGet(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException {
processRequest(request, response);
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException {
// TODO Auto-generated method stub
processRequest(request, response);
}
}
