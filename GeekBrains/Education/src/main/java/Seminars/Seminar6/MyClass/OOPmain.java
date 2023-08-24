package Seminars.Seminar6.MyClass;

public class OOPmain {
    public static void main(String[] args) {

//        Employee employee = new Employee(); // создали объект типа 'Employee'. Ошибка, т.к. появился конструктор.
//        employee.name = "Igor"; // применили поля к сотруднику 'Igor'
        Employee employee = new Employee("Igor", 100); // так записыв с конструктором
//        employee.setName("Igor"); // указывается в конструкторе
//        employee.age = 100;     // ему 100 лет
//        employee.setAge(100);

//        Employee another = new Employee(); // создали другого сотрудника
//        employee.name = "Another";
        Employee another = new Employee("Another", 90);
//        employee.setName("Another"); // это после 'setter'
//        employee.age = 90;
//        employee.setAge(90);

        Employee three = new Employee("three", 18); // попытались создать сотрудника с отрицательным возрастом


//        String name = employee.getName();
//        System.out.println(name);

//        System.out.println(employee.isOlderThen(95));

        System.out.println(another);

        System.out.println(Employee.getCounter());  // 'Employee' - имя класса,
                                                    // 'getCounter - метод поссчета созданных сотрудниковю

    }
}
