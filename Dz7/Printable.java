package Dz7;

public interface Printable {
    void print();
}
class Book implements Printable{
    int year;
    String name;
    String author;

    public Book(int year, String name, String author) {
        this.year = year;
        this.name = name;
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void print(){
        System.out.printf("Книга " + name + " ( Автор "+author+" ), была издана в " + year + " году ");
    }
}

class Magazine implements Printable{
    String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Журнал "+name);
    }
}
