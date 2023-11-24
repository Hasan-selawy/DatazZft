package User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface Repository {
}
interface UserRepository extends JpaRepository<Reaction, Long> {
}

interface PostRepository extends JpaRepository<Post, Long> {
}

interface CommentRepository extends JpaRepository<Comment, Long> {
}

interface ReactionRepository extends JpaRepository<Reaction, Long> {
}

interface FriendshipRepository extends JpaRepository<User, Long> {

}

interface CombinedRepository {
    UserRepository getUserRepository();
    PostRepository getPostRepository();
    CommentRepository getCommentRepository();
    ReactionRepository getReactionRepository();
    FriendshipRepository getFriendshipRepository();
}
