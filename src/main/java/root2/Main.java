package root2;

public class Main {
    public static void main(String[] args) {
        Publisher prospect = new Publisher();
        prospect.setNamePublisher("Проспект");
        prospect.setCity("Москва");
        Publisher piter = new Publisher();
        piter.setNamePublisher("Питер");
        piter.setCity("Санкт-Петербург");
        Publisher bchv = new Publisher();
        bchv.setNamePublisher("БХВ");
        bchv.setCity("Санкт-Петебург");
        Publisher dialectika = new Publisher();
        dialectika.setNamePublisher("Диалектика");
        dialectika.setCity("Киев");

        String[] arrayAuthors1 = new String[]{"Седжвик Роберт","Уэйн Кевин"};
        Publisher[] publishers = new Publisher[]{prospect,piter,bchv,dialectika};

        Book book1 = new Book("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных",piter,2018,arrayAuthors1);
        Book book2 = new Book("Разработка требований к программному обеспечению. 3-е издание, дополненное",bchv,2019,"Вигерс Карл");
        Book book3 = new Book("Java. Полное руководство, 10-е издание",dialectika,2018,"Шилдт Герберт");
        Book book4 = new Book("C/C++. Процедурное программирование",bchv,2017,"Полубенцева М.И.");
        Book book5 = new Book(" Конституция РФ",prospect,2020);

        Book[] arrayBook = new Book[]{book1,book2,book3,book4,book5};




        Book.printAll(arrayBook);

        for (int i = 0; i < publishers.length; i++) {
            if(publishers[i].getNamePublisher().equals("Проспект")){
                if (!publishers[i].getCity().equals("Москва")){
                    System.out.println("Неправильно написан город "+ publishers[i].getCity()+ ". Вывод изменился у издателя "+ publishers[i].getNamePublisher());
                    publishers[i].setCity("Москва");
                }
            }
            if(publishers[i].getNamePublisher().equals("Питер")){
                if (!publishers[i].getCity().equals("Санкт-Петербург")){
                    System.out.println("Неправильно написан город "+ publishers[i].getCity()+ ". Вывод изменился у издателя "+ publishers[i].getNamePublisher());
                    publishers[i].setCity("Санкт-Петербург");
                }
            }
            if(publishers[i].getNamePublisher().equals("БХВ")){
                if (!publishers[i].getCity().equals("Санкт-Петербург")){
                    System.out.println("Неправильно написан город "+ publishers[i].getCity()+ ". Вывод изменился у издателя "+ publishers[i].getNamePublisher());
                    publishers[i].setCity("Санкт-Петербург");
                }
            }
            if(publishers[i].getNamePublisher().equals("Диалектика")){
                if (!publishers[i].getCity().equals("Киев")){
                    System.out.println("Неправильно написан город "+ publishers[i].getCity()+ ". Вывод изменился у издателя "+ publishers[i].getNamePublisher());
                    publishers[i].setCity("Киев");
                }
            }
        }
        Book.printAll(arrayBook);



    }
}
