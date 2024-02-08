package ru.pavlova.java.basic.homeworks.homework4;

/**
 * Класс Box.
 * Представляет собой коробку с заданными размерами, цветом и возможностью открываться и закрываться.
 * @autor Виктория Павлова
 */
public class Box {

    /** Ширина коробки */
    private double width;
    /** Высота коробки */
    private double height;
    /** Глубина коробки */
    private double depth;
    /** Цвет коробки */
    private String color;
    /** Статус коробки: открыта или закрыта */
    private boolean isOpen;
    /** Предмет, находящийся в коробке */
    private String item;

    /**
     * Конструктор класса Box.
     * @param width  ширина коробки
     * @param height высота коробки
     * @param depth  глубина коробки
     * @param color  цвет коробки
     */
    public Box(double width, double height, double depth, String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.isOpen = false;
        this.item = null;
    }

    /**
     * Метод открывает коробку.
     * если коробка уже открыта, выводит сообщение о том, что она уже открыта.
     * если коробка закрыта, открывает ее и выводит сообщение.
     */
    public void openBox() {
        if (isOpen) {
            System.out.println("Коробка уже открыта");
        } else {
            isOpen = true;
            System.out.println("Коробка открыта");
        }
    }

    /**
     * Метод закрывает коробку.
     * если коробка уже закрыта, выводит сообщение о том, что она уже закрыта.
     * если коробка открыта, закрывает ее и выводит сообщение.
     */
    public void closeBox() {
        if (!isOpen) {
            System.out.println("Коробка уже закрыта");
        } else {
            isOpen = false;
            System.out.println("Коробка закрыта");
        }
    }

    /**
     * Метод перекрашивает коробку в заданный цвет.
     * @param newColor новый цвет для перекраски коробки
     */
    public void repaintBox(String newColor) {
        color = newColor;
        System.out.println("Коробка перекрашена в " + color);
    }

    /**
     * Метод выводит подробную информацию о коробке: размеры, цвет и открыта ли она.
     */
    public void printBoxInfo() {
        System.out.println("Размеры коробки: " + width + " x " + height + " x " + depth);
        System.out.println("Цвет коробки: " + color);
        System.out.println("Состояние коробки: " + (isOpen ? "открыта" : "закрыта"));
        if (item != null) {
            System.out.println("В коробке лежит предмет: " + item);
        } else {
            System.out.println("Коробка пуста");
        }
    }

    /**
     * Метод помещает предмет в коробку, если она открыта.
     * @param item предмет, который требуется поместить в коробку
     */
    public void putItem(String item) {
        if (this.item != null) {
            System.out.println("В коробке уже есть предмет");
        } else {
            this.item = item;
            System.out.println("Предмет " + item + " положен в коробку");
        }
    }

    /**
     * Метод удаляет предмет из коробки, если она открыта.
     * если предмет отсутствует в коробке, выводит сообщение об ошибке.
     */
    public void removeItem() {
        if (isOpen) {
            if (item != null) {
                item = null;
                System.out.println("Предмет извлечен из коробки");
            } else {
                System.out.println("В коробке нет предмета");
            }
        } else {
            System.out.println("Невозможно извлечь предмет. Коробка закрыта");
        }
    }
}
