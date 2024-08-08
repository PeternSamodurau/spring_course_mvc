package _11.форма_checkbox;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@ToString
public class Employee {

    private String name;
    private String surname;
    private String department;
    private int salary;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languageList;

    public Employee() {
        departments = Map.of(
                "Information Technology", "IT",
                "Human Resources", "HR",
                "Marketing", "Marketing",
                "Sales", "Sales"
        );
        carBrands = Map.of(
                "BMW", "BMW",
                "Audi", "Audi",
                "Mercedes", "Mercedes"
        );
        languageList = Map.of(
                "E", "English",
                "F", "French",
                "G", "German"
        );
    }
}
