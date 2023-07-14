package exercises.chapter3.Engineers;

public class ElectricalEngineer extends Engineer implements InstrumentPlayer,Blogger{
    private final String branch = "Electrical Engineering";
    ElectricalEngineer(String name, boolean isHaveDiploma){
        super(name,isHaveDiploma);
    }
    public String getInfo(){
        return super.getInfo() + "\nBranch: "+branch;
    }

    @Override
    public void playInstrument(String Instrument) {
        System.out.println(Instrument + "playing...");
    }

    @Override
    public void writeBlog() {
        System.out.println("Writing Blog...");
    }
}
