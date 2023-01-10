package com.fastcampus.intellijfastcampusboardproject.repository;

import com.fastcampus.intellijfastcampusboardproject.domian.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
