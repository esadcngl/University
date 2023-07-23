public class Tree {
    String type;
    int height;

    public Tree (String type,int height){
        this.type = type;
        this.height = height;
    }
    public Tree (String type){
        this(type,2);
    }
    public Tree (int height){
        this("Oak",height);
    }
    public Tree(){
        this("Ladin",2);
    }
  public void getİnfo(){
      System.out.println(" Tree İnfo  ");
      System.out.println("****************");
      System.out.println("type is : "+ type);
      System.out.println("height is : "+ height);
      System.out.println("****************");
    }
     public Tree copy(){
          Tree copy = new Tree(type,height);
          return copy;
     }
     public Tree Grow(){
        height++;
        return this;
     }



}
