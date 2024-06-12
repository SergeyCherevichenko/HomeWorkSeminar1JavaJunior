//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.Optional;
//
//public class HomeWork {
//
//    private static class Department {
//        private String name;
//
//// TODO: геттеры, сеттеры
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//    }
//
//    private static class Person {
//        private String name;
//        private int age;
//        private double salary;
//        private Department depart;
//
//
//
//// TODO: геттеры, сеттеры
//
//        public String getName() {
//            return name;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public double getSalary() {
//            return salary;
//        }
//
//        public Department getDepart() {
//            return depart;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public void setAge(int age) {
//            this.age = age;
//        }
//
//        public void setSalary(double salary) {
//            this.salary = salary;
//        }
//
//        public void setDepart(Department depart) {
//            this.depart = depart;
//        }
//
//    }
//    public static class ServicePerson{
//
//         private List<Person> persons;
//        ServicePerson(){
//            persons = new ArrayList<>();
//            for (int i = 0; i < 10; i++) {
//                Person person = new Person();
//                person.setName();
//
//            }
//
//        }
//    }
//
//    /**
//     * Найти самого молодого сотрудника
//     */
//    static Optional<Person> findMostYoungestPerson(List<Person> people) {
//// FIXME: ваша реализация здесь
//    }
//
//    /**
//     * Найти департамент, в котором работает сотрудник с самой большой зарплатой
//     */
//    static Optional<Department> findMostExpensiveDepartment(List<Person> people) {
//// FIXME: ваша реализация здесь
//    }
//
//    /**
//     * Сгруппировать сотрудников по департаментам
//     */
//    static Map<Department, List<Person>> groupByDepartment(List<Person> people) {
//// FIXME: ваша реализация здесь
//    }
//
//    /**
//     * Сгруппировать сотрудников по названиям департаментов
//     */
//    static Map<String, List<Person>> groupByDepartmentName(List<Person> people) {
//// FIXME: ваша реализация здесь
//    }
//
//    /**
//     * В каждом департаменте найти самого старшего сотрудника
//     */
//    static Map<String, Person> getDepartmentOldestPerson(List<Person> people) {
//// FIXME: ваша реализация здесь
//    }
//
//    /**
//     * *Найти сотрудников с минимальными зарплатами в своем отделе
//     * (прим. можно реализовать в два запроса)
//     */
//    static List<Person> cheapPersonsInDepartment(List<Person> people) {
//// FIXME: ваша реализация здесь
//    }
//
//
//}