package _8.форма_input;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {

    private String name;
    private String surname;
    private String department;
    private int salary;

    public Employee() {
    }
}
