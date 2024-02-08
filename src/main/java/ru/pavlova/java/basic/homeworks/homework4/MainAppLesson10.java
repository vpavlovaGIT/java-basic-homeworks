package ru.pavlova.java.basic.homeworks.homework4;

public class MainAppLesson10 {
    public static void main(String[] args) {
        User[] users = new User[10];
        users[0] = new User("Иванов", "Иван", "Иванович", 1975, "ivanov@mail.ru");
        users[1] = new User("Петров", "Петр", "Петрович", 1980, "petrov@mail.ru");
        users[2] = new User("Сидоров", "Михаил", "Иванович", 1965, "sidorov@mail.ru");
        users[3] = new User("Федорова", "Анна", "Сергеевна", 1978, "fedorova@mail.ru");
        users[4] = new User("Козлов", "Алексей", "Николаевич", 1990, "kozlov@mail.ru");
        users[5] = new User("Смирнова", "Мария", "Ивановна", 1985, "smirnova@mail.ru");
        users[6] = new User("Попов", "Игорь", "Валерьевич", 2000, "popov@mail.ru");
        users[7] = new User("Васильев", "Василий", "Васильевич", 1995, "vasilev@mail.ru");
        users[8] = new User("Кузнецов", "Александр", "Викторович", 1968, "kuznetsov@mail.ru");
        users[9] = new User("Николаев", "Николай", "Николаевич", 1970, "nikolaev@mail.ru");

        for (User user : users) {
            if (user.getAge() > 40) {
                user.printUserInfo();
            }
        }
    }
}
