package a3startclass;
import a3allotherclasses.*;
public class Start
{
   public static void main (String[] args) throws Exception
   {
      Bookshelf shelf = new Bookshelf();

      System.out.println("Instantiating 3 Person objects and giving each one a Book object");

      Person p1 = new Person("Rich", new Book("Harry Potter", Genre.ADVENTURE));
      Person p2 = new Person("Fred", new Book("Funniest Jokes", Genre.HUMOUR));
      Person p3 = new Person("Barney", new Book("Learning Java", Genre.EDUCATIONAL));

      System.out.println("make any one of the Person objects pump their heart for 1 minute");
      p1.makeHeartPump();

      System.out.println("There are " + shelf.howManyBooks() + " books on the bookshelf");
      shelf.displayBooks();
      System.out.println(p1.whatBookDoIHave());
      System.out.println(p1.getName() + " is putting the book on the bookshelf");
      p1.putBookOnBookshelf(shelf);
      System.out.println(p1.whatBookDoIHave());
      shelf.displayBooks();
      System.out.println(p2.whatBookDoIHave());
      System.out.println(p3.whatBookDoIHave());
      System.out.println(p2.getName() + " and " + p3.getName() + " are putting their books on the shelf");
      p2.putBookOnBookshelf(shelf);
      p3.putBookOnBookshelf(shelf);
      System.out.println("There are " + shelf.howManyBooks() + " books on the bookshelf");
      System.out.println(p1.whatBookDoIHave());
      System.out.println(p2.whatBookDoIHave());
      System.out.println(p3.whatBookDoIHave());
      shelf.displayBooks();
      System.out.println(p2.getName() + " is taking the Harry Potter book from the shelf");
      p2.retrieveBookFromBookshelf("Harry Potter", shelf);
      System.out.println(p2.whatBookDoIHave());
      shelf.displayBooks();
   }
}
