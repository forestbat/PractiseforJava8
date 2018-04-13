import java.lang.annotation.*;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
    public int id();
    public String description() default "no description";
}
class PasswordUtils{
    @Test(id=47,description = "Passwords must contain at least one numeric")
    public boolean validatePassword(String password){return password.matches("\\w*\\d\\w*");}
}
