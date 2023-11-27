package Tables;

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

    private short status;
    private LocalDate date;

    public RelationStatus() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getSource() {
        return source;
    }

    public void setSource(User source) {
        this.source = source;
    }

    public User getTarget() {
        return target;
    }

    public void setTarget(User target) {
        this.target = target;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
