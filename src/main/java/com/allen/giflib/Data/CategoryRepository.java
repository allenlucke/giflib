package com.allen.giflib.Data;

import com.allen.giflib.Model.Category;
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
}
