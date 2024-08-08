package _8.форма_input;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// сменить пакет на applicationContextRequestParam в web.xml

@Controller // специальный компонент, он сканирует файл applicationContext.xml  в пакете _3.FirstSpringMVC и создает контроллер
@RequestMapping("/employee") // при каком адресе должен срабатывать этот метод
public class MyController {

    @RequestMapping("/")  // при каком адресе должен срабатывать этот метод, связывание метода контроллера с адресом url - /
    public String showFirstView(){  // название может быть любым
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
        Employee emp = new Employee();
        emp.setName("Ivan");
        emp.setSurname("Ivanov");
        emp.setSalary(10000);
        model.addAttribute("employee", emp);
        //добавляет объект emp в модель под именем “employee”.
        // Это позволяет передать данные из контроллера в представление (JSP-файл ask-emp-details-input.jsp).
        // В данном случае, объект Employee с именем “Ivan”, фамилией “Ivanov” и зарплатой 10000
        // будет доступен в представлении ask-emp-details-input.jsp под именем “employee”.
        return "ask-emp-details-input";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee emp){ //  параметр "employeeName" из формы ask-emp-details-view.jsp, получаем из него имя
        String name = emp.getName();
        emp.setName("Mr. " + name + "!");
        String surname = emp.getSurname();
        emp.setSurname(surname + "!");
        int salary = emp.getSalary();
        emp.setSalary(salary + 1000);
        return "show-emp-details-input";
    }
}

