import java.util.Scanner;
class Publisher 
{
    String name;
    public void getPublisherDetails() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Publisher Name: ");
        name = scanner.nextLine();
    }
}
class Book extends Publisher 
{
    String title;
    int year;
    public void getBookDetails() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        title = scanner.nextLine();
        System.out.print("Enter Publication Year: ");
        year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
    }
    public void displayBookDetails() 
    {
        System.out.println("Publisher: " + name);
        System.out.println("Title: " + title);
        System.out.println("Year of Publication: " + year);
    }
}
class Literature extends Book 
{
    String genre;
    public void getLiteratureDetails() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Genreration: ");
        genre = scanner.nextLine();
    }
    @Override
    public void displayBookDetails() 
    {
        super.displayBookDetails();
        System.out.println("Genre: " + genre);
    }
}
class Fiction extends Book 
{
    String theme;
    public void getFictionDetails() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Theme: ");
        theme = scanner.nextLine();
    }
    @Override
    public void displayBookDetails() 
    {
        super.displayBookDetails();
        System.out.println("Theme: " + theme);
    }
}
public class HeirInheritance 
{
    public static void main(String[] args) 
    {
        Literature litBook = new Literature ();
        litBook.getPublisherDetails ();
        litBook.getBookDetails ();
        litBook.getLiteratureDetails ();
        litBook.displayBookDetails ();
        Fiction ficBook = new Fiction();
        ficBook.getPublisherDetails ();
        ficBook.getBookDetails ();
        ficBook.getFictionDetails ();
        ficBook.displayBookDetails();
    }
}
