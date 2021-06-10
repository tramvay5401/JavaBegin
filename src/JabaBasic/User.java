package JabaBasic;

public class User {
    private int age;
    private String name;
    private String passportData;

    public User(int age, String name,String passportData){
        this.age = age;
        this.name = name;
        this.passportData = passportData;

    }
    public User(int age, String name){
        this.age = age;
        this.name = name;

    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
