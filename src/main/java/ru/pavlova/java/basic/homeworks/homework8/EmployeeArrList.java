package ru.pavlova.java.basic.homeworks.homework8;

import java.util.ArrayList;
import java.util.List;

public class EmployeeArrList {
    /**
     * Метод генерирует список целых чисел в заданном диапазоне.
     *
     * @param min Начальное значение диапазона
     * @param max Конечное значение диапазона
     * @return Список целых чисел от минимального до максимального значения
     */
    public static ArrayList<Integer> generateRange(int min, int max) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            result.add(i);
        }
        return result;
    }

    /**
     * Метод суммирует все целые числа из списка, которые больше 5.
     *
     * @param numbers Список целых чисел
     * @return Сумма всех чисел в списке, которые больше 5
     */
    public static int sumGreaterThan5(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num > 5) {
                sum += num;
            }
        }
        return sum;
    }

    /**
     * Метод заменяет значения в списке на указанное число.
     *
     * @param number Число, которым нужно заменить ненулевые значения в списке
     * @param list   Список целых чисел, который будет перезаписан
     */
    public static void rewriteListWithNumber(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                list.set(i, number);
            }
        }
    }

    /**
     * Метод увеличивает каждый элемент списка на указанное число.
     *
     * @param number Число, на которое увеличиваются элементы списка
     * @param list   Список целых чисел, который будет увеличен
     */
    public static void increaseListByNumber(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
    }

    /**
     * Метод возвращает список имен сотрудников из списка объектов Employee.
     *
     * @param employees Список объектов Employee, из которого нужно получить имена
     * @return Список строк с именами сотрудников
     */
    public static List<String> getEmployeeNames(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }

    /**
     * Метод возвращает список сотрудников старше или равных указанному возрасту.
     *
     * @param employees Список объектов Employee, из которого нужно отобрать сотрудников
     * @param minAge    Минимальный возраст для отбора сотрудников
     * @return Список объектов Employee, у которых возраст больше или равен minAge
     */
    public static List<Employee> getEmployeesOlderThan(List<Employee> employees, int minAge) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= minAge) {
                result.add(employee);
            }
        }
        return result;
    }

    /**
     * Метод проверяет, является ли средний возраст сотрудников больше указанного значения.
     *
     * @param employees     Список объектов Employee, для которых нужно рассчитать средний возраст
     * @param minAverageAge Минимальное значение для среднего возраста
     * @return true, если средний возраст сотрудников больше указанного значения, иначе - false
     */
    public static boolean isAverageAgeGreaterThan(List<Employee> employees, int minAverageAge) {
        int totalAge = 0;
        for (Employee employee : employees) {
            totalAge += employee.getAge();
        }
        int averageAge = totalAge / employees.size();
        return averageAge > minAverageAge;
    }

    /**
     * Метод возвращает самого молодого сотрудника из списка.
     *
     * @param employees Список объектов Employee, из которого нужно выбрать самого молодого сотрудника
     * @return Самый молодой сотрудник из списка
     */
    public static Employee getYoungestEmployee(List<Employee> employees) {
        Employee youngest = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getAge() < youngest.getAge()) {
                youngest = employee;
            }
        }
        return youngest;
    }
}
