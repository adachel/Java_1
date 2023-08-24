package Seminars.Seminar6.MyClass;

public class Employee {     // это класс "Сотрудник". Этот класс описывает собою объект. Наследуется от
    // Object, если 'extends Object' не писать, то все равно наследуется от 'Object'.

    // Модификаторы доступа. Можно ставить и на полях и конструкторах и на методах
    // public - виден всем
    // protected - виден внутри пакета + наследники
    // default - виден внутри пакета (package - private)
    // private - не виден никому


    // у каждого класса могут быть:
    // поля - это как переменная, кот. Существует вместе с объектом
    // конструкторы
    // методы

    // static. Работает без объектов. Без классов методы не существуют
    private static int counter = 0; // static означает, что значение этой переменной общее для всех объектов
    public static int getCounter(){ // cоздали метод для подсчета сотрудников
        return counter;
    }

    /////////////////////////////////////////////
    // пример полей:
    private String name; // имя сотрудника. Поля закрывают 'private', а для изменений создают 'getter' и 'setter'
    private int age;    // возраст сотрудника

//    public String getName(){    // это 'getter'. Подход называется ИНКАПСУЛЯЦИЯ
//        return name;
//    }

//    public void setName(String newName){    // это 'setter. Меняет поле в 'main'
//        name = newName;
//    }

//    public int getAge() {
//        return age;
//    }

//    public void setAge(int age) {
//        if (age <= 0){
//            throw new IllegalArgumentException("Возраст должен быть положительным числом!");
//        }
//        this.age = age;
//    }

//    public boolean isOlderThen(int threshold){
//        return age > threshold;
//    }

    //////////////////////////////////////////////
    // конструктор
//    public Employee(String employeeName, int employeeAge){ // создаем конструктор
//        name = employeeName;
//        age = employeeAge;
//    }

    public Employee(String name, int age){
        if (age <= 0){
            throw new IllegalArgumentException("Возраст должен быть положительным числом!");
        }
        this.name = name; // имя совпадает с именем поля, поэтому ставится 'this'
        this.age = age;
        counter++; // считаем количество созданных сотрудников(это к обьяснению про 'static')
    }
    // 'this' это то, что относится к классу
    // не 'this' это аргумент метода

    public Employee(String name){
        this(name, 18);
//        this.name = name;
//        this.age = 18;
    }
    public String toString(){return String.format("Имя: %s, возраст: %d", name, age);}
}
