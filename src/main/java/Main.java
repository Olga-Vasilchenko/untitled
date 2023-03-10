import java.net.StandardSocketOptions;
import java.util.Random;

public class Main {
    // точка входа
    // int i = 5; (это не код, а объявление переменной и ее инициализация)
    // типы данных:

    // примитивные:
    static int i; // 32bit // объявление переменной без инициализации
    static long l; // 64bit
    byte b; // 8bit
    short sh; // 16bit (65535)
    float f; // 32bit floating poin (дробная)
    double d; // 64bit (дробная)
    boolean aBoolean; // 1bit (хранится или истина или ложь) по умолчанию falce, если не проинициализировать
    char aChar; // хранит индекс буквы в таблице букв (цифра)
    // char aChar = 'd' или можно записать без ковычек 12356; // 16bit без знака
    String string = "Привет, мир!";

    // объявление и инициализация любого ссылочного типа
// тип   назв.переменной  выделение памяти
    String tmpS = new String("Привет, мир!" );
                      // конструктор называется как класс
    // точка входа  (сигнатура) метод, как возвращается и какие параметры принимает

//    public static void main(String[] args) { // код пишется в теле методов
//        Main main = new Main(); // объект main экземпляр класса Main
//    }

// publik - модификатор поля, видно снаружи метода
    // private - поля не видны снаружи
//    private int getInt(String str){
//        int i;
//        return Integer.parseInt(str); // parseInt преобразовать строку в целое число
//    }
//
//    public void print(String str){
//        System.out.println(str);
//    }
// массивы
    static int[] ints = new int[10]; // длина массива
    // static int[] ints = new int[Integer.MAX_VALUE]; // длина массива 8 ГБ не запускает, не хватает памяти
    // static int[] ints = new int[Short.MAX_VALUE]; // 16Битный

    public static void main(String[] args){
        ints[6] = 0;
        int[] tmp = new int[ints.length * 2 + 1]; // расширение первоначального массива (присваиваем ints = tmp)
        Random random = new Random();
//
        //циклы
        for (int j = 0; j < ints.length; j++) {
            tmp[j]= ints[j] + random.nextInt(100); // кидалка случайных чисел
        }
//        tmp[15] = 5; если нужно еще добавить
        ints = tmp;

        if (i == l){
            getInt(String.valueOf(12));
        }
        else if(l > i){
            getInt(String.valueOf(13));
        }
        else{
            getInt(String.valueOf(15));
        }

//        System.out.println(Integer.toBinaryString(51)); // преобразование в двоичное
//        System.out.println(Integer.max(512, 56)); // возвращает максимальное
//        System.out.println(Integer.parseInt(str)); // превращает строку в инт
          System.out.println(Integer.toBinaryString(158));
          System.out.println(
                Integer.toBinaryString(158).repeat(6) // повтор строки 6 раз .lengts - возвращает длину строки
        );

    }
    //    public static void main(String[] args) {
//        getInt("45");
//    }
    static int getInt(String strToInt){
        int i = 0;
        return Integer.parseInt(strToInt);
    }
    static void print(String str){
        System.out.println(str);
    }
}
