package Pro_JAVA_HW;

import java.util.*;

/**
 * В этом примере класс Employee является POJO-классом и имеет 4 поля: name, department, age и salary.
 * Класс Generator содержит статический метод generateEmployees(), который генерирует и возвращает список с объектами Employee.
 * Класс DataBase содержит поле dataBase типа Map, которое представляет базу данных сотрудников.
 * Метод addEmployees() принимает список сотрудников и добавляет их в базу данных.
 * Ключи для сотрудников генерируются автоматически и увеличиваются с каждым добавлением нового сотрудника.
 * В методе main создается список сотрудников с помощью метода Generator.generateEmployees().
 * Затем создается объект базы данных (DataBase) и вызывается метод addEmployees(), передавая список сотрудников в качестве аргумента.
 * После этого вызывается метод printDataBase(), который выводит содержимое базы данных на консоль, включая ключ и имя каждого сотрудника.
 *
 * @param
 */
public class POJO_HW {
    public static class Employee {
        private String name;
        private String department;
        private int age;
        private double salary;

        public Employee(String name, String department, int age, double salary) {
            this.name = name;
            this.department = department;
            this.age = age;
            this.salary = salary;

        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}' + "\n";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return age == employee.age && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, department, age, salary);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }
       // Класс Generator содержит статический метод generateEmployees(),
        // который генерирует и возвращает список с объектами Employee.


         class Generator {
            public static List<Employee> generateEmployees(Employee... employees) {
                List<Employee> list = new ArrayList<>();
              return list;
            }
        }
        /**
         * Класс DataBase содержит поле dataBase типа Map, которое представляет базу данных сотрудников.
         * Метод addEmployees() принимает список сотрудников и добавляет их в базу данных.
         * Ключи для сотрудников генерируются автоматически и увеличиваются с каждым добавлением нового сотрудника.
         */
         class DataBase {
            private Map<Integer, Employee> dataBase;

            public DataBase() {
                dataBase = new TreeMap<>();

            }


            public void addEmployees(List<Employee> employees) {
                int key = 1;
                for (Employee employee : employees) {
                    dataBase.put(key, employee);
                    key++;
                }
            }


            public void printDataBase() {
                for (Map.Entry<Integer, Employee> entry : dataBase.entrySet()) {
                    int key = entry.getKey();
                    Employee employee = entry.getValue();
                    System.out.println(entry.getKey());
                    System.out.println("Key: " + key + ", Employee: " + employee.getName());
                }

            }

        }
        public void main(String[] args) {
            List<Employee> employees = Generator.generateEmployees();
            DataBase dataBase = new DataBase();
            dataBase.addEmployees(employees);
            dataBase.printDataBase();
            System.out.println(employees);

            employees.add(new Employee("John", "Sales", 30, 50000.0));
            employees.add(new Employee("Alice", "Marketing", 35, 60000.0));
            employees.add(new Employee("Bob", "IT", 40, 70000.0));
            employees.add(new Employee("Mary", "HR", 28, 45000.0));
            employees.add(new Employee("David", "Finance", 45, 80000.0));




        }
    }

