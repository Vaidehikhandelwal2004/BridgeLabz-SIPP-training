public class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}

 class Main {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Wings of Fire", 1999, "A.P.J. Abdul Kalam", "Former President of India and a scientist.");
        authors[1] = new Author("The Guide", 1958, "R. K. Narayan", "Famous Indian writer known for Malgudi Days.");

        for (int i = 0; i < authors.length; i++) {
            authors[i].displayInfo();
            System.out.println();
        }
    }
}
