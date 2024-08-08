package _12.валидация_данных_аннотации;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) // @Target - атрибут, определяющий, область к которой будет применяться аннотация, для полей
@Retention(RetentionPolicy.RUNTIME) // @Retention - атрибут, определяющий, когда будет применяться аннотация
@Constraint(validatedBy = MyAnnotationValidator.class)
public @interface MyAnnotation {
    public String value() default "xyz.com";
    public String message() default "Email should be in xyz.com format";

    public Class<?>[] groups() default {};  // @groups - атрибут, определяющий группы, к которым будет применяться аннотация
    public Class<? extends Payload>[] payload() default {}; // @payload - атрибут, определяющий типы, к которым будет применяться аннотация
}
