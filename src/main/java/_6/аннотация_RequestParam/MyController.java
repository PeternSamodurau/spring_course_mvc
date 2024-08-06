package _6.аннотация_RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// сменить пакет на applicationContextRequestParam в web.xml

@Controller // специальный компонент, он сканирует файл applicationContext.xml  в пакете _3.FirstSpringMVC и создает контроллер
public class MyController {

    @RequestMapping("/")  // при каком адресе должен срабатывать этот метод, связывание метода контроллера с адресом url - /
    public String showFirstView(){  // название может быть любым
        return "first-view";
    }
    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName") String employeeName, Model model){ //  параметр "employeeName" из формы ask-emp-details-view.jsp, получаем из него имя
        employeeName = "Mr. " + employeeName + "!"; // изменили имя
        model.addAttribute("nameAttribute", employeeName); // передали имя в модель с помощью атрибута nameAttribute
        model.addAttribute("descriptionAttribute", " - annotation @RequestParam"); // передали описание в модель с помощью атрибута descriptionAttribute
        return "show-emp-details-model";
    }
}

