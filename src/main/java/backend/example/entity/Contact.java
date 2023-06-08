package backend.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    private String name;

    @Column(name = "dateOfBirth")
    private LocalDate dateOfBirth;

    private String phoneNumber;
    private String email;
}
