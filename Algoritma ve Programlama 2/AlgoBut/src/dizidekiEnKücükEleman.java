public class dizidekiEnKücükEleman {
    public static void main(String[] args) {
        int dizi[]={23,87,64,18,17,97,34,53,42,15};
        int enKucuk = dizi[0];
        for (int i =1;i<dizi.length;i++){
            if(enKucuk>dizi[i]){
                enKucuk = dizi[i];
            }

        }
        System.out.println(enKucuk);
    }
}
