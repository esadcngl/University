package Factory;

public interface Decision {
    // Karar sınıfı oluşturdum ve buradaki metotları Management classında implement edeceğiz.
    // Bu yapıyı böyle kullanmam aslında polimorfizme yardımcı olan bir hareket.
    void fire(Employee employee);
    void hire(Person person);

}
