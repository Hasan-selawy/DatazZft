package User;

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


}
