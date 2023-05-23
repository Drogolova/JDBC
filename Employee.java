import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age")
    private int age;
    @Column(name = "city_id")
    private Integer city;

//    public Employee(int id, String firstName, String lastName, String gender, int age, int city) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.gender = gender;
//        this.age = age;
//        this.city = city;
//    }

    public Employee() {
    }

//    public Employee(String firstName, String lastName, String gender, int age, City city) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.gender = gender;
//        this.age = age;
//        this.city = city;
//    }


    public Employee(int id, String firstName, String lastName, String gender, int age, int city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }

    public Employee(String firstName, String lastName, String gender, int age, int city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }
}
