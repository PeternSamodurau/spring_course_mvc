package _4.использование_данных_во_VIEW;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// сменить пакет на applicationContextView.xml в web.xml

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
    public String showEmployeeDetails(){
        return "show-emp-details-view";
    }
}

