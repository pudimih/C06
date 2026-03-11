package aula04;

public class Teacher extends Person {
    String Subject;

    void ministrarAula(){
        System.out.println("Aula de " + Subject);
    }
}
