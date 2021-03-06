/** This interface will be implemented into the Inventory class for searching functions.
 *
 *01-10-2019
 */
interface Search {

  /** Searches for a title and returns an array of Items 
   * @param title 
   */
  public Item[] searchTitle(String title);

  /** Searches for a creator's name and returns an array of items 
   * @param creator 
   */
  public Item[] searchCreator(String creator);

  /** Searches for a language and returns an array of items 
   * @param language 
   */
  public Item[] searchLanguage(String language);

  /** Searches for a release date range and returns an array of items 
   * @param start
   * @param end 
   */
  public Item[] searchDate(Date start, Date end);
  
  /** Searches for a genre and returns an array of items 
   * @param genre 
   */
  public Item[] searchGenre(String genre);

  /** Finds the index at which an item is in the inventory 
   * @param item 
   */
  public int findItem(Item item);


}
