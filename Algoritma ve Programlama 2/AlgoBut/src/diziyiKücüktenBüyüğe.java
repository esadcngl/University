public class diziyiKücüktenBüyüğe {
    public static void main(String[] args) {
        int dizi[] ={16,23,546,232,123,2134,32,12,86,45,76,343,879,46,674,83,47,18,87,67};
        int temp;
        for(int i=0;i<dizi.length-1;i++){
            for(int j =i+1;j<dizi.length;j++){
                if(dizi[i]>dizi[j]){
                    temp = dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=temp;
                }
            }
        }
        for(int i =0;i<20;i++){
            System.out.print(dizi[i]+" ");
        }
    }
}
