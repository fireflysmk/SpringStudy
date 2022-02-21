package com.geekbrains.app;

import business_logic.Product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "FirstServlet", urlPatterns = "/first_servlet")
public class Catalog extends HttpServlet {

    //private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //logger.info("New GET request");

        ArrayList<Product> list = new ArrayList<Product>();
        list.add(new Product(1,"mouse", 100));
        list.add(new Product(2,"keyboard", 400));
        list.add(new Product(3,"motherboard ASUS", 10000));
        list.add(new Product(4,"motherboard MSI", 10000));
        list.add(new Product(5,"motherboard GIGABYTE", 11000));
        list.add(new Product(6,"Graphics Card RTX 3090", 999999));
        list.add(new Product(7,"kettle", 300));
        list.add(new Product(8,"pan", 10));
        list.add(new Product(9,"teaPot", 300));
        list.add(new Product(10,"table", 2000));

        resp.getWriter().printf("<h1></h1>");
        resp.getWriter().printf("<h1></h1>");
        resp.getWriter().printf("<h1>Product Catalog</h1>");
        resp.getWriter().printf("<h1></h1>");
        resp.getWriter().printf("<h1></h1>");

        for (Product p : list) {
            resp.getWriter().printf("<h1>" + p.getInfo() + "</h1>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //logger.info("New POST request");

        resp.getWriter().printf("<h1>New POST request</h1>");
    }
}
