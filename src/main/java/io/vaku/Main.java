package io.vaku;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[]{
                new User("Иванов", "Андрей", "Петрович", 1950, "mail-1@mail.ru"),
                new User("Петров", "Иван", "Иванович", 1960, "mail-2@mail.ru"),
                new User("Сидоров", "Петр", "Ильич", 1973, "mail-3@mail.ru"),
                new User("Андреев", "Никита", "Андреевич", 1981, "mail-4@mail.ru"),
                new User("Козлов", "Сергей", "Петрович", 1980, "mail-5@mail.ru"),
                new User("Котов", "Кирилл", "Дмитриевич", 1999, "mail-6@mail.ru"),
                new User("Соловьев", "Станислав", "Александрович", 2001, "mail-7@mail.ru"),
                new User("Воронов", "Антон", "Семенович", 1979, "mail-8@mail.ru"),
                new User("Чижов", "Илья", "Иванович", 2005, "mail-9@mail.ru"),
                new User("Галкин", "Семен", "Ильич", 1996, "mail-10@mail.ru")
        };

        for (User user : users) {
            if (Year.now().getValue() - user.getBirthYear() > 40) {
                System.out.println(user);
                System.out.println();
            }
        }
    }
}
