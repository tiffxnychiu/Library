/** A Member object with a name, age, phone number, member number, 
 * fines (which defaults to 0), and Items out (which defaults to an empty array of Items).
 *  
 * 2019-01-10
 */
import java.util.*;
import java.util.Arrays;
class Member {

    //state variables
	String name; 
	String phoneNum; 
	int memberNum;
	double fines; 
	Item[] itemsOut;
  int numOfItems;

	
  /** Creates a Member with a name, phone number and member number 
   * @param name 
   * @param phoneNum
   * @param memberNum
   */
  public Member (String name, String phoneNum, int memberNum) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.memberNum = memberNum;
    this.itemsOut = new Item[0];
  }

  /** Formats the member's information into a single string separated by % for file i/o.
   * @return member 
   */
  @Override
  public String toString(){
    String member = "";
    member += getName() + "%" + getPhoneNum() + "%" + getMemberNum() + "%" + getFines();
    return member;
  }

 /** Sets fines owed by the member
   * @param amount owed by the member 
   */
  public void setFines (double amount) {
    this.fines = amount; }

  public String getName() {
    return this.name;
  }

  /** Finds the index at which an item is in the member's items out 
   * @param item 
   * @return index
   */
  public int findItem(Item item) {
  int index = -1;

    for (int i = 0; i < this.itemsOut.length; i++) {
     if (itemsOut[i].getSerialNum() == item.getSerialNum()) {
      index = i;
      i = this.itemsOut.length;    
      }
    }
    return index; }

  /** This is a helper function for the signIn() function in the library class. It takes the item being returned 
   * out of the member's itemsOut array 
   * @param item 
   */
  public void signIn(Item item) {
    int index = findItem(item); //finds the index of the item in the member's items out array 
    if (index >= 0) {
        // replaces the index with the last item in the array 
      this.itemsOut[index] = this.itemsOut[this.itemsOut.length - 1];
        // creates a copy of the array reduced by one index (deleting the item being signed in)
      Item[] itemsCopy = Arrays.copyOf(this.itemsOut, this.itemsOut.length - 1);
     this.itemsOut = itemsCopy;
     numOfItems--;
    }
  }

  /** This is a helper function for the signOut() function in the library class. It puts the item being signed out 
   * into the member's itemsOut array. 
   * @param item
   */
  public void signOut(Item item) { 
    Item[] temp = Arrays.copyOf(this.itemsOut, this.itemsOut.length + 1);   // creates a copy of the array that is one index longer
    temp[temp.length - 1] = item;   // adds the item into the new index 
    this.itemsOut = temp;   // replaces the array with the new array 
    numOfItems++;
  }
	
  /** This method allows the member to pay their fines
   * @param amount which the member is paying back to the library
   */
  public void payFines (double amount){
		if (amount <= this.fines) {
      this.fines -= amount;}

    else {
      System.out.println ("Change due: $" + (amount - this.fines));
      this.fines = 0;}
  }

  /** Sets the name of the member 
   * @param name
   */
  public void setName (String name){
		this.name = name;	 
  }

  /** Sets the phone number of the member 
   * @param phoneNum
   */
  public void setPhoneNum (String phoneNum) {
		this.phoneNum = phoneNum;	
  }

  /** Gets the member's phone number 
   * @return phoneNum 
   */
  public String getPhoneNum() {
    return this.phoneNum;
  }

  /** Gets the member's member number 
   * @return memberNum 
   */
  public int getMemberNum()	{
		return this.memberNum;}

  /** Gets the fines which the member owes 
   * @return fines
   */
  public double getFines() {
    return this.fines;}
  
  /** Gets the items currently signed out by the member 
   * @return itemsOut which returns an array of Items 
   */
  public String getItemsOut()	{
    String items = "~";
   
    for (int i = 0; i < this.itemsOut.length; i++) {
      items += this.itemsOut[i].getSerialNum() + "%"; 
    }
  return items;
  }
  
}
