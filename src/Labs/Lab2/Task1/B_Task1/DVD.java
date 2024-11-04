package Labs.Lab2.Task1.B_Task1;

public class DVD extends LibraryItem {
    private String genre;
    private String model;
    private static int total;

    DVD(String title,
        String author,
        int publicationYear,
        String genre,
        String model) {
            super(title, author, publicationYear);
            this.genre = genre;
            this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getGenre() {
        return genre;
    }

    public int getId() {
        return total;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void playCd() {
        System.out.println("DVD is playing :3");
    }

    public String toString() {
        return super.ToString() +
                ", genre: " + genre +
                ", model: " + model +
                ", id: " + getId();
    }
}
