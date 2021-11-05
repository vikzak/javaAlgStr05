public class MyRecur {
    public long numberLevel(long number, int level){
        if (level == 0) return 1; // чисто математика
        if (number == 0) return 0; // чисто математика
        if (level < 0) {// предположим что по условию задачи человек поставил отрицательную степень
            throw new ArithmeticException("Операция с отрицательной степенью в этом примере не поддерживается ");}
        if (level == 1) {return number;}
        return (number*numberLevel(number, level -1));

    }
}
