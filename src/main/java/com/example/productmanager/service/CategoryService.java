package com.example.productmanager.service;

import com.example.productmanager.dto.CategoryDTO;
import com.example.productmanager.dto.ProductDTO;
import com.example.productmanager.entity.Category;
import com.example.productmanager.entity.Product;
import com.example.productmanager.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> readAll() {
        return categoryRepository.findAll();
    }

    public Category create(CategoryDTO dto) {
        return categoryRepository.save(Category.builder()
                .name(dto.getName())
                .build());
    }

    public Category readById(Long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found " + id));
    }

    public Category update(Category category) {
        return categoryRepository.save(category);
    }

    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

}
