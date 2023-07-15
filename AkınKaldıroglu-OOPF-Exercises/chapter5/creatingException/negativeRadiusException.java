package exercises.chapter5.creatingException;

public class negativeRadiusException extends Exception{
    double argument;
    negativeRadiusException(String message ,double argument){
      super(message);
      this.argument = argument;
    }
    public double getArgument() {
        return argument;
    }
}
