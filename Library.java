/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;

    public Library() {
      super("<Name Unknown>", "<Address Unknown>", 1);
      System.out.println("You have built a library: 📖");
      this.collection = new Hashtable<>();
    }
//adding a book to the library
    public void addTitle(String title) {
      collection.put(title, true);
    }
//removing book from the library
    public String removeTitle(String title){
      if (collection.containsKey(title)) {
        collection.remove(title);
        return title;
      }
      return null;
    }
//checking out a book (meaning it is removed from the library)
    public void checkOut(String title) {
      if (collection.containsKey(title)) {
        collection.put(title, false);
      }
    }
    public void returnBook(String title) {
      if (collection.containsKey(title)) {
        collection.put(title, true);
      }
    }
//returns whether a book with the given title is in the collection.
    public boolean containsTitle(String title) {
      return collection.containsKey(title);
    }
//returns whether or not a book with the given title is available for rent 
    public boolean isAvailable(String title) {
      return collection.getOrDefault(title, false);
    }
//print all the books that are currently in the library
    public void printCollection() {
      System.out.println("Library Collection:");
      for (String title : collection.keySet()) {
        System.out.println(title + " - " + (collection.get(title) ? "Available" : "Check Out"));
      }
    }
    public static void main(String[] args) {
      Library myLibrary = new Library();
        myLibrary.addTitle("The Great Gatsby");
        myLibrary.addTitle("1984");
        myLibrary.addTitle("Pride and Prejudice");
        myLibrary.printCollection();
        System.out.println("Is '1984' available? " + myLibrary.isAvailable("1984"));
        myLibrary.checkOut("1984");
        System.out.println("Is '1984' available after checkout? " + myLibrary.isAvailable("1984"));
        myLibrary.returnBook("1984");
        System.out.println("Is '1984' available after return? " + myLibrary.isAvailable("1984"));
        myLibrary.removeTitle("Pride and Prejudice");
        myLibrary.printCollection();
    }
}