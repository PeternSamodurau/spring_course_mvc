package _12.валидация_данных_аннотации;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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

        model.addAttribute("employee", new Employee());
        //добавляет объект emp в модель под именем “employee”.
        // Это позволяет передать данные из контроллера в представление (JSP-файл ask-emp-details-input.jsp).
        // В данном случае, объект Employee с именем “Ivan”, фамилией “Ivanov” и зарплатой 10000
        // будет доступен в представлении ask-emp-details-input.jsp под именем “employee”.
        return "ask-emp-details-validation";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult){
        // @Valid - атрибут будет проверяться на валидность, результат проверки будет помещён в bindingResult
        // @ModelAttribute - атрибут будет преобразован в модель Employee
        // BindingResult - производит проверку на валидность переданных данных и помещaeт результат в bindingResult
        if (bindingResult.hasErrors()){
            return "ask-emp-details-validation";
        }else {
            return "show-emp-details-validation";
        }

    }
}

