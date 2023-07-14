import java.util.Date;
public class dateTest {
    public static void main(String[] args) {
        //import yapmazsan uzun kullanım gör diye
        java.util.Date date2 = new java.util.Date();
        //import yaparsan aşadaki gibi kolayca yapabilirsin.
        Date date1 = new Date();
        System.out.println("The elapsed time since Jan 1, 1970 is "+ date1.getTime()+" milliseconds");
        System.out.println(date1.getTime()/1000 + " seconds  ");
        System.out.println(date1.getTime()/60000 + " minutes ");
        System.out.println(date1.getTime()/3600000+ "hours");
        System.out.println(date1.getTime()/86400000 + "days");

        System.out.println(date1.toString());

    }
}