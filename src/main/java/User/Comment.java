package User;

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
    private User user;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;


    public Comment(Long commentId, Long commentId1, User user, Post post, String content, LocalDateTime timestamp) {
        this.commentId = commentId;
        this.commentId = commentId1;
        this.user = user;
        this.post = post;
        this.content = content;
        this.timestamp = timestamp;
    }

    private String content;

    private LocalDateTime timestamp;



}
