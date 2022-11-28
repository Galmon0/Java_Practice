package Dz6;

interface Printable {
    void print();
}
class Shop implements Printable{
    String header;

    public Shop(String header) {
        this.header = header;
    }


    public void print(){
        System.out.println("Новый магазин "+ header);
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}
class Book implements Printable{
    String header;

    public Book(String header) {
        this.header = header;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
    public void print(){
        System.out.println("Новое издание "+header);
    }
}
class Tester2{
    public static void main(String[] args) {
        Shop s1 = new Shop("Sun Light");
        Shop s2 = new Shop("Лента");
        Book b1 = new Book("Острые козырьки");
        Book b2 = new Book("Шерлок Холмс");
        s1.print();
        s2.print();
        b1.print();
        b2.print();

    }
}
