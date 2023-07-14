public class YanaKaydırma {
    public static void main(String[] args) {
        System.out.println(donustur2(4,true,2));

    }
    public static int donustur(int sayi, boolean yon,int adet){
        if(yon){
            for (int i = 0; i<adet; i++){
                sayi=sayi/2;
            }
        }else{
            for ( int i = 0; i<adet; i++){
                sayi = sayi*2;
            }
        }
        return sayi;
    }

    public static int donustur2(int sayi , boolean yon , int adet){
        if (yon) {
            sayi = sayi >> adet;
        }else{
            sayi = sayi << adet;
        }
         return sayi;
    }


}
