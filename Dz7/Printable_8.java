package Dz7;

public interface Printable_8 {
    void print();
}
class Books implements Printable_8{
    int year;
    String name;
    String author;

    public Books(int year, String name, String author) {
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
        System.out.println("Книга " + name + " ( Автор "+author+" ), была издана в " + year + " году ");
    }
    public static void printBooks(Printable_8 [] printable) {
        for (Printable_8 p : printable) {
            if (p instanceof Books)
                p.print();
        }
    }
}

class Magazines implements Printable_8 {
    String name;

    public Magazines(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Журнал " + name);
    }
}

class Testers{
    public static void main(String[] args) {
        Printable_8 [] prin = new Printable_8 [3];
        prin[0] = new Books(1862, "Отцы и дети", "И. Тургенев");
        prin[1] = new Magazines("Вести");
        prin[2] = new Magazines("Веста");
        Books.printBooks(prin);
    }
}
