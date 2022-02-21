package com.geekbrains.controllers;


import com.geekbrains.entites.Product;
import com.geekbrains.entites.Products;
import com.geekbrains.service.ProductServece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {

    private ProductServece productServece;

    public ProductServece getProductServece() {
        return productServece;
    }

    @Autowired
    public void setProductServece(ProductServece productServece) {
        this.productServece = productServece;
    }

    @RequestMapping("/showProduct")
    public String hello(Model uiModel) {

        Product[] products = new Product[3];
        products[0] = productServece.getProductById(10);
        products[1] = productServece.getProductById(20);
        products[2] = productServece.getProductById(120);

        Products productList = new Products();
        productList.setProducts(products);

        uiModel.addAttribute("products", productList);
        return "products";
    }

    @RequestMapping(path = "/showProductById", method = RequestMethod.GET)
    @ResponseBody
    public Product showProductById(Model uiModel, @RequestParam int id) {
        Product product = productServece.getProductById(id);
        return product;
    }


    @RequestMapping(path = "/setProductById", method = RequestMethod.POST)
    public void setProduct(@RequestBody Product product) {
        System.out.println(product.getId() + " " + product.getTitle() + " " + product.getCost());
    }

    @RequestMapping("/showForm")
    public String showSimpleForm(Model uiModel) {
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "product-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("product") Product product) {
        return "product-form-result";
    }

}