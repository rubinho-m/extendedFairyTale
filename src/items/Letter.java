package items;

public class Letter {
    private final String author;

    public Letter(String author) {
        this.author = author;
        System.out.println("Письмо написано. Подпись - " + author);
    }

    public String getAuthor() {
        return author;
    }
}
