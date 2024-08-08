package _12.валидация_данных_аннотации;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;

public class MyAnnotationValidator implements ConstraintValidator<MyAnnotation, String> {

    private String endOfEmail;

    @Override
    public void initialize(MyAnnotation checkEmail) {
       endOfEmail = checkEmail.value(); // получили конечную часть email
    }

    @Override
    public boolean isValid(String enterValue, ConstraintValidatorContext constraintValidatorContext) {

        return enterValue.endsWith(endOfEmail); // проверяем, заканчивается ли email на конечную часть
        // constraintValidatorContext не используется
    }
}
