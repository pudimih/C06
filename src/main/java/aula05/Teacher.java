package aula05;

public class Teacher extends Person{

    String subject;
    String leciona(){
        return "Ensina " + subject;
    }

    @O
}
