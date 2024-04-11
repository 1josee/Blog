package com.tien.blogapplication.repository;

import com.tien.blogapplication.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<CategoryEntity, Long> {
}
