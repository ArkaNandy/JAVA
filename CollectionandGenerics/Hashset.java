package CollectionandGenerics;
import java.util.Iterator;
/// points to remember
// Hashing takes O(1) to insert, search as well as delete or remove, ie constant time complexity
// Hashing does not entertain redundant data ie 1 won't exist twice


import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
      HashSet<Integer>hs1= new HashSet<>(); /// creation of hashsett    
      
      hs1.add(2);
      hs1.add(8);
      hs1.add(13); /// add() method for appending to the list
      hs1.add(17);
      hs1.add(15);
      hs1.add(19);
      int sum=0;





      if(hs1.contains(2)){ // contains method checks ie searches
        System.out.println("yes");
      }
      else{
        System.out.println("no");

      }

      if(!hs1.contains(6)){
        System.out.println("does not contain");
      }

      hs1.remove(13); // remove method to remove the particular element 
      System.out.println(hs1);
      System.out.println("the size of the hashset is"+ hs1.size()); // size method to return the size of the hashset.

     System.out.println();
    

     Iterator it1= hs1.iterator();
     while(it1.hasNext()){ // hasNext() method returns boolean value ie if there is any value present or not in the list
        System.out.println(it1.next());


     }




      
    }

  
    
}
