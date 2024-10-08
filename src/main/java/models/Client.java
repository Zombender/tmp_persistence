package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="client")
@Getter
@Setter
@ToString
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50)
    private String name;
    @Column(length = 12,columnDefinition = "NCHAR(12)")
    private String ruc;
    @Column(length = 40,nullable = false)
    private String department;
    @Column(length = 40,nullable = false)
    private String city;
    @Column(length = 50,nullable = false)
    private String website;
    @Column(updatable = false)
    private boolean clientState;

    public Client(String name, String ruc, String department, String city, String website, boolean clientState) {
        this.name = name;
        this.ruc = ruc;
        this.department = department;
        this.city = city;
        this.website = website;
        this.clientState = clientState;
    }

    public Client() {

    }
}
