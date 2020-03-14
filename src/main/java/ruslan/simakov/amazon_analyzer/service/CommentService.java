package ruslan.simakov.amazon_analyzer.service;

import ruslan.simakov.amazon_analyzer.model.Comment;

public interface CommentService {

    Comment addCommentFromFile(Comment comment);
}
