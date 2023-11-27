package Tables;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;

import java.time.LocalDateTime;
@Entity
@Table(name="Reaction")
public class Reaction {

    @Id
    @SequenceGenerator(
            name = "reaction_sequence",
            sequenceName = "reaction_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "reaction_sequence"
    )
    
    private Long reactionId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "comment_id")
    private Comment comment;

    private String reactionType;

    private LocalDateTime timestamp;

    public Reaction(Long reactionId, User user, Post post, Comment comment, String reactionType, LocalDateTime timestamp) {
        this.reactionId = reactionId;
        this.user = user;
        this.post = post;
        this.comment = comment;
        this.reactionType = reactionType;
        this.timestamp = timestamp;
    }

    public Reaction() {
    }

    public Long getReactionId() {
        return reactionId;
    }

    public void setReactionId(Long reactionId) {
        this.reactionId = reactionId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public String getReactionType() {
        return reactionType;
    }

    public void setReactionType(String reactionType) {
        this.reactionType = reactionType;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
