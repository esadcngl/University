package exercises.chapter3.Engineers;

public abstract class Engineer extends Person {
   private boolean isHavaEngineeringDiploma;
   public Engineer(String name,boolean isHavaEngineeringDiploma){
     super(name);
     this.isHavaEngineeringDiploma = isHavaEngineeringDiploma;
   }

   public String getInfo(){
       return super.getInfo() + "\nEngineering Diploma: "+ isHavaEngineeringDiploma;
   }
}
