package aula04;

public class Main {
    public static void main(String[] args){
        Person Vinicius = new Person();

        Vinicius.name = "Vinicius Savio Medina";
        Vinicius.age = 20;

        //Vinicius.talk();

        Teacher TeacherPoo = new Teacher();

        TeacherPoo.name = "Justino";
        TeacherPoo.age = 70;
        TeacherPoo.Subject = "Rdio";

        TeacherPoo.talk();
        TeacherPoo.ministrarAula();

        Engineer eng = new Engineer();

        eng.category = "civil";
        eng.age = 29;
        eng.name = "maria";
        eng.Subject = "resistencia dos materias";
        eng.talk();
        eng.ministrarAula();
        eng.build();
    }

}
