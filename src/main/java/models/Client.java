package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="clients")
@Getter
@Setter
@ToString
public class Client {
    @Id
    private int id;
    @Column(length = 50)
    private String name;
    @Column(length = 12,columnDefinition = "NCHAR(12")
    private String ruc;
    @Column(length = 40,nullable = false)
    private String Department;
    @Column(length = 40,nullable = false)
    private String city;
    @Column(length = 50,nullable = false)
    private String website;
    @Column(updatable = false)
    private boolean clientState;

}
