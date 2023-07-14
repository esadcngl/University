import java.util.Random;
public class randomTest {
    public static void main(String[] args) {
          Random random1 = new Random();
        System.out.println(random1.nextInt(12));
        System.out.println(random1.nextFloat(14f));
        System.out.println(random1.nextBoolean());

        Random random2 = new Random(4);
        System.out.print("Rastgele gelecek 4 haneli 5 sayı: ");
        for(int i =0; i<5; i++){
            System.out.print(random2.nextInt(9999) + " ");
        }
        Random random3 = new Random(4);
        System.out.print("\nRastgele gelecek 4 haneli 5 sayı: ");
        for(int i =0; i<5; i++){
            System.out.print(random2.nextInt(9999) + " ");
        }

    }
}