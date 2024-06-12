public class Main {
    public static void main(String[] args) {
        Department department1 = new Department("Отдел безопасности");
        Department department2 = new Department("Отдел кадров");
        Department department3 = new Department("Транспортный отдел");
        Department department4 = new Department("Финансовый отдел");
        ServicePerson servicePerson = new ServicePerson();
        servicePerson.addPerson("Сергей",25,1000.0,department1);
        servicePerson.addPerson("Николай",35,1500,department2);
        servicePerson.addPerson("Оля",28,100.0,department3);
        servicePerson.addPerson("Елена",38,1500.0,department1);
        servicePerson.addPerson("Михаил",21,3000,department4);
        servicePerson.addPerson("Кристина",33,2400.0,department4);
        servicePerson.addPerson("Андрей",45,2300,department2);
        servicePerson.addPerson("Кирил",27,2000.0,department1);
        System.out.println(servicePerson.toString());
        System.out.println("Самый молодой сотрудник");
        System.out.println(servicePerson.findMostYoungestPerson().toString());
        System.out.println("Департамент, в котором работает сотрудник с самой большой зарплатой");
        System.out.println(servicePerson.findMostExpensiveDepartment().toString());
        System.out.println("Сгруппировать сотрудников по департаментам");
        System.out.println(servicePerson.groupByDepartment());
        System.out.println("Сгруппировать сотрудников по названиям департаментов");
        System.out.println(servicePerson.groupByDepartmentName());
        System.out.println("В каждом департаменте найти самого старшего сотрудника");
        System.out.println(servicePerson.getDepartmentOldestPerson());
        System.out.println("Найти сотрудников с минимальными зарплатами в своем отделе");
        System.out.println(servicePerson.cheapPersonsInDepartment());

    }
}