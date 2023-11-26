package User;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Entity
@Table(name="User")

public class User {
    @Id
    @SequenceGenerator(
            name = "User_sequence",
            sequenceName = "User_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "User_sequence"
    )
    private Long userId;
    private String username;
    private String hashedPassword;
    private String email;
    private String profilePicture;
    @OneToMany(mappedBy = "user")
    private List<Post> posts = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Reaction> reactions = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "user_friends",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "friend_id"))
    private Set<User> friends = new HashSet<>();

    public User(Long userId, String username, String hashedPassword, String email, String profilePicture, List<Post> posts, List<Comment> comments, List<Reaction> reactions, Set<User> friends) {
        this.userId = userId;
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.email = email;
        this.profilePicture = profilePicture;
        this.posts = posts;
        this.comments = comments;
        this.reactions = reactions;
        this.friends = friends;
    }




}

