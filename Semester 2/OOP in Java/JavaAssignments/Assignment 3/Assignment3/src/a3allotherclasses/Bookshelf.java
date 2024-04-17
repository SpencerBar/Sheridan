package a3allotherclasses;

public class Bookshelf {
    private Book[] books = new Book[10];

    public void addBookToBookshelf(Book book){
        if (this.howManyBooks() == 10){
            System.out.println("Cannot add a book, bookshelf full!");
        }
        else{
            this.books[this.howManyBooks()] = book;
        }
    }
    public void displayBooks(){
        String booktitles = "Displaying Bookshelf: ";
        if(this.howManyBooks() == 0){
            System.out.println("Displaying Bookshelf: Bookshelf is empty");
        }
        else{
            
            for (Book book : books){
                if (book != null){
                    
                    booktitles = booktitles.concat(book.getTitle()).concat(", ");
                }
            }
        }
        System.out.println(booktitles);
    }
    public int howManyBooks(){
        int count=0;
        for(Book book:books){
            if(book !=null){
                count++;
            }
        }
        return count;
    }
    public Book retrieveBookFromBookshelf(String sTitle){
        for(int i =0;i<books.length; i++)
        {
            if (books[i] !=null && books[i].getTitle().equals(sTitle)){
                Book tempbook = books[i];
                books[i] = null;
                return tempbook;
            }    
    
        }
        return null;
    }
    
}