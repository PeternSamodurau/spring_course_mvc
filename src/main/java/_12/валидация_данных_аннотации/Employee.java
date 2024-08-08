package _12.валидация_данных_аннотации;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@ToString
public class Employee {
    @Size(min = 3, max = 10, message = "Name should be between 3 and 10 characters")
    private String name;
 //   @NotEmpty(message = "Surname should not be empty")   // @NotEmpty - означает, что поле не может быть пустым и должно содержать какое-то значение
    @NotBlank(message = "Surname should not be blank")
    // @NotBlank - означает, что поле не может быть заполнено пустым или содержать только пробелы и включает в себя @NotEmpty
    private String surname;
    private String department;
    @Min(value = 100, message = "Salary should be greater than 100")
    @Max(value = 1000, message = "Salary should be less than 1000")
    private int salary;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languageList;
    @Pattern(regexp = "\\d{4}-\\d{3}-\\d{2}-\\d{2}", message = "Phone number should be in xxxx-xxx-xx-xx format")
    private String phoneNumber;
    @MyAnnotation()
    private String email;

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
