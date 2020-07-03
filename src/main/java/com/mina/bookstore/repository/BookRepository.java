package com.mina.bookstore.repository;

import com.mina.bookstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<User, Long> {
}
