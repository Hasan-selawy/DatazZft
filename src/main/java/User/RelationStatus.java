package User;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "RELATION_STATUS")
public class RelationStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User source;

    @ManyToOne
    @JoinColumn(name = "friend_id", referencedColumnName = "id")
    private User target;

    private Short status;
    private LocalDate date;

    public RelationStatus() {
    }

}
