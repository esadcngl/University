package Factory;

public class Person {
    private String name;
    private String surname;
    private String citizenID;
    private int birthdateDay;
    private int birthdateMonth;
    private int birtdhdateYear;
    private String email;
    private String phoneNumber;
    private String address;
    private String age;
    // Türkiyeye göre ayarladığım için sabit Telefon kodu +90 olarak belirliyorum.

    final private String PHONE_CODE = "+90";

    //İlkel kurucu oluşturuyorum.
    public Person(){

    }
    //Gelişmiş kurucu çağrısı ve this ile birlikte tanımladığım fieldler (özellikler)
    public Person(String name , String surname ,String citizenID , int birthdateDay ,
                  int birthdateMonth , int birtdhdateYear, String email , String phoneNumber,
                  String address , String age){
       this.name = name;
       this.surname = surname;
       this.address = address;
       this.citizenID = citizenID;
       this.birthdateDay = birthdateDay;
       this.birthdateMonth = birthdateMonth;
       this.birtdhdateYear = birtdhdateYear;
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.age = age;

    }
    // Getter ve Setter Metotlarının olduğu kısım
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
    }

    public int getBirthdateDay() {
        return birthdateDay;
    }

    public void setBirthdateDay(int birthdateDay) {
        this.birthdateDay = birthdateDay;
    }

    public int getBirthdateMonth() {
        return birthdateMonth;
    }

    public void setBirthdateMonth(int birthdateMonth) {
        this.birthdateMonth = birthdateMonth;
    }

    public int getBirtdhdateYear() {
        return birtdhdateYear;
    }

    public void setBirtdhdateYear(int birtdhdateYear) {
        this.birtdhdateYear = birtdhdateYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String department) {
        this.age = department;
    }

    // Javanın kendi sınıflarından biri olan object sınıfındaki toString methodunu
    // Override ediyoruz.
    // Genellikle Info almak için bu şekilde override edilir.
    public String toString(){
         return "İsim Soyisim: "+ getName() + " "+ getSurname()+"\nDoğum Tarihi: "+
                 getBirthdateDay()+"/"+getBirthdateMonth()+"/"+getBirtdhdateYear()+
                 "\nÇalıştığı bölüm: " + getAge()+
                 "\nTC Kimlik Numarası: "+ getCitizenID()+ "\nEmail Adresi:"+ getEmail()+
                 "\nAdresi: "+ getAddress() + "\nTelefon numarası: "+PHONE_CODE+getPhoneNumber();
    }










}
