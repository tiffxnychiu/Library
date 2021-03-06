/** A Book object -- extending from the abstract class Item -- with a title, creator,
 * language, release date, loan period, serial number, number of pages, and ISBN.
 * 
 * 2019-01-10
 */
class Book extends Item {

    // state variables
  int numOfPages;
  
  /** Creates a Book object with a title, creator, language, release date, loan period, serial number, length, genre and availability.
   * @param title 
   * @param creator 
   * @param language 
   * @param releaseDate 
   * @param loanPeriod 
   * @param serialNum
   * @param length
   * @param genre
   * @param availability 
   */
  public Book (String title, Person creator, String language, Date releaseDate, int loanPeriod, int serialNum, int length, String genre, boolean available) {
    super(title, creator, language, releaseDate, loanPeriod, serialNum, length, genre, available);
    this.numOfPages = length;
  }

  /** Creates a Book with a title, creator, and serial number. 
   * @param title 
   * @param creator  
   * @param serialNum
   */
  public Book (String title, Person creator, int serialNum) {
    super(title, creator, serialNum);
  }   
  
  /** Sets the number of pages in the book
   * @param length is the number of pages
   */
  @Override
  public void setLength(int length) {
    this.numOfPages = length;
  }

  /** Gets the type of the object
   * @return Book
   */
  @Override
  public String getType() {
    return "Book";
  }

  // end of Book class
}
