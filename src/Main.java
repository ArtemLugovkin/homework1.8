public class Main {


    public static void main(String[] args) {

        System.out.println(" Задание 1");

    int salary = 15000;
    int total = 0;
    for ( int i = 0 ; total < 2_459_000 ; i++  ) {
        total = total + total / 100;
        total = total + salary;
            System.out.println( "Месяц " + i + " , сумма накоплений равна " + total + " рублей.");
        }

        System.out.println( " Задание 2.");

    int a = 0;
    while (  a <= 9 ) {
        a++;
        System.out.print(a + " ");
    }
        System.out.println( " ");

    for ( int b = 10  ; b >= 1 ; b--) {
            System.out.print(b + " ");
        }
        System.out.println(" ");

        System.out.println(" Задание 3.");

    int populationY = 12_000_000;
    double birthRateOn1000 = (double) 17 / 1000; // годовалая рождаемость на 1000
    double mortalityOn1000 = (double)  8 / 1000; // годовая смертность на 1000
    for ( int year = 1; year <= 10; year ++ ) {
        populationY =  populationY + (int) (populationY * birthRateOn1000) - (int) (populationY * mortalityOn1000);
        System.out.println( "Год " + year + " численность населения состовляет " + populationY);
    }

        System.out.println(" Задание 4.");

        int investment = 15_000;
        for ( int i = 0 ; total <= 12_000_000 ; i ++) {
            int investment7 = investment / 100 * 7;
            total = total + investment7;
            System.out.println(total + " накопления, за " + i + " месяц.");
        }

        System.out.println(" Задание 5.");

        int investments = 15_000;
        int i = 0;
        while ( total < 12_000_000 ) {
            int investment7 = investments / 100 * 7;
            total = total + investment7 + investments;
            System.out.println( total + " накопления, за " + i + " полгода.");
            i = i * 6;
        }

        System.out.println(" Задание 6.");

        int september = 31;
        int friday;
        int week = 7;
        for ( friday = 2; friday <= 31; friday ++) {
            friday = friday + 7;
                System.out.println("Сегодня пятница" + friday + " -е число, необходимо подготовить отчет. ");

        }

        System.out.println(" Задание 7.");

        for ( int year = 2022 - 200; year < 2022+ 79; year = year + 79) {
            if ( year % 79 == 0 ){
                System.out.println( year + " в этом году пролетит комета.");
            }
        }

        System.out.println(" Задание 8.");

        int fib1 = 0;
        int fib2 = 1;
        System.out.print(fib1 + " ");
        System.out.print(fib2 + " ");
        while (i<8) {
            int tmp = fib2;
            fib2 = fib1 + fib2;
            fib1 = tmp;
            i++;
            System.out.println(fib2 + " ");
        }










        }
}