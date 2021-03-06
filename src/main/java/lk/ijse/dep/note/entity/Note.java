package lk.ijse.dep.note.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Note implements SuperEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String text;
    @JoinColumn(name = "user_id",referencedColumnName = "id",nullable = false)
    @ManyToOne
    private User user;

    public Note(String text,User user){
        this.text=text;
        this.user=user;
    }
}
