package dz2;

class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() { return  name; }

    public String getEmail() { return  email; }
    public void setEmail(String email) {this.email = email; }

    public char getGender(){return gender;}
    public  String toString(){
        return "Author{" +
                "name = " + name +
                ", email = " + email +
                ", gender ='" + gender +'\'' +
                '}';
    }
}
class TestAuthor {
    public TestAuthor() {
        Author k1 = new Author("shiii", "sshiiiissshh@7.com", 'M');
        System.out.println("name = "+ k1.getName());
        System.out.println("email = "+ k1.getEmail());
        System.out.println("gender = "+ k1.getGender());
    }
}
public class first{
    public static void main(String[] args) {
        new TestAuthor();
    }
}
