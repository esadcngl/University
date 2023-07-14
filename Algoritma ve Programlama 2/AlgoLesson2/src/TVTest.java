public class TVTest {
    public static void main(String[] args) {
        TV television1 = new TV();
        television1.getInfo();
        System.out.println();
        TV television2 = new TV(20,7,true);
        television2.getInfo();
        System.out.println();

        television1.open();
        television1.setNewChannel(14);
        television1.volumeUp();
        television1.volumeUp();
        television1.volumeUp();
        television1.volumeUp();
        television1.volumeUp();
        television1.volumeUp();
        television1.volumeUp();
        television1.getInfo();
    }
}