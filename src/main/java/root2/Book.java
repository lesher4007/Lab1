package root2;



import java.util.Arrays;

public class Book {
    private String name;
    private Publisher publisher;
    private int year;
    private String author;
    private String[] authors;

    public Book(String name, Publisher publisher, int year) {
        setName(name);
        setPublisher(publisher);
        setYear(year);
    }

    public Book(String name, Publisher publisher, int year, String author) {
        setName(name);
        setPublisher(publisher);
        setYear(year);
        setAuthor(author);
    }

    public Book(String name, Publisher publisher, int year, String[] authors) {
        setName(name);
        setPublisher(publisher);
        setYear(year);
        setAuthors(authors);
    }

    public String getName() {
        return name;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String[] getAuthors() {
        return authors;
    }

    public int quantity() {
        return authors.length;
    }

    public String select(int id) {
        if (id <= authors.length - 1 && id >= 0) {
            return authors[id];
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setPublisher(Publisher publisher) {
        if (publisher != null) {
            this.publisher = publisher;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setAuthor(String author) {
        if (author != null) {
            this.author = author;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setAuthors(String[] authors) {
        boolean y = false;
        for (String s : authors) {
            if (s == null) {
                y = true;
                break;
            }
        }
        if (y) {
            System.out.println("the array contains an empty link");
        } else {

            this.authors = authors;
        }
    }
    public void print(){
        if (getAuthor()==null && authors!=null) {
            System.out.println("Название книги: " + getName() + ", Автор книги: " + Arrays.toString(getAuthors()) + ", Издатель книги: " + getPublisher().getNamePublisher() +", Город издания: "+getPublisher().getCity()+ ", Год издания книги: " + getYear());
        }else if (getAuthor()!=null){
            System.out.println("Название книги: " + getName() + ", Автор книги: " + getAuthor() + ", Издатель книги: " + getPublisher().getNamePublisher() + ", Год издания книги: " + getYear()+", Город издания: "+getPublisher().getCity());
        }else {
            System.out.println("Название книги: " + getName() +  ", Издатель книги: " + getPublisher().getNamePublisher() + ", Год издания книги: " + getYear()+", Город издания: "+getPublisher().getCity());

        }

    }
    public static void printAll(Book[] array) {
        for (Book book : array) {
            book.print();

        }
    }
}
