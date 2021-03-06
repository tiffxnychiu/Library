/** ISC4U1 - 01 Culminating Assignment 
 * 01-17-2019
 *
 * Description: 
 * This program is a library database that can be accessed in different ways by either a Member
 * or an Employee. Information on the library's members, employees, and inventory are saved and 
 * read in the file I/O. The member user can sign out and return items, search the database, 
 * and edit their personal information. The employee can sort the database, add new members and
 * employees, etc. 
 *
 * Group Members: 
 * Tiffany Chiu, Neville Lee, Qaiyum Mohammad, Kishan Pandya
 */
import java.io.*;
import java.util.*;
class Main {  
 
  public static void main(String[] args) throws IOException {
    
    Inventory i = new Inventory();
    Library library = new Library ("Nunya Library", "4162384923", "123 Sesame Street", i);
    library.start();

  }
  
} 
