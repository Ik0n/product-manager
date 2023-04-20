package com.example.productmanager.controller;

import com.example.productmanager.dto.CategoryDTO;
import com.example.productmanager.dto.ProductDTO;
import com.example.productmanager.entity.Category;
import com.example.productmanager.entity.Product;
import com.example.productmanager.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@AllArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public ResponseEntity<Category> create(@RequestBody CategoryDTO dto) {
        return new ResponseEntity<Category>(categoryService.create(dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Category>> readAll() {
        return new ResponseEntity<List<Category>>(categoryService.readAll(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Category> update(@RequestBody Category category) {
        return new ResponseEntity<Category>(categoryService.update(category), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Long id) {
        categoryService.delete(id);
        return HttpStatus.OK;
    }


}
