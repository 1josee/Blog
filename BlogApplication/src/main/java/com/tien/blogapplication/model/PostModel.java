package com.tien.blogapplication.model;

import com.tien.blogapplication.entity.CategoryEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostModel {
    private String title;
    private String desc;
    private String username;
    private String userId;
    private List<CategoryEntity> categories;
    private String image;
    private String timeStamp;
    private String file;
}
