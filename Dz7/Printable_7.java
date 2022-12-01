package Dz7;

public interface Printable_7 {
    void print();
}
class Book implements Printable_7{
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
        System.out.println("Книга " + name + " ( Автор "+author+" ), была издана в " + year + " году ");
    }
}

class Magazine implements Printable_7 {
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

    public void print() {
        System.out.println("Журнал " + name);
    }

    static void printMagazines(Printable_7[] printable) {
        for (Printable_7 p : printable) {
            if (p instanceof Magazine)
                p.print();
        }
    }
}
class Tester{
    public static void main(String[] args) {
        Printable_7 [] copy = new Printable_7 [3];
        copy[0] = new Book(1862, "Отцы и дети", "И. Тургенев");
        copy[1] = new Magazine("Вести");
        copy[2] = new Magazine("Веста");
        Magazine.printMagazines(copy);
    }
}
