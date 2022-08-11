package com.product;
import java.util.ArrayList;
public class Product_Class {
private int ID;
private String name;
private String colour;
private float price;
public Product_Class(int ID, String name, String colour, float price){
this.ID=ID;
this.name=name;
this.colour=colour;
this.price=price;
}
public void setId(int ID) {
this.ID = ID;
}
public void setName(String name) {
this.name = name;
}
public void setColour(String colour) {
this.colour = colour;
}
public void setPrice(float price) {
this.price = price;
}
public int getId() {
return ID;
}
public String getName() {
return name;
}
public String getColour() {
return colour;
}
public float getPrice() {
return price;
}
public ArrayList<Product_Class> getproductdetails()
{
ArrayList<Product_Class> productList = new ArrayList<Product_Class>();
productList.add(new Product_Class(ID, name, colour, price)); 
for (Product_Class s : productList) 
{
System.out.print("ID, Name, Colour, and Price of the product are :");
System.out.println(s.ID + " " + s.name + " " + s.colour + " " + 
s.price);
}
return productList;
}
}
