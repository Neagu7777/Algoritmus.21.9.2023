public class Main {
    public static void main(String[] args) {

            MyArrayList myArrayList = new MyArrayList();
            myArrayList.add(1);
            myArrayList.add(2);
            myArrayList.add(4);
            myArrayList.add(3);
            myArrayList.print(); // Вывод: 1 2 4 3

            myArrayList.add(2, 5); // Вставляем 5 на позицию 2
            myArrayList.print(); // Вывод: 1 2 5 4 3

            myArrayList.remove(3); // Удаляем элемент на позиции 3
            myArrayList.print(); // Вывод: 1 2 5 3

            System.out.println("Размер: " + myArrayList.size()); // Вывод: Размер: 4
        }
    }


