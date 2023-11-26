package User;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;

import java.time.LocalDateTime;
@Entity
@Table(name="Post")
public class Post {

    @Id
    @SequenceGenerator(
            name = "post_sequence",
            sequenceName = "post_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "post_sequence"
    )
    private Long postId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String content;

    private LocalDateTime timestamp;

    public Post(Long postId, User user, String content, LocalDateTime timestamp) {
        this.postId = postId;
        this.user = user;
        this.content = content;
        this.timestamp = timestamp;
    }



}
