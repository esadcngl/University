public class TV {
    int channel;
    int volume;
    boolean isOpen;

    public TV(int channel, int volume, boolean isOpen) {
        this.channel = channel;
        this.volume = volume;
        this.isOpen = isOpen;
    }

    //default
    public TV() {
        this(1, 1, false);
    }

    public void open() {
        this.isOpen = true;
    }

    public void close() {
        this.isOpen = false;
    }

    public void setNewChannel(int NewChannel) {
        if(isOpen && NewChannel <=120 && NewChannel >= 1){
            this.channel = NewChannel;
        }else{
            System.out.println("The number of channels must be between 120 and 1");
            System.out.println("Please enter a valid channel number");
        }
    }
    public void setNewVolume(int newVolume){
        if(isOpen && newVolume >=1 && newVolume <=7){
            this.volume = newVolume;
        }else{
            System.out.println("Please enter valid number");
        }
     }
     public void channelUp(){
        if(isOpen && this.channel<120)
        this.channel++;
     }
     public void channelDown(){
         if(isOpen && this.channel>0)
        this.channel--;
     }
     public void volumeUp(){
         if(isOpen && this.volume<7)
        this.volume++;
     }
     public void volumeDown(){
         if(isOpen && this.volume>1)
        this.volume--;
     }

     public void getInfo(){
         System.out.println("Is TV open ?: " + this.isOpen);
         System.out.println("Channel number: "+this.channel);
         System.out.println("Volume: " + this.volume);
    }



}
