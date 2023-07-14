public class Reader {
    String name;
    int age;
    char gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void read(Book book) {
        System.out.println(name + " is reading \"" + book.getTitle() + "\" by " + book.getAuthor().getName() + ".");
        for (int i = book.getCurrentPage(); i <= book.getPage(); i++) {
            book.setCurrentPage(i);
            System.out.println(name + " is reading page " + i + ".");
        }
        System.out.println(name + " has finished reading \"" + book.getTitle() + "\".");
    }




}
