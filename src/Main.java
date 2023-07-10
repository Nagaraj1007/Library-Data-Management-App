// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book object = new Book();
        Magazine newObject =new Magazine();
        object.id = 1;
        object.setTitle("Love and other words");
        object.author = "Christina Lauren";
        object.year = 2018;
        newObject.issue = 404;
        System.out.println(object.id);
        System.out.println(object.getTitle());
        System.out.println(object.author);
        System.out.println(object.year);
        System.out.println(newObject.issue);
    }
}