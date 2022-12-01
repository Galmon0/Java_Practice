package Dz7;

interface Strings {
    int counter();

}
class ProcessStrings implements Strings{
    String str;

    public ProcessStrings(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    public int counter(){
        return str.length();
    }
}
class Tester3{
    public static void main(String[] args) {
        ProcessStrings ps1 = new ProcessStrings("Proverka kol-vo siymbol");
        ProcessStrings ps2 = new ProcessStrings("train, airplane, car, ship, shop");
        System.out.println("В строке: "+ps1.str+"; Столько слов - "+ps1.counter());
        System.out.println("В строке: "+ps2.str+"; Столько слов - "+ps2.counter());
    }
}