import mefunc.MyRecur;

import static mybackpack.ResultBacckPack.backpackMaxWeigth;
import static mybackpack.ResultBacckPack.resultItemInBackpak;

public class Lesson05 {
    public static void main(String[] args) {
        // 1) Написать программу по возведению числа в степень с помощью рекурсии.
        long number = -9;
        int level = 3; // на ввод отрицательной степени поставил ArithmeticException
        long result = new MyRecur().numberLevel(number,level);
        System.out.printf("результат возведения числа %s в степень %s равен:%s",number,level,result);
        System.out.println("\n");
        // 2) Написать программу «Задача о рюкзаке» с помощью рекурсии.
        // используемые предметы и их значения:
        // | наименование | вес       | стоиомсть |
        // | Рюкзак       | 2.5kg     | 3000₽     |
        // | Ноутбук      | 1kg       | 120000₽   |
        // | PowerBank    | 0.3kg     | 3000₽     |
        // | Книга        | 0.2kg     | 800₽      |
        // | Компас       | 0.005kg   | 200₽      |
        // | Смартфон     | 0.3kg     | 20000₽    |
        // | Зажигалка    | 0.005kg   | 50₽       |
        // | Термос(чай)  | 1.3kg     | 1000₽     |
        System.out.println("Вместимость в рюкзак: " + backpackMaxWeigth + " кг.");
        System.out.println("В рюкзак положим самые ценные вещи:\n"+ resultItemInBackpak());
    }
}
