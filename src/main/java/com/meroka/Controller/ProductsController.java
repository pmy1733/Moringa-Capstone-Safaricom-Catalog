package com.meroka.Controller;

import java.util.List;

import com.meroka.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.meroka.service.ProductsService;
//mark class as Controller  
@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductsController
{
    //autowire the ProductsService class  
    @Autowired
    ProductsService productsService;

    //creating a get mapping that retrieves all the Product detail from the database
    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        return productsService.getAllProducts();
    }

    //creating a get mapping that retrieves the detail of a specific product
    @GetMapping("/product/{productid}")
    public Product getProducts(@PathVariable("productid") long productid)
    {

        return productsService.getProductsById(productid);
    }

    //creating a delete mapping that deletes a specified product
    @PostMapping("/product/{productid}")
    public void product(@PathVariable("productid") int productid)
    {
        productsService.delete(productid);
    }

    //creating post mapping that post the product detail in the database
    @PostMapping("/products")
    public ResponseEntity<Product> saveProduct(@RequestBody Product products)
    {
        return ResponseEntity.ok(productsService.saveOrUpdate(products));
    }


    //creating put mapping that updates the product detail
    @PostMapping("/Product")
    public ResponseEntity<Product> update(@RequestBody Product products)
    {
        return ResponseEntity.ok(productsService.saveOrUpdate(products));
    }
}  


