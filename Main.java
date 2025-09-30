public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        Person student = new Person("Maria", 20);
        System.out.println(student);
  Person teacher2 = new Person("Varvara", 20);
        System.out.println(teacher2);
        Person teacher = new Person("Ekaaaaaaaaaaaaaterina", 25);
        System.out.println(teacher);

        Grade grade=new Grade();
        grade.setGrade(10);
        System.out.println("Оценка: "+ grade.getGrade());
    }
}
