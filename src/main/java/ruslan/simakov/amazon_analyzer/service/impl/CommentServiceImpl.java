package ruslan.simakov.amazon_analyzer.service.impl;

import ruslan.simakov.amazon_analyzer.model.Comment;
import ruslan.simakov.amazon_analyzer.repository.CommentRepository;
import ruslan.simakov.amazon_analyzer.service.CommentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment addCommentFromFile(Comment comment) {
        return commentRepository.save(comment);
    }
}
