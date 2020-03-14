package ruslan.simakov.amazon_analyzer.repository;

import ruslan.simakov.amazon_analyzer.model.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
