package com.allen.giflib.Data;

import com.allen.giflib.Model.Category;
import com.allen.giflib.Model.Gif;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "Technology"),
            new Category(2, "people"),
            new Category(3, "Destruction")
    );

    public static List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public Category findById(int id) {
        for(Category category : ALL_CATEGORIES) {
            if(category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}
