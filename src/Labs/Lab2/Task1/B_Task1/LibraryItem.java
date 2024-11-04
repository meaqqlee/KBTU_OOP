package Labs.Lab2.Task1.B_Task1;

public abstract class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;

    LibraryItem(String title,
                String author,
                int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void SetAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String ToString() {
        return "title: " + title +
                ", author: " + author +
                ", publicationYear: " + publicationYear;
    }
}
