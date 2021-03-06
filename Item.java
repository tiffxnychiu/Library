/** An abstract Item object with a title, creator, language, release date, loan period,
 * serial number, and length.
 * 
 * 2019-01-10
 */
abstract class Item  {

    // state variables
  String title;
  Person creator;
  String language;
  Date releaseDate;
  int loanPeriod;
  int serialNum;
  int length;
  boolean available;
  String genre;

  /** This is the main constructor; it creates an Item with a title, creator, language, release date, loan period, serial number, length, and genre.
   * @param title
   * @param creator
   * @param language
   * @param releaseDate
   * @param loanPeriod
   * @param serialNum
   * @param length
   * @param genre
   */
  public Item (String title, Person creator, String language, Date releaseDate, int loanPeriod, int serialNum, int length, String genre, boolean available) {
    this.title = title;
    this.creator = creator;
    this.language = language;
    this.releaseDate = releaseDate;
    this.loanPeriod = loanPeriod;
    this.serialNum = serialNum;
    this.length = length;
    this.genre = genre;
    this.available = available;
  }

  /** This is the overloaded constructor; it creates an Item with a title, creator, and serial number.
   * @param title
   * @param creator
   * @param serialNum
   */
  public Item (String title, Person creator, int serialNum) {
    this.title = title;
    this.creator = creator;
    this.serialNum = serialNum;
    this.available = true;
  }

  /** Sets the availability of the item.
   * @param availability
   */
  public void setAvailability(boolean availability) {
    this.available = availability;
  }

  /** Sets the item's language 
   * @param lang
   */
  public void setLanguge(String lang) {
    this.language = lang;
  }

  /** Sets the item's genre 
   * @param genre  
   */
  public void setGenre(String genre) {
    this.genre = genre;
  }

  /** Sets the item's release date 
   * @param date
   */
  public void setReleaseDate(Date date) {
    this.releaseDate = date;
  }

  /** Sets the item's release date 
   * @param month
   * @param day
   * @param year
   */
  public void setReleaseDate(int month, int day, int year) {
    this.releaseDate = new Date (month, day, year);
  }

  /** Sets the item's loan period 
   * @param loanPeriod
   */
  public void setLoanPeriod(int loanPeriod) {
    this.loanPeriod = loanPeriod;
  }

  /** Sets the item's length 
   * @param length
   */
  public void setLength(int length) {
    this.length = length;
  }

  /** Gets the title of the item
   * @return title
   */
  public String getTitle() {
    return this.title;
  }

  /** Gets the language of the item 
   * @return language
   */
  public String getLanguage() {
    if (this.language != null) {
      return this.language;
    }
    return "n/a";
  }

  /** Gets the release date of the item 
   * @return releaseDate
   */
  public Date getReleaseDate() {
    // add some other return statement if there's no release date
      return this.releaseDate;
  }

  /** Gets the loan period of the item 
   * @return loanPeriod
   */
  public int getLoanPeriod() {
    if (this.loanPeriod > 0) {
      return this.loanPeriod;
    }
    else {
      return -1;
    }
  }

  /** Gets the serial number of the item 
   * @return serialNum
   */
  public int getSerialNum() {
    return this.serialNum;
  }

  /** Gets the creator of the item 
   * @return creator
   */
  public Person getCreator() {
    return this.creator;
  }

  /** Gets the length of the item 
   * @return length
   */
  public int getLength() {
    return this.length;
  }

  /** Gets the item's availability 
   * @return the item's availability as a boolean
   */
  public boolean getAvailability() {
    return this.available;
    
  }

  /** Returns the item type 
   * @return "Item" 
   */
  public String getType() {
    return "Item";
  }

  /** Gets the item's genre 
   * @return genre 
   */
  public String getGenre() {
    return this.genre;
  }

  /** Formats the item information into a single string (for file I/O use, not user output)
   * @return item 
   */
   @Override
  public String toString() {
    String item = getTitle() + "%" + getCreator() + "%" + getReleaseDate().toString() + "%" + getLanguage() + "%" + getLoanPeriod() + "%" + getSerialNum() + "%" + getType() + "%" +  getAvailability();
    return item;
  }

  /** Formats the item information into a single string for user viewing 
   * @return item
   */
  public String userOutput() {
    String item = String.format("%-26s%-20s%-20s%-10s%-15s%-15s%-15s%-10s\n", getTitle(), getCreator(), getReleaseDate().userOutput(), getLanguage(), getLoanPeriod(), getSerialNum(), getType(), getAvailability()) + "\n";
    return item;
  }

  /** A comparator for item objects. Compares their serial numbers and returns true or false
   * @return boolean 
   */
  public boolean equals(Item item) {
    return (this.serialNum == item.serialNum);
  }

  // end of Item class
}
