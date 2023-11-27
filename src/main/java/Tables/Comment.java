package Tables;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name="COMMENT")
public class Comment {

    @Id
    @SequenceGenerator(
            name = "post_sequence",
            sequenceName = "comment_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "comment_sequence"
    )
    private Long commentId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User User;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
    private String content;
    private LocalDateTime timestamp;
    
    public Comment(Long commentId, Long commentId1, User user, Post post, String content, LocalDateTime timestamp) {
        this.commentId = commentId;
        this.commentId = commentId1;
        this.User = user;
        this.post = post;
        this.content = content;
        this.timestamp = timestamp;
    }

    public Comment() {
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public User getUser() {
        return User;
    }

    public void setUser(User User) {
        this.User = User;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
