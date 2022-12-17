package lists2;

public class Task10 {
    public static void main(String[] args)
    {
        Task10 sList = new Task10();

        // Добавляем объекты из поговорки It’s no use crying over spilled milk

        sList.addobject("It’s");
        sList.addobject("no");
        sList.addobject("use");
        sList.addobject("crying");
        sList.addobject("over");
        sList.addobject("spilled");
        sList.addobject("milk");

        System.out.println("initial list: ");
        sList.output();
        sList.sortList();

        System.out.println("Sorted list: ");
        sList.output();
    }

    // Определим начало и конец списка
    public Node head = null;
    public Node tail = null;

    class Node {
        Node next;
        String data;
        public Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }
    // addobject() добавит новый объект к списку
    public void addobject(String data)
    {
        // Создает новую ноду
        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
            tail = newNode;
        }
        else {

            tail.next = newNode;
            tail = newNode;
        }
    }
    // sortList() будет сортировать
    public void sortList()
    {
        // current указывает на head
        Node current = head, index = null;
        String temp;
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                // Node index указывает на следующий элт
                index = current.next;

                while (index != null) {
                    // Если current меньше, чем index, то они поменяются местами
                    if (current.data.charAt(0) < index.data.charAt(0)) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    // output() выводит список
    public void output()
    {
        // Node current - начальный элемент
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            // вывод каждого элемента
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println('\n');
    }
}
