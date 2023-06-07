package Pro_JAVA_HW;

//Напишите класс Person, который имеет следующие поля:


// name (тип String) - имя человека;
// age (тип int) - возраст человека.
// Реализуйте интерфейс Comparable для класса Person, чтобы объекты Person могли быть сравниваемыми на основе возраста.
//При сравнении двух объектов Person должно возвращаться отрицательное число, если первый объект младше второго, положительное число, 
//если первый объект старше второго, и ноль, если объекты равны по возрасту.
 public class Person implements Comparable<Person> {
   private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("bob", 30);
        int result = person1.compareTo(person2);
        if (result < 0) {
            System.out.println(person1.getName() + "is younger than" + person2.getName());
        } else if (result > 0) {
            System.out.println(person1.getName() + "is older than" + person2.getName());

        } else {
            System.out.println(person1.getName() + "and" + person2.getName() + "are the same age");
        }
    }
}
