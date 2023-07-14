public class Owner {
    String name;
    int id;

    public Owner(String name , int id ){
        this.name = name;
        this.id = id;
    }
    public boolean equals(Object obj){
       Owner o = (Owner)obj;
       boolean b = false;
       if(id == o.id)
           b = true;
           return b;
    }

    public String toString(){
        return " name: "+ name + "\n id: "+ id;
    }

    public int getHashcode(){
        return name.hashCode();
    }

}
