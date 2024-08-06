package _3.FirstSpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// сменить пакет в applicationContext.xml в web.xml

@Controller // специальный компонент, он сканирует файл applicationContext.xml  в пакете _3.FirstSpringMVC и создает контроллер
public class MyController {

    @RequestMapping("/")  // при каком адресе должен срабатывать этот метод, связывание метода контроллера с адресом url - /
    public String showFirstView(){  // название может быть любым
        return "first-view";
    }
}

