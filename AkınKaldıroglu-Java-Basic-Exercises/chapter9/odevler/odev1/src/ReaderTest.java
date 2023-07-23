public class ReaderTest {
    public static void main(String[] args) {
        Reader reader1 = new Reader();
        reader1.setName("Esad Çıngılı");
        reader1.setAge(20);
        reader1.setGender('E');
        Author author1 = new Author();
        author1.setName("Peyami Safa");
        Book book1 = new Book();
        book1.setPage(112);
        book1.setHardCover(true);
        book1.setType("Roman");
        book1.setTitle("Dokuzuncu Hariciye Koğuşu");
        book1.setCurrentPage(0);
        book1.setAuthor(book1.getAuthor());
        book1.setAuthor(author1);

        reader1.read(book1);


        Reader reader2 = new Reader();
        reader2.setName("Şeyma Çıngılı");
        reader2.setAge(27);
        reader2.setGender('K');
        Author author2 = new Author();
        author2.name = "Doğan Cüceloğlu";
        Book book2 = new Book();
        book2.setAuthor(author2);
        book2.setTitle("İçimizdeki Çocuk");
        book2.setType("Psikoloji");
        book2.setPage(256);
        book2.setCurrentPage(26);
        book2.setHardCover(false);
        reader2.read(book2);

    }
}