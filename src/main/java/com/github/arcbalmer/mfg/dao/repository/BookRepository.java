package com.github.arcbalmer.mfg.dao.repository;

import com.github.arcbalmer.mfg.dao.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {


}
