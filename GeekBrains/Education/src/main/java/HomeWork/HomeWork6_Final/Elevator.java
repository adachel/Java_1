package HomeWork.HomeWork6_Final;

/**
 * Создать собственный класс, описывающий Лифт.
 * У класса должно быть приватное поле, указывающее на текущий этаж.
 * У класса должен быть 2 конструктора:
 * 1. принимающий диапазон минимального и максимального значения лифта.
 * 2. принимающий максимальное значение. в этом случае минимальное значение = 1
 * По умолчанию лифт находится в позиции минимального этажа.
 *
 * У класса должен быть метод move(int floor), который меняет состояние лифта и отвозит его на указанный этаж.
 *
 * Пример кода:
 * Elevator elevator = new Elevator(2, 7); // лифт находится в позиции 2
 * elevator.move(4); // лифт поднялся на 4 этаж
 *
 * Доп. задание:
 * Добавить проверку аргументов конструктора и метода move:
 * 1. В констукторе запретить создавать лифт, у которого minFloor >= maxFloor
 * 2. В методе move запретить перемещаться на этаж, который не входит в допустимый диапазон
 *
 * По желанию, можно определить метод toString, в котором будет возвращаться диапазон и текущий этаж.
 * Пример: [1, 10] -> 3
 */
public class Elevator {
    private int floor; // текущий этаж
    private int maxFloor;
    private int minFloor;

    public Elevator(int minFloor, int maxFloor){
        if (maxFloor <= minFloor) {     // запретил создавать лифт, у которого minFloor >= maxFloor
            throw new IllegalArgumentException("Максимальный этаж не может быть ниже или равен минимальному!");
        }
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;

        floor = minFloor;       // начальное положение лифта - minFloor
    }

    public Elevator(int maxFloor){
        this(1, maxFloor);
    }

    public Integer move(int floor){     // перемещение лифта на выбранный этаж
        if (floor <= maxFloor && floor >= minFloor){
            return this.floor = floor;
        }else throw new IllegalArgumentException(
                String.format("Не корректно выбран этаж, выберете в диапазоне от %d до %d", minFloor, maxFloor));
    }

    public String toString(){
        return String.format("[%d, %d] -> %d", minFloor, maxFloor, floor);
    }
}
