public class Student {
    String name;
    String surname;
    int age;
    int group;
    int quantityOfTasksExecuted;
    int quantityOfModulsExecuted;
    boolean experience;
    String aim;

    public static void main(String[] args) {

    }

    public Student(String name, String surname, int age) {
        this("Adam", "Tort", 30,0,
                0,0,
                false,"Выучить Java");
    }

    public Student(String name, String surname, int age,
                   int group,
                   int quantityOfTasksExecuted,
                   int quantityOfModulsExecuted,
                   boolean experience,
                   String aim) {

    }
}

