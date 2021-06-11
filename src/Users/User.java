package Users;

public class User {
    private  int    ID;
    private  int    age;
    private String name;
    private String mail;
    private String password;
    private String gender;
    private String bloodType;

    public User(int ID, String name, String mail, String password, int age, String gender, String bloodType) {
        this.ID = ID;
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.bloodType = bloodType;
    }

}
