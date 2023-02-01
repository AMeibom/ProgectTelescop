public class Main{
    // задание полей
    static float apartmentPrice = 14_000; // астрономический телескоп
    static int account = 1_000; // счёт пользователя
    static float wage = 2_500; // степендия в месяц
    //int percentFree = 50; // доля заработной платы на любые траты
    static float percent = 5; // годовая процентная ставка за вклад
    //static float[] monthlyPayments = new float[10]; // создание массива накопления в банке
    static float z;

    static public float sum() {
    return (account+wage)*percent/100/12+(account+wage);
    }

    static public float countMonth() {
        z=sum();
        int count = 0;

            while (z<=apartmentPrice) {
                count++;
                System.out.println ("Накопления в банке "+count+" месяц =" +z+ " монет");
                z = (z + wage)*percent/100/12 + (z + wage);
                 }
            if (z>apartmentPrice) {
                count++;
                System.out.println (count+ " месяц. Накопленна достаточная сумма для покупки ТЕЛЕСКОПА " +z+ " монет");}

            return count;
        }


    public static void main(String[] args){

        System.out.println ("На телескоп придется копить "+ countMonth() + " месяцев");

        /* String monthlyPaymentsList = "";
        for(float list : monthlyPayments) {
            if (list > 0) {
                monthlyPaymentsList = monthlyPaymentsList + Float.toString(list) + " монет; ";
            } else {
                break;
            }
        }
        // 3) вывод выписки ежемесячных выплат по ипотеке
      //  System.out.println("Eжемесячные накопления; " + monthlyPaymentsList);*/
    }
}