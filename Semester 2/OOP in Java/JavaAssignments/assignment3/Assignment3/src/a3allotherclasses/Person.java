package a3allotherclasses;

public class Person {
    //person is composed of a heart (composition)
    //a persona is associated with a book through aggregation(aggretation)
    //person is dependant on a bookshelf (dependency)

    private String name;
    private Book book;
    private Heart heart = new Heart(44, HeartBeat.PITTERPATTER);

    public Person(String name, Book book){
       this.name = name;
       this.book = book;
    }

    public String getName(){
        return this.name;
    }
    
    public String whatBookDoIHave(){
        if(book != null)
        {
            return name +" has the book: " + book.getTitle();
        }
        else{
            return name + " has no book";
        }
    }
    public void retrieveBookFromBookshelf(String title, Bookshelf bookshelf){
        if(book !=null){
            System.out.println(this.name + " already has a book!");
        }
        else{
            this.book = bookshelf.retrieveBookFromBookshelf(title);
        }
    }
    public void putBookOnBookshelf(Bookshelf bookshelf){
        if(this.book != null){
            bookshelf.addBookToBookshelf(this.book);
            this.book= null;
        }
        else{
            System.out.println(name + " has no book!");
        }
    }
    public void makeHeartPump(){
        this.heart.oneMinute();
    }
    
}
