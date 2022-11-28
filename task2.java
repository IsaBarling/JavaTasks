import java.util.ArrayList;
import java.util.Date;

public class task2 {
    public static void main(String[] args) {
        int count = 4;//начинаем с 4, т.к. до 10 нам известны все простые числа и программа их не обрабатывает.
        int n = 1000;//число до которого необходимо найти все простые числа
        ArrayList<Integer> numbers = new ArrayList<>();//создаем массив, необходим для вывода чисел на экран, можно и без массива, просто выводить каждое найденное простое число
        numbers.add(2);//добавляем в массив простые числа до 10(см count = 4)
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        Date startTime = new Date();//время старта
        for (int i = 11; i <= n; i+=2) {//проверяем все числа до нашего значения
            if (simple(i)) {//метод ниже
                count++;//меняем счетчик простых чисел
                numbers.add(i);//заносим простые в массив
            }
        }
        Date finishTime = new Date();//время окончания работы алгоритма
        long ct = finishTime.getTime() - startTime.getTime();//время работы
        System.out.println("Время вычислений: " + ct + "ms");//вывод на экран времени работы
        System.out.println("Количество простых чисел: " + count);//вывод количества
        System.out.print(numbers);//вывод всех чисел

    }

    static boolean simple(int a) {//берем число i
        int p = 0;//переменная для определения результата
            if ((a % 2 == 0)||(a%10==5)) {//исключаем числа, которые заканчиваются на 5 и четные
            return false;
        }
        else {
            for (int j = 3; j <= Math.sqrt(a); j += 2) {//делим на все нечетные числа до корня из i
                if (a % j == 0) {// если хотя бы на одно число делится, то остановка цикла, переход к следующему числу
                    p += 1; break;
                }
            }
        }
        if (p > 0) {//если p = 0, то возвращаем true, число простое
            return false;
        } else return true;

    }

}

    
    

